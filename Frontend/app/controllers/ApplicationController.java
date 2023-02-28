package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class ApplicationController extends Controller {
    public Result create(Integer jobID) {
        return ok(views.html.applicationForm.render());
    }
}
