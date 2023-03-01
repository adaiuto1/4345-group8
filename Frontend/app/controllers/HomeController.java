package controllers;

import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

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
        System.out.println("session:" + session("wtf"));
        return ok(views.html.account.passwordChange.render("", session("question1"), session("question2")));
    }

    public CompletionStage<Result> loginHandler() {

        Form<User> loginForm = formFactory.form(User.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.account.login.render(""));  // send parameter like register so that user could know
        }

        return loginForm.get().checkAuthorized()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null && r.asJson().asBoolean()) {
                        System.out.println(r.asJson());
                        // add username to session
                        session("username", loginForm.get().getUsername());   // store username in session for your project
                        session("wtf", loginForm.get().getQuestion1());
                        // redirect to index page, to display all categories
                        return ok(index.render("Welcome!!! " + loginForm.get().getUsername(), loginForm.get().getUsername()));
                    } else {
                        System.out.println("response null");
                        String authorizeMessage = "Incorrect Username or Password ";
                        return badRequest(views.html.account.login.render(authorizeMessage));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> signupHandler() {

        Form<User> registrationForm = formFactory.form(User.class).bindFromRequest();
        if (registrationForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.account.register.render(null));
        }

        return registrationForm.get().registerUser()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("user success");
                        System.out.println(r.asJson());
                        return ok(views.html.account.profileForm.render("", r.asJson().get("email").asText()));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.account.register.render("Username already exists"));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> profileHandler() {
        Form<Profile> registrationForm = formFactory.form(Profile.class).bindFromRequest();
        if (registrationForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.account.profileForm.render(null, null));
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

    public CompletionStage<Result> passwordHandler() {
        Form<PasswordRequest> passwordForm = formFactory.form(PasswordRequest.class).bindFromRequest();
        if (passwordForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.account.profileForm.render(null, null));
        }

        return passwordForm.get().registerPasswordRequest()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("password success");
                        System.out.println(r.asJson());
                        return ok(views.html.index.render("password successfully changed", passwordForm.get().getEmail()));
                    } else {
                        System.out.println("password response null");
                        return badRequest(views.html.account.passwordChange.render("password error", session("question1"), session("question2")));
                    }
                }, ec.current());
    }

}

