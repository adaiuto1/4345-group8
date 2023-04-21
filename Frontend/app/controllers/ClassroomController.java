package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import play.mvc.Controller;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class ClassroomController extends Controller {
    @Inject
    HttpExecutionContext ec;

    public CompletionStage<WSResponse> acceptNewTA(String email, Classroom classroom) {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/classes/" + classroom.classID);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode u;
        try {
            String jsonString = objectMapper.writeValueAsString(classroom);
            u = Json.toJson(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
        classroom.ta1 = email;
        classroom.numOpenings = classroom.numOpenings - 1;

        return request.addHeader("Content-Type", "application/json")
                .put(u).thenApplyAsync((WSResponse r) -> {
                    return r;
                }, ec.current());
    }

}
