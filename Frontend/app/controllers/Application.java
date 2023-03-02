package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class Application {

    public String applicantUsername;
    public String recipientUsername;
    public String className;
    public String message;

    public CompletionStage<WSResponse> sendApplication() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        ObjectNode newApplication = Json.newObject();
        newApplication.put("applicantUsername", applicantUsername);
        newApplication.put("recipientUsername", recipientUsername);
        newApplication.put("className", this.className);
        newApplication.put("message", this.message);

        WSRequest request = ws.url("http://localhost:9005/sendApplication");
        return request.addHeader("Content-Type", "application/json")
                .post(newApplication)
                .thenApply((WSResponse r) -> {
                    return r;
                });

    }

}
