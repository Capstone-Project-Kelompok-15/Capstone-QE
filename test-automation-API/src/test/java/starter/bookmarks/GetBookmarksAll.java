package starter.bookmarks;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetBookmarksAll {
    @Step("I set GET api endpoints all bookmarks")
    public String setApiEndpoints() {
        return BaseUrl.url + "bookmark";
    }
    @Step("I send GET HTTP request all bookmarks")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpoints());
    }

    @Step("I set GET api endpoints all bookmarks invalid")
    public String setApiEndpointsInvalid() {
        return BaseUrl.url + "bookmarks";
    }
    @Step("I send GET HTTP request all bookmarks invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpointsInvalid());
    }

}
