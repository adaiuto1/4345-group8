package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class TAResponseController extends Controller {
    @Inject
    HttpExecutionContext ec;
    @Inject
    private FormFactory formFactory;
    WSClient ws = play.test.WSTestClient.newClient(9005);

    public CompletionStage<Result> openResponseForm(String classID) {
        WSRequest request = ws.url("http://localhost:9005/classes/id/" + classID);
        return request.get().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null) {
                ObjectNode curr = Json.newObject();
                curr.put("email", session("email"));
                curr.put("firstname", session("firstname"));
                curr.put("lastname", session("lastname"));
                curr.put("phone", session("phone"));
                curr.put("degree", session("degree"));
                curr.put("status", session("status"));
                curr.put("courses", session("courses"));
                return ok(views.html.applications.TAResponseForm.render(r.asJson(), curr));
            } else {
                return badRequest("class not found");
            }
        }, ec.current());
    }

    public CompletionStage<Result> TAResponseHandler() {
        Form<TAResponse> TAResponseForm = formFactory.form(TAResponse.class).bindFromRequest();
        return TAResponseForm.get().submitTAResponse()
                .thenApplyAsync((WSResponse r) -> {
                    ObjectNode curr = Json.newObject();
                    curr.put("email", session("email"));
                    curr.put("firstname", session("firstname"));
                    curr.put("lastname", session("lastname"));
                    curr.put("status", session("status"));
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("TA response success");
                        return ok(views.html.index.render(curr, "TA response successful!"));
                    } else {
                        System.out.println("unable to send TA response");
                        return badRequest("unable to send TA response");
                    }
                }, ec.current());
    }
}
