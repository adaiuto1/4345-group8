package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import play.mvc.Result;
import play.test.WSTestClient;

import java.util.concurrent.CompletionStage;

public class TAResponse {
    public String applicantEmail;
    private String classID;
    private String teacherEmail;
    private String coursework;
    private String applicantMessage;

    public CompletionStage<WSResponse> getClassInformation(String classID) {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        ObjectNode res = Json.newObject();
        res.put("classID", this.classID);
        WSRequest request = ws.url("http://localhost:9005/classes/" + classID);
        return request.addHeader("Content-Type", "application/json")
                .get()
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    public CompletionStage<WSResponse> submitTAResponse() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        ObjectNode res = Json.newObject();
        res.put("applicantEmail", this.applicantEmail);
        res.put("classID", this.classID);
        res.put("teacherEmail", this.teacherEmail);
        res.put("coursework", this.coursework);
        res.put("applicantMessage", this.applicantMessage);
        WSRequest request = ws.url("http://localhost:9005/sendTAResponse");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApplyAsync((WSResponse r) -> {
                    return r;
                });
    }
}
