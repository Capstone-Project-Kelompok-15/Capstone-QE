package starter.bookmarks;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Token;

public class PostBookmarks {
    @Step("I set POST endpoints new bookmark")
    public String setPostApiEndpoints() {
        return BaseUrl.url + "bookmark";
    }
    @Step("I send POST HTTP request new bookmark")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 11);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoints());
    }

    @Step("I set POST endpoints new bookmark invalid")
    public String setPostApiEndpointInvalid() {
        return BaseUrl.url + "bookmark/1";
    }
    @Step("I send POST HTTP request new bookmark invalid")
    public void sendPostHTTPRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointInvalid());
    }
}
