package starter.threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Token;

public class PostLikes {
    @Step("I set POST endpoints new like")
    public String setPostApiEndpoints() {
        return BaseUrl.url + "threads/1/like";
    }
    @Step("I send POST HTTP request new like")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 11);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoints());
    }

    @Step("I set POST endpoints new like invalid")
    public String setPostApiEndpointInvalid() {
        return BaseUrl.url + "like";
    }
    @Step("I send POST HTTP request new like invalid")
    public void sendPostHTTPRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 11);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointInvalid());
    }
}
