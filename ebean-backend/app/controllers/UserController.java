package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Profile;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


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
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
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

    // Reset password if forgotten
    public Result resetPassword() {
        System.out.println("In reset password");
        JsonNode req = request().body().asJson();
        String question1 = req.get("question1").asText();
        String question2 = req.get("question2").asText();
        String email = req.get("email").asText();

        try {
            Profile profile = Profile.findByEmail(email);
            User user = User.findByID(profile.id); // ( match where username and password both match )

            // Verify that the questions have been correctly answered
            if(user!=null && question1.equals(user.question1) && question2.equals(user.question2)){
                return ok("true");
                // Send email with temporary password
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }
    }

    // Gives user the opportunity to change their password by providing their current password
    public Result changePassword() {
        System.out.println("In change password");
        JsonNode req = request().body().asJson();
        Long id = req.get("id").asLong();
        String oldPassword = req.get("oldPassword").asText();
        String newPassword = req.get("newPassword").asText();

        try {
            User user = User.findByID(id); // ( match where id matches )

            // Verify that the questions have been correctly answered
            if(user!=null && oldPassword.equals(user.password)){
                // Change old password to provided password
                user.password = newPassword;
                return ok("true");
            }else{
                return ok("false");
            }
        }
        catch (Exception e) {
            return ok("false");
        }
    }

}
