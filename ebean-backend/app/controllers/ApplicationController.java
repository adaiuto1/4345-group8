package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Application;
import play.Logger;
import play.libs.Json;
import play.mvc.*;
import java.util.List;
import java.util.ArrayList;

import java.util.Objects;
import scala.collection.JavaConverters;
import scala.collection.Seq;

public class ApplicationController extends Controller{

    public Result sendApplication(){

        Application newApp = new Application();
        JsonNode req = request().body().asJson();
        String applicantUsername = req.get("applicantUsername").asText();
        String recipientUsername = req.get("recipientUsername").asText();
        String message = req.get("message").asText();
        String className = req.get("className").asText();
        newApp.applicantUsername = applicantUsername;
        newApp.recipientUsername = recipientUsername;
        newApp.message = message;
        newApp.className = className;
        newApp.save();
        ObjectNode result = Json.newObject();
        result.put("applicantUsername", applicantUsername);
        result.put("recipientUsername", recipientUsername);
        result.put("message", message);
        result.put("className", className);
        return(ok(result));

    }


}
