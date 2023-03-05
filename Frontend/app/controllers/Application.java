package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class Application {

    public String applicantFirstName;
    public String applicantLastName;
    public String recipientUsername;
    public String className;

    public CompletionStage<WSResponse> sendOpenApplication() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        ObjectNode newApplication = Json.newObject();
        newApplication.put("applicantFirstName", applicantFirstName);
        newApplication.put("applicantLastName", applicantLastName);
        newApplication.put("recipientUsername", recipientUsername);
        newApplication.put("className", this.className);

        WSRequest request = ws.url("http://localhost:9005/sendOpenApplication");
        return request.addHeader("Content-Type", "application/json")
                .post(newApplication)
                .thenApply((WSResponse r) -> {
                    return r;
                });

    }

}
