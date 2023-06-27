package starter.users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetUserId {

    @Step("I set GET api endpoints user")
    public String setApiEndpoints() {
        return BaseUrl.url + "user";
    }
    @Step("I send GET HTTP request user")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(((setApiEndpoints())));
    }
    @Step("I receive valid data for response code 200")
    public void validateDataForResponseCode200() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }


    @Step("I send GET HTTP request user invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given().get(setApiEndpoints());
    }
    @Step("I receive valid HTTP response code 401")
    public void validateHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }
    @Step("I receive valid data for response code 401")
    public void validateDataForResponseCode401() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
