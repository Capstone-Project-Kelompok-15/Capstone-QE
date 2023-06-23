package starter.threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class GetThreadsTitle {
    @Step("I set GET api endpoints thread by title")
    public String setApiEndpointsByTitle() {
        return BaseUrl.url + "threads?title=1950";
    }
    @Step("I send GET HTTP request thread by title")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(((setApiEndpointsByTitle())));
    }

    @Step("I set GET api endpoints thread by title invalid")
    public String setApiEndpointsInvalid() {
        return BaseUrl.url + "threadss?title=1945";
    }
    @Step("I send GET HTTP request thread by title invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpointsInvalid());
    }
}
