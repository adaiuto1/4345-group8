package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;


public class User {

    private String username;

    private String password;

    public String email;

    public String question1;

    public String answer1;

    public String question2;

    public String answer2;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuestion1() {
        return this.question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public CompletionStage<WSResponse> checkAuthorized() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/login");
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password", this.password);
        res.put("email", this.email);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    public CompletionStage<WSResponse> registerUser() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password", this.password);
        res.put("email", this.email);
        res.put("question1", this.question1);
        res.put("answer1", this.answer1);
        res.put("question2", this.question2);
        res.put("answer2", this.answer2);
        res.put("reset", this.password);
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
        WSRequest request = ws.url("http://localhost:9005/signup");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }


}
