package controllers;

import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class ApplicationController extends Controller {
    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    public Result openApplication() {
        return ok(views.html.applications.applicationForm.render(""));
    }
    
    public CompletionStage<Result> ApplicationHandler() {
        Form<Application> applicationForm = formFactory.form(Application.class).bindFromRequest();
        if (applicationForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.applications.applicationForm.render("cannot submit application"));
        } else {
            return applicationForm.get().sendApplication()
                    .thenApplyAsync((WSResponse r) -> {
                        if (r.getStatus() == 200 && r.asJson() != null) {
                            System.out.println("appication success");
                            System.out.println(r.asJson());
                            return ok(views.html.index.render("application submitted", null));
                        } else {
                            System.out.println("application response null");
                            return badRequest(views.html.applications.applicationForm.render("application response error"));
                        }
                    }, ec.current());
        }

    }
}
