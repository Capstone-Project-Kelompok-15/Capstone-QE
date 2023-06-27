package starter.threads;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Data;
import starter.Token;

public class PutThreads {

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
    @Step("I set PUT api endpoints update thread")
    public String setPutApiEndpointsUpdateThread() {
        return BaseUrl.url + "threads/" + Data.updatethread1;
    }
    @Step("I send PUT HTTP request update thread")
    public void sendPutHttpRequestUpdateThread() {
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
                .put(setPutApiEndpointsUpdateThread());
    }


    @Step("I set PUT api endpoints update thread invalid")
    public String setPutApiEndpointsUpdateThreadInvalid() {
        return BaseUrl.url + "threads/999";
    }
    @Step("I send PUT HTTP request update thread invalid")
    public void sendPutHttpRequestUpdateThreadInvalid() {
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
                .put(setPutApiEndpointsUpdateThreadInvalid());
    }

    //Update thread by admin
    @Step("I set PUT api endpoints update thread by admin")
    public String setPutApiEndpointsUpdateThreadByAdmin() {
        return BaseUrl.url + "admin/threads/11";
    }
    @Step("I send PUT HTTP request update thread")
    public void sendPutHttpRequestUpdateThreadByAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", createRandomTitle());
        requestBody.put("topic", createRandomTopic());
        requestBody.put("content", createRandomContent());
        requestBody.put("file", "");
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.admin)
                .body(requestBody.toJSONString())
                .put(setPutApiEndpointsUpdateThreadByAdmin());
    }
    @Step("I send PUT HTTP request update thread invalid by admin")
    public void sendPutHttpRequestUpdateThreadInvalidByAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", createRandomTitle());
        requestBody.put("topic", createRandomTopic());
        requestBody.put("content", createRandomContent());
        requestBody.put("file", "");
        requestBody.put("user_id", 1);
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .put(setPutApiEndpointsUpdateThreadByAdmin());
    }
}
