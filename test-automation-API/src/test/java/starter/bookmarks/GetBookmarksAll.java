package starter.bookmarks;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

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
