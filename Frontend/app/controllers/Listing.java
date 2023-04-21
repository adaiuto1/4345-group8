package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.api.mvc.Request;
import play.data.Form;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

public class Listing {
    private String classID;
    private String message;
    private String prereqs;
    private String teacherEmail;

    public Listing() {
        this.classID = null;
        this.message = "";
        this.prereqs = "";
        this.teacherEmail = "";
    }

    public Listing(String classID, String message, String prereqs, String teacherEmail) {
        this.classID = classID;
        this.message = message;
        this.prereqs = prereqs;
        this.teacherEmail = teacherEmail;

    }

    public CompletionStage<WSResponse> submitListing() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/listings");
        ObjectNode res = Json.newObject();
        res.put("message", this.message);
        res.put("classID", this.classID);
        res.put("prereqs", this.prereqs);
        res.put("teacherEmail", this.teacherEmail);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApplyAsync((WSResponse r) -> {
                    return r;
                });
    }

}
