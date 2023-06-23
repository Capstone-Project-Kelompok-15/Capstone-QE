package starter.threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Token;

public class PostFollow {
    @Step("I set POST api endpoints follow thread")
    public String setPostApiEndpoints() {
        return BaseUrl.url + "follow";
    }
    @Step("I send POST HTTP request follow thread")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 11);
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoints());
    }

    @Step("I set POST api endpoints follow thread invalid")
    public String setPostApiEndpointInvalid() {
        return BaseUrl.url + "follow/1";
    }
    @Step("I send POST HTTP request follow thread invalid")
    public void sendPostHTTPRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 11);
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointInvalid());
    }
}
