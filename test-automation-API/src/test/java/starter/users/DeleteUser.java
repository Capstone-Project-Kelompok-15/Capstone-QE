package starter.users;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import starter.BaseUrl;
import starter.Token;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteUser {
    @Step("I set DELETE api endpoints delete user")
    public String setDeleteApiEndpoints(){
        return BaseUrl.url + "user";
    }
    @Step("I send DELETE HTTP request delete user")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpoints());
    }
    @Step("I receive valid data for delete user")
    public void validateDataDelete() {
        restAssuredThat(response -> response.body("message", Matchers.equalTo("success delete User by id")));
    }


    @Step("I set DELETE api endpoint delete user invalid")
    public String setDeleteApiEndpointsInvalid(){
        return BaseUrl.url + "user/1";
    }
    @Step("I send DELETE HTTP request delete user invalid")
    public void sendDeleteHttpRequestInvalid(){
        SerenityRest.given().delete(setDeleteApiEndpointsInvalid());
    }
    @Step("I receive valid HTTP response code 405")
    public void validateHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(405));
    }
    @Step("I receive valid data for response code 405")
    public void validateDataInvalidForResponseCode405() {
        Response response = SerenityRest.given().delete(setDeleteApiEndpointsInvalid());
        String content = response.getBody().asString();
        assertEquals("method not allowed", content.trim().toLowerCase());
    }

    //Delete user by admin
    @Step("I set DELETE api endpoints delete user by admin")
    public String setDeleteApiEndpointsByAdmin(){
        return BaseUrl.url + "admin/12";
    }
    @Step("I send DELETE HTTP request delete user by admin")
    public void sendDeleteHttpRequestByAdmin(){
        SerenityRest.given()
                .header("Authorization", Token.admin)
                .delete(setDeleteApiEndpointsByAdmin());
    }
}
