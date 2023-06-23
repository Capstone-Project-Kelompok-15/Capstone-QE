package starter.comments;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetCommentsAll {
    @Step("I set GET api endpoints all comments")
    public String setApiEndpoints() {
        return BaseUrl.url + "comment";
    }
    @Step("I send GET HTTP request all comments")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user).get(setApiEndpoints());
    }

    @Step("I set GET api endpoints all comments invalid")
    public String setApiEndpointsInvalid() {
        return BaseUrl.url + "comments";
    }
    @Step("I send GET HTTP request all comments invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpointsInvalid());
    }
}
