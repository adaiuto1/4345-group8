package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Profile;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


public class ProfileController extends Controller{


    public Result registerNew(){
        System.out.println("In register");
        JsonNode req = request().body().asJson();
        String firstname = req.get("firstname").asText();
        String lastname = req.get("lastname").asText();
        String position = req.get("position").asText();
        String affiliation = req.get("affiliation").asText();
        String phone = req.get("phone").asText();
        String fax = req.get("fax").asText();
        String address = req.get("address").asText();
        String email = req.get("email").asText();
        String city = req.get("city").asText();
        String state = req.get("state").asText();
        String country = req.get("country").asText();
        String zip = req.get("zip").asText();
        String comments = req.get("comments").asText();
        String status = req.get("status").asText();
        String degree = req.get("degree").asText();
        String startingSemester = req.get("startingSemester").asText();
        String gradSemester = req.get("gradSemester").asText();
        String courses = req.get("courses").asText();
        String title = req.get("title").asText();

        Profile p = Profile.findByEmail(email);
        ObjectNode result = null;
        if(p == null){
            System.out.println("new profile");
            result = Json.newObject();
            Profile profile = new Profile();
            profile.firstname = firstname;
            profile.lastname = lastname;
            profile.position = position;
            profile.affiliation = affiliation;
            profile.email = email;
            profile.phone = phone;
            profile.fax = fax;
            profile.address = address;
            profile.city = city;
            profile.state = state;
            profile.country = country;
            profile.zip = zip;
            profile.comments = comments;
            profile.status = status;
            profile.degree = degree;
            profile.startingSemester = startingSemester;
            profile.gradSemester = gradSemester;
            profile.courses = courses;
            profile.title = title;
            profile.save();
            result.put("email", email);
        }
        return ok(result);

    }


}
