package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

import static play.mvc.Controller.session;

public class Application {

    public String studentEmail;
    public String firstChoice;
    public String secondChoice;
    public String thirdChoice;
    public String avoid;
    public boolean isAvailable;

    public Application() {
    }

    public CompletionStage<WSResponse> sendOpenApplication() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        ObjectNode newApplication = Json.newObject();
        newApplication.put("studentEmail", studentEmail);
        newApplication.put("firstChoice", firstChoice);
        newApplication.put("secondChoice", secondChoice);
        newApplication.put("thirdChoice", thirdChoice);
        newApplication.put("isAvailable", true);
        newApplication.put("avoid", avoid);
        System.out.println(newApplication);
        WSRequest request = ws.url("http://localhost:9005/sendOpenApplication");
        return request.addHeader("Content-Type", "application/json")
                .post(newApplication)
                .thenApply((WSResponse r) -> {
                    return r;
                });

    }

}
