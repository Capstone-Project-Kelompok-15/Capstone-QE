package starter.threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class GetThreadsTopic {
    @Step("I set GET api endpoints thread by topic")
    public String setApiEndpointsByTopic() {
        return BaseUrl.url + "threads?topic=1950";
    }
    @Step("I send GET HTTP request thread by topic")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(((setApiEndpointsByTopic())));
    }

    @Step("I set GET api endpoints thread by topic invalid")
    public String setApiEndpointsInvalid() {
        return BaseUrl.url + "threadss?topic=2023";
    }
    @Step("I send GET HTTP request thread by topic invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpointsInvalid());
    }
}
