package controllers;

import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;
import scala.collection.JavaConverters;
import scala.collection.Seq;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class ApplicationController extends Controller {
    @Inject
    HttpExecutionContext ec;
    @Inject
    private FormFactory formFactory;
    Seq<String> classSeq;
    WSClient ws = play.test.WSTestClient.newClient(9005);

    public CompletionStage<Result> openApplicationForm() {
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
        System.out.println(session("email"));
        WSRequest request = ws.url("http://localhost:9005/getProfileByEmail/" + session("email"));
        return request.get().thenApplyAsync((WSResponse r) -> {
            Profile p = new Profile();
            p.setFirstName(r.asJson().get("firstname").asText());
            p.lastname = r.asJson().get("lastname").asText();
            p.position = r.asJson().get("position").asText();
            p.affiliation = r.asJson().get("affiliation").asText();
            p.email = r.asJson().get("email").asText();
            p.phone = r.asJson().get("phone").asText();
            p.fax = r.asJson().get("fax").asText();
            p.address = r.asJson().get("address").asText();
            p.state = r.asJson().get("state").asText();
            p.country = r.asJson().get("country").asText();
            p.zip = r.asJson().get("zip").asText();
            p.comments = r.asJson().get("comments").asText();
            p.status = r.asJson().get("status").asText();
            p.degree = r.asJson().get("degree").asText();
            p.startingSemester = r.asJson().get("startingSemester").asText();
            p.gradSemester = r.asJson().get("gradSemester").asText();
            p.courses = r.asJson().get("courses").asText();
            p.title = r.asJson().get("title").asText();
            return ok(views.html.applications.openApplicationForm.render(p, "", classSeq));
        }, ec.current());
    }

    public CompletionStage<Result> ApplicationHandler() {
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

        Form<Application> applicationForm = formFactory.form(Application.class).bindFromRequest();

        if (applicationForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.applications.openApplicationForm.render(null, "cannot submit application", classSeq));
        } else {
            return applicationForm.get().sendOpenApplication()
                    .thenApplyAsync((WSResponse r) -> {
                        if (r.getStatus() == 200 && r.asJson() != null) {
                            System.out.println("application success");
                            System.out.println(r.asJson());
                            System.out.println(session("status"));
                            return ok(views.html.index.render(session("firstname"), session("status")));
                        } else {
                            System.out.println("application response null");
                            return badRequest(views.html.applications.openApplicationForm.render(null, "application response error", classSeq));
                        }
                    }, ec.current());
        }
    }
}
