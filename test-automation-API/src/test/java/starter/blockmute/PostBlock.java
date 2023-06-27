package starter.blockmute;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Token;

public class PostBlock {
    @Step("I set POST api endpoints block user")
    public String setPostApiEndpoints() {
        return BaseUrl.url + "Block";
    }
    @Step("I send POST HTTP request block user")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.admin)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoints());
    }

    @Step("I set POST api endpoints block user invalid")
    public String setPostApiEndpointInvalid() {
        return BaseUrl.url + "Block/10000";
    }
    @Step("I send POST HTTP request block user invalid")
    public void sendPostHTTPRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 11);
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.admin)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointInvalid());
    }
}
