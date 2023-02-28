package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class Profile {
    public String firstname;
    public String lastname;
    public String position;
    public String affiliation;
    public String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String phone;
    public String fax;
    public String address;
    public String city;
    public String state;
    public String country;
    public String zip;
    public String comments;
    public String status;
    public String degree;
    public String startingSemester;
    public String gradSemester;
    public String courses;
    public String title;

    public CompletionStage<WSResponse> registerProfile() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        ObjectNode newProfile = Json.newObject();
        newProfile.put("firstname", this.firstname);
        newProfile.put("lastname", this.lastname);
        newProfile.put("position", this.position);
        newProfile.put("affiliation", this.affiliation);
        newProfile.put("email", this.email);
        newProfile.put("phone", this.phone);
        newProfile.put("fax", this.fax);
        newProfile.put("address", this.address);
        newProfile.put("city", this.city);
        newProfile.put("state", this.state);
        newProfile.put("country", this.country);
        newProfile.put("zip", this.zip);
        newProfile.put("comments", this.comments);
        newProfile.put("status", this.status);
        newProfile.put("degree", this.degree);
        newProfile.put("startingSemester", this.startingSemester);
        newProfile.put("gradSemester", this.gradSemester);
        newProfile.put("courses", this.courses);
        newProfile.put("title", this.title);
        WSRequest request = ws.url("http://localhost:9005/registerProfile");
        return request.addHeader("Content-Type", "application/json")
                .post(newProfile)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
