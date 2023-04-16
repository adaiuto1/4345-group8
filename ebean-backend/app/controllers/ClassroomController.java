package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Classroom;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Content;
import scala.collection.Seq;

import java.util.Arrays;
import java.util.Set;

import static play.mvc.Results.ok;

public class ClassroomController extends Controller {
    public Result createNewClassroom(){
        System.out.println("creating new classroom");
        JsonNode req = request().body().asJson();
        System.out.println(req);
        String classID = req.get("classID").asText();
        String classTitle = req.get("classTitle").asText();
        String location = req.get("location").asText();
        String teacherEmail = req.get("teacherEmail").asText();
        Integer numOpenings = req.get("numOpenings").asInt();
        ObjectNode result = Json.newObject();
        Classroom classroom = new Classroom();
        result.put("classID", classID);
        result.put("classTitle", classTitle);
        result.put("location", location);
        result.put("teacherEmail", teacherEmail);
        result.put("numOpenings", numOpenings);
        classroom.classID = classID;
        classroom.classTitle = classTitle;
        classroom.location = location;
        classroom.teacherEmail = teacherEmail;
        classroom.numOpenings = numOpenings;
        classroom.save();
        return ok(result);
    }
    public Result getClassById(String classID){
        Classroom targetClass = Classroom.findClassroomById(classID);
        ObjectNode result = Json.newObject();
        System.out.println("retreiving class information for" + classID);
        result.put("classID",targetClass.classID);
        result.put("classTitle", targetClass.classTitle);
        result.put("teacherEmail", targetClass.teacherEmail);
        result.put("location",targetClass.location);
        result.put("numOpenings", targetClass.numOpenings);
        System.out.println("retreived class information:");
        System.out.println(result);
        return ok(result);
    }
    public Result getClassByEmail(String email){
        Classroom targetClass = Classroom.findClassroomByEmail(email);
        ObjectNode result = Json.newObject();
        System.out.println("retreiving class information for" + email);
        result.put("classID",targetClass.classID);
        result.put("classTitle", targetClass.classTitle);
        result.put("teacherEmail", targetClass.teacherEmail);
        result.put("location",targetClass.location);
        result.put("numOpenings", targetClass.numOpenings);
        System.out.println("retreived class information:");
        System.out.println(result);
        return ok(result);
    }
    public Result getAllClassrooms(){
        Set<Classroom> classList = Classroom.getAllClassrooms("");


        return ok(Json.toJson(classList.toArray()));

    }
}
