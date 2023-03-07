package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Application;
import play.libs.Json;
import play.mvc.*;

public class OpenApplicationController extends Controller{

    public Result sendOpenApplication(){

        Application newApp = new Application();
        JsonNode req = request().body().asJson();
        String studentEmail = req.get("studentEmail").asText();
        String firstChoice = req.get("firstChoice").asText();
        String secondChoice = req.get("secondChoice").asText();
        String thirdChoice = req.get("thirdChoice").asText();
        boolean isAvailable = req.get("isAvailable").asBoolean();
        String avoid = req.get("avoid").asText();

        newApp.studentEmail = studentEmail;
        newApp.firstChoice = firstChoice;
        newApp.secondChoice = secondChoice;
        newApp.thirdChoice = thirdChoice;
        newApp.isAvailable = isAvailable;
        newApp.avoid = avoid;
        System.out.println(newApp);
        newApp.save();

        ObjectNode result = Json.newObject();
        result.put("studentEmail", studentEmail);
        return(ok(result));
    }

}
