package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Profile;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


/**
 * @description: user reg/login
 * @author: Swati Bhat
 * @create: 2019-11-16 15:15
 */

public class UserController extends Controller {

    public Result authenticate() {

        System.out.println("In authenticate");
        JsonNode req = request().body().asJson();
        String username = req.get("username").asText();
        String password = req.get("password").asText();

        try {
            User user = User.findByName(username); // ( match where username and password both match )
            if(user!=null && username.equals(user.username) && password.equals(user.password)){
                return ok("true");
            }else{
                return badRequest("false");
            }
        }
        catch (Exception e) {
            return badRequest("false");
        }

    }


    /**
     * When a user register, check if the username is taken
     * save to database if valid
     * POST
     * @return success if valid, fail if already taken
     */
    public Result registerNew() {
        System.out.println("In register");
        JsonNode req = request().body().asJson();
        String username = req.get("username").asText();
        String password = req.get("password").asText();
        String email = req.get("email").asText();
        String question1 = req.get("question1").asText();
        String answer1 = req.get("answer1").asText();
        String question2 = req.get("question2").asText();
        String answer2 = req.get("answer2").asText();

        User u = User.findByName(username);
        ObjectNode result = null;
        if (u == null) {
            System.out.println("new user");
            result = Json.newObject();
            User user = new User();
            user.username=username;
            user.password=password;
            user.email=email;
            user.question1=question1;
            user.answer1=answer1.toLowerCase();
            user.question2=question2;
            user.answer2=answer2.toLowerCase();
            user.save();
            result.put("username", username);
            result.put("email", email);
        }
        return ok(result);
    }

    public Result getUserByUsername(String username){

        User u = User.findByName(username);
        if(u == null){
            return badRequest("user not found");
        }
        else {
            ObjectNode result = Json.newObject();
            Profile p = Profile.findByEmail(u.email);
            System.out.println(p.lastname);
            result.put("username", u.username);
            result.put("password", u.password);
            result.put("email", u.email);
            result.put("status", p.status);
            result.put("firstname", p.firstname);
            result.put("lastname", p.lastname);
            result.put("courses",p.courses);
            result.put("phone",p.phone);
            result.put("degree", p.degree);
            result.put("question1", u.question1);
            result.put("answer1", u.answer1);
            result.put("question2", u.question2);
            result.put("answer2", u.answer2);
            return ok(result);
        }
    }
}
