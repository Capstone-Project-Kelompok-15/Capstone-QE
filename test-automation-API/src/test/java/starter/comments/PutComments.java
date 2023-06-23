package starter.comments;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Token;

public class PutComments {
    public String createRandomContent(){
        Faker faker = new Faker();
        return faker.lorem().paragraph();
    }
    @Step("I set PUT api endpoints update comment")
    public String setPutApiEndpointsUpdateComment() {
        return BaseUrl.url + "comment/6";
    }
    @Step("I send PUT HTTP request update comment")
    public void sendPutHttpRequestUpdateComment() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 11);
        requestBody.put("comment", createRandomContent());
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPutApiEndpointsUpdateComment());
    }


    @Step("I set PUT api endpoints update comment invalid")
    public String setPutApiEndpointsUpdateCommentInvalid() {
        return BaseUrl.url + "comment";
    }
    @Step("I send PUT HTTP request update comment invalid")
    public void sendPutHttpRequestUpdateCommentInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("thread_id", 1);
        requestBody.put("comment", createRandomContent());
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .post(setPutApiEndpointsUpdateCommentInvalid());
    }
}
