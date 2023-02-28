package controllers;
import models.User;
import play.Logger;
import play.libs.Json;
import play.mvc.*;
import java.util.List;
import java.util.ArrayList;

import scala.collection.JavaConverters;
import scala.collection.Seq;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    public Result index() {
        return ok(Json.toJson("Welcome to backend!"));
    }
    public Result info(){
        Long id = 5L;
        User user = User.find.byId(id);
        List<String> infos = new ArrayList<>();
        infos.add("Username: " + user.username);
        infos.add("Password: " + user.password);
        infos.add("email: " + user.email);
        Seq<String> infoSeq = JavaConverters.asScalaBufferConverter(infos).asScala().toSeq();
        Logger.info("infos" + infoSeq);
        return ok(views.html.info.render(infoSeq));
    }
}
