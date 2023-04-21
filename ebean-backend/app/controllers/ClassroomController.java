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
import java.util.HashMap;
import java.util.Map;
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
        Set<Classroom> classList = Classroom.getAllClassrooms();
        return ok(Json.toJson(classList.toArray()));
    }
    public Result addTAToClassroom(String id, String studentEmail) {
        Classroom target = Classroom.find
                .where()
                .eq("classID", id)
                .findUnique();
        Map<String, String> currTas = new HashMap<>();
        currTas.put("ta1", target.ta1);
        currTas.put("ta2", target.ta2);
        currTas.put("ta3", target.ta3);
        currTas.put("ta4", target.ta4);
        currTas.put("ta5", target.ta5);

        assert target != null;
        if (currTas.containsValue(studentEmail)) {
            return badRequest("student already a TA");
        } else {

            if (target.ta1 == null) {
                target.ta1 = studentEmail;
            } else if (target.ta2 == null) {
                target.ta2 = studentEmail;
            } else if (target.ta3 == null) {
                target.ta3 = studentEmail;
            } else if (target.ta4 == null) {
                target.ta4 = studentEmail;
            } else if (target.ta5 == null) {
                target.ta5 = studentEmail;
            }
            target.save();
            return ok();
        }

    }
}
