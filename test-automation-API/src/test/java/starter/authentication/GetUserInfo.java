package starter.authentication;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetUserInfo {

    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET api endpoints user info")
    public String setApiEndpoints() {
        return url + "auth/info";
    }
    @Step("I send GET HTTP request user info")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI")
                .get(((setApiEndpoints())));
    }
    @Step("I receive valid data for user info")
    public void validateDataUserInfo() {
        restAssuredThat(response -> response.body("data.ID", equalTo(23668)));
        restAssuredThat(response -> response.body("data.Fullname", equalTo("Firstname Lastname")));
        restAssuredThat(response -> response.body("data.Email", equalTo("someone@mail.com")));
        restAssuredThat(response -> response.body("data.Password", equalTo("123123")));
    }

    @Step("I send GET HTTP request user info invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given().get(setApiEndpoints());
    }
    @Step("I receive valid HTTP response code 401")
    public void validateHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }
    @Step("I receive valid data for response code 401")
    public void validateDataInvalidForResponseCode401() {
        restAssuredThat(response -> response.body("error", equalTo("unauthorized")));
    }
}
