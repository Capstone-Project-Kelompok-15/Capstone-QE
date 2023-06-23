package starter.comments;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Token;

public class PostComments {
    public String createRandomContent(){
        Faker faker = new Faker();
        return faker.lorem().paragraph();
    }

    @Step("I set POST endpoints new comment")
    public String setPostApiEndpoints() {
        return BaseUrl.url + "comment";
    }
    @Step("I send POST HTTP request new comment")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 11);
        requestBody.put("content", createRandomContent());
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoints());
    }

    @Step("I set POST endpoints new comment invalid")
    public String setPostApiEndpointInvalid() {
        return BaseUrl.url + "comment/1";
    }
    @Step("I send POST HTTP request new comment invalid")
    public void sendPostHTTPRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 1);
        requestBody.put("content", createRandomContent());
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointInvalid());
    }
}
