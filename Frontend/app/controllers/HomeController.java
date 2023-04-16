package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import scala.collection.JavaConverters;
import scala.collection.Seq;
import views.html.*;

import javax.inject.Inject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;
    WSClient ws = play.test.WSTestClient.newClient(9005);

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    Seq<String> classSeq;

    /**
     * Index page
     */
    public Result index() {
        return ok(views.html.account.login.render(""));
    }


    /**
     * Signup page
     */
    public Result signup() {
        return ok(views.html.account.register.render(null));
    }

    /*
    password change page
     */
    public Result changePassword() {
        return ok(views.html.account.passwordChange.render("", session("question1"), session("question2")));
    }

    public CompletionStage<Result> loginHandler() {
        Form<User> loginForm = formFactory.form(User.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.account.login.render(""));  // send parameter like register so that user could know
        }

        return loginForm.get().getUserByUsername(loginForm.get().getUsername())
                .thenApplyAsync((WSResponse r) -> {
                    System.out.println(r.asJson());
                    if (r.getStatus() == 200) {
                        String sessionEmail = r.asJson().get("email").asText();
                        String sessionStatus = r.asJson().get("status").asText();
                        String sessionFirstName = r.asJson().get("firstname").asText();
                        session("email", sessionEmail);
                        session("status", sessionStatus);
                        session("firstname", sessionFirstName);
                        session("lastname", r.asJson().get("lastname").asText());
                        session("phone", r.asJson().get("phone").asText());
                        session("degree", r.asJson().get("degree").asText());
                        session("courses", r.asJson().get("courses").asText());
                        ObjectNode curr = Json.newObject();
                        curr.put("email", session("email"));
                        curr.put("firstname", session("firstname"));
                        curr.put("lastname", session("lastname"));
                        curr.put("phone", session("phone"));
                        curr.put("degree", session("degree"));
                        curr.put("status", session("status"));
                        curr.put("courses", session("courses"));
                        return ok(views.html.index.render(curr, ""));
                    } else {
                        System.out.println("response null");
                        String authorizeMessage = "Incorrect Username or Password ";
                        return badRequest(views.html.account.login.render(authorizeMessage));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> signupHandler() {
        List<String> classes = new ArrayList<String>();
        classes.add("CS4345");
        classes.add("CS3353");
        classes.add("MATH3315");
        classes.add("ENGR1304");
        classes.add("MATH3303");
        classes.add("PHYS1304");
        classes.add("CS3330");
        classes.add("CS2381");
        classSeq = JavaConverters.asScalaBufferConverter(classes).asScala().toSeq();

        Form<User> registrationForm = formFactory.form(User.class).bindFromRequest();
        if (registrationForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.account.register.render(null));
        }

        return registrationForm.get().registerUser()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("user success");
                        System.out.println(r.asJson());
                        return ok(views.html.account.profileForm.render("", r.asJson().get("email").asText(), classSeq));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.account.register.render("Username already exists"));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> profileHandler() {
        Form<Profile> registrationForm = formFactory.form(Profile.class).bindFromRequest();
        if (registrationForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.account.profileForm.render(null, null, classSeq));
        }

        return registrationForm.get().registerProfile()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("profile success");
                        System.out.println(r.asJson());
                        return ok(views.html.account.login.render(""));
                    } else {
                        System.out.println("profile response null");
                        return badRequest(views.html.account.register.render("profile error"));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> editProfile() {
        List<String> classes = new ArrayList<String>();
        classes.add("CS4345");
        classes.add("CS3353");
        classes.add("MATH3315");
        classes.add("ENGR1304");
        classes.add("MATH3303");
        classes.add("PHYS1304");
        classes.add("CS3330");
        classes.add("CS2381");
        classSeq = JavaConverters.asScalaBufferConverter(classes).asScala().toSeq();

        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/getProfileByEmail/" + session("email"));
        return request.addHeader("Content-Type", "application/json")
                .get().thenApplyAsync((WSResponse r) -> {
                    return ok(views.html.account.editProfileForm.render(r.asJson(), classSeq));
                }, ec.current());
    }

    public CompletionStage<Result> editProfileHandler() {
        Form<Profile> editProfileForm = formFactory.form(Profile.class).bindFromRequest();
        return editProfileForm.get().updateProfileInfo()
                .thenApplyAsync((WSResponse r) -> {
                    session("firstname", r.asJson().get("firstname").asText());
                    ObjectNode curr = Json.newObject();
                    curr.put("email", session("email"));
                    curr.put("firstname", session("firstname"));
                    curr.put("lastname", session("lastname"));
                    curr.put("phone", session("phone"));
                    curr.put("degree", session("degree"));
                    curr.put("status", session("status"));
                    curr.put("courses", session("courses"));
                    return ok(views.html.index.render(curr, "profile sucessfully updated"));
                }, ec.current());
    }

    public CompletionStage<Result> passwordHandler() {
        Form<PasswordRequest> passwordForm = formFactory.form(PasswordRequest.class).bindFromRequest();
        if (passwordForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.account.passwordChange.render("form has errors", session("question1"), session("question2")));
        }
        return passwordForm.get().registerPasswordRequest()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("password success");
                        System.out.println(r.asJson());
                        ObjectNode curr = Json.newObject();
                        curr.put("email", session("email"));
                        curr.put("firstname", session("firstname"));
                        curr.put("lastname", session("lastname"));
                        curr.put("phone", session("phone"));
                        curr.put("degree", session("degree"));
                        curr.put("status", session("status"));
                        curr.put("courses", session("courses"));
                        return ok(views.html.index.render(curr, "password successfully changed"));
                    } else {
                        System.out.println("password response null");
                        return badRequest(views.html.account.passwordChange.render("password error", session("question1"), session("question2")));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> openProfileView(String profile) {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/getProfileByEmail/" + profile);
        return request.addHeader("Content-Type", "application/json")
                .get().thenApplyAsync((WSResponse r) -> {
                    return ok(views.html.account.profileView.render(r.asJson()));
                }, ec.current());
    }

    public CompletionStage<Result> openPositionViewer() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/classes");
        return request.addHeader("Content-Type", "application/json")
                .get().thenApplyAsync((WSResponse r) -> {
                    String classString = r.asJson().toString();
                    List<Classroom> classList = new ArrayList<Classroom>();
                    ObjectMapper objectMapper = new ObjectMapper();
                    try {
                        JsonNode classNodes = objectMapper.readTree(classString);
                        for (JsonNode classNode : classNodes) {
                            classList.add(objectMapper.convertValue(classNode, Classroom.class));
                        }

                    } catch (IOException e) {

                        throw new RuntimeException(e);
                    }
                    return ok(views.html.applications.PositionViewer.render(classList));
                }, ec.current());
    }
}

