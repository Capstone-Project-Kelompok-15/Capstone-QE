package starter.threads;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Token;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class PostTheads {

    public String createRandomTitle(){
        Faker faker = new Faker();
        return faker.book().title();
    }

    public String createRandomTopic(){
        Faker faker = new Faker();
        return faker.book().genre();
    }

    public String createRandomContent(){
        Faker faker = new Faker();
        return faker.lorem().paragraph();
    }

    @Step("I set POST endpoints new thread")
    public String setPostApiEndpoints() {
        return BaseUrl.url + "threads";
    }
    @Step("I send POST HTTP request new thread")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", createRandomTitle());
        requestBody.put("topic", createRandomTopic());
        requestBody.put("content", createRandomContent());
        requestBody.put("file", "");
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpoints());
    }

    @Step("I set POST endpoints new thread invalid")
    public String setPostApiEndpointInvalid() {
        return BaseUrl.url + "threads/1";
    }
    @Step("I send POST HTTP request new thread invalid")
    public void sendPostHTTPRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", createRandomTitle());
        requestBody.put("topic", createRandomTopic());
        requestBody.put("content", createRandomContent());
        requestBody.put("file", "");
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointInvalid());
    }
}
