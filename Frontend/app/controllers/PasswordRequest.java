package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class PasswordRequest {
    public String email;
    public String question1;
    public String answer1;
    public String question2;
    public String answer2;
    public String newPassword;
    public String confirmNewPassword;

    public String getEmail() {
        return email;
    }

    public CompletionStage<WSResponse> registerPasswordRequest() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        ObjectNode newPwRq = Json.newObject();
        newPwRq.put("email", this.email);
        newPwRq.put("question1", this.question1);
        newPwRq.put("answer1", this.answer1);
        newPwRq.put("question2", this.question2);
        newPwRq.put("answer2", this.answer2);
        newPwRq.put("newPassword", this.newPassword);
        newPwRq.put("confirmNewPassword", this.confirmNewPassword);
        WSRequest request = ws.url("http://localhost:9005/resetPassword");
        return request.addHeader("Content-Type", "application/json")
                .post(newPwRq)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }
}
