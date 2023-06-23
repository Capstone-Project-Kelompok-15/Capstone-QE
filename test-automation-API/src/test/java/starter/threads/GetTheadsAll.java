package starter.threads;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTheadsAll{
    @Step("I set GET api endpoints all threads")
    public String setApiEndpoints() {
        return BaseUrl.url + "Allthreads";
    }
    @Step("I send GET HTTP request all threads")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpoints());
    }

    @Step("I set GET api endpoints all threads invalid")
    public String setApiEndpointsInvalid() {
        return BaseUrl.url + "Allthreadss";
    }
    @Step("I send GET HTTP request all threads invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpointsInvalid());
    }
    @Step("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I receive valid data for response code 404")
    public void validateDataInvalidForResponseCode404() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
    //Get all threads by admin
    @Step("I set GET api endpoints all threads by admin")
    public String setApiEndpointsByAdmin() {
        return BaseUrl.url + "admin/threads";
    }
    @Step("I send GET HTTP request all threads by admin")
    public void sendGetHttpRequestByAdmin() {
        SerenityRest.given()
                .header("Authorization", Token.admin)
                .get(setApiEndpointsByAdmin());
    }
    @Step("I send GET HTTP request all threads invalid by admin")
    public void sendGetHttpRequestInvalidByAdmin() {
        SerenityRest.given()
                .get(setApiEndpointsByAdmin());
    }
}
