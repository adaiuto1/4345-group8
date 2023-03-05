package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Application;
import play.libs.Json;
import play.mvc.*;

public class OpenApplicationController extends Controller{

    public Result sendOpenApplication(){

        Application newOpenApp = new Application();
        JsonNode req = request().body().asJson();
        String applicantUsername = req.get("applicantUsername").asText();
        String recipientUsername = req.get("recipientUsername").asText();
        String message = req.get("message").asText();
        String className = req.get("className").asText();
        newOpenApp.applicantUsername = applicantUsername;
        newOpenApp.recipientUsername = recipientUsername;
        newOpenApp.message = message;
        newOpenApp.className = className;
        newOpenApp.save();
        ObjectNode result = Json.newObject();
        result.put("applicantUsername", applicantUsername);
        result.put("recipientUsername", recipientUsername);
        result.put("message", message);
        result.put("className", className);
        return(ok(result));

    }


}
