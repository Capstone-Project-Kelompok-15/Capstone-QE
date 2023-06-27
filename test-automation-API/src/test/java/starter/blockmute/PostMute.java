package starter.blockmute;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Token;

public class PostMute {
    @Step("I set POST api endpoints mute user")
    public String setPostApiEndpoints() {
        return BaseUrl.url + "Mute";
    }
    @Step("I send POST HTTP request mute user")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.admin)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoints());
    }

    @Step("I set POST api endpoints mute user invalid")
    public String setPostApiEndpointInvalid() {
        return BaseUrl.url + "Mute/1";
    }
    @Step("I send POST HTTP request mute user invalid")
    public void sendPostHTTPRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.admin)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointInvalid());
    }
}
