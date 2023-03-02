package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Objects;

public class PasswordController extends Controller{

    public Result resetPassword(){
        JsonNode req = request().body().asJson();
        String email = req.get("email").asText();
        String newPassword = req.get("newPassword").asText();
        String confirmNewPassword = req.get("confirmNewPassword").asText();
        String question1 = req.get("question1").asText();
        String answer1 = req.get("answer1").asText();
        String question2 = req.get("question2").asText();
        String answer2 = req.get("answer2").asText();
        System.out.println("RECEIVED: " + email);
        User targetUser = User.findByEmail(email);
        System.out.println(targetUser.question1 + targetUser.question2 + targetUser.answer1 + targetUser.answer2);
        System.out.println(question1 + question2 + answer1 + answer2);
        if(Objects.equals(question1, targetUser.question1) &&
                Objects.equals(question2, targetUser.question2) &&
                Objects.equals(answer1, targetUser.answer1) &&
                Objects.equals(answer2, targetUser.answer2)){
                if(!Objects.equals(newPassword, confirmNewPassword)){
                    System.out.println("passwords dont match");
                    return badRequest("false");
                }
                else{
                    System.out.println("replacing");
                    User newUser = new User();
                    newUser.username = targetUser.username;
                    newUser.email = targetUser.email;
                    newUser.password = newPassword;
                    newUser.question1 = targetUser.question1;
                    newUser.answer1 = targetUser.answer1;
                    newUser.question2 = targetUser.question2;
                    newUser.answer2 = targetUser.answer2;
                    targetUser.delete();
                    newUser.save();
                    ObjectNode result = null;
                    result = Json.newObject();
                    result.put("username", newUser.username);
                    result.put("password", newUser.password);
                    result.put("email", newUser.password);
                    return ok(result);
                }
        }
        System.out.println("questions wrong");
        return badRequest("false");
    }

}
