package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Classroom;
import models.TAResponse;
import play.libs.Json;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;

public class TAResponseController extends Controller{


    public Result createNewTAResponse(){
        TAResponse newApp = new TAResponse();
        JsonNode req = request().body().asJson();
        String applicantEmail = req.get("applicantEmail").asText();
        String teacherEmail = req.get("teacherEmail").asText();
        String coursework = req.get("coursework").asText();
        String classID = req.get("classID").asText();
        String applicantMessage = req.get("applicantMessage").asText();
        newApp.applicantEmail = applicantEmail;
        newApp.teacherEmail = teacherEmail;
        newApp.coursework = coursework;
        newApp.classID = classID;
        newApp.applicantMessage = applicantMessage;
        newApp.save();
        ObjectNode result = Json.newObject();
        result.put("applicantEmail", applicantEmail);
        result.put("teacherEmail", teacherEmail);
        result.put("coursework", coursework);
        result.put("classID", classID);
        result.put("applicantMessage", applicantMessage);
        return ok(result);
    }

}
