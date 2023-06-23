package starter.threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class GetThreadsId {
    @Step("I set GET api endpoints thread by id")
    public String setApiEndpointsById() {
        return BaseUrl.url + "threads/11";
    }
    @Step("I send GET HTTP request thread by id")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(((setApiEndpointsById())));
    }

    @Step("I set GET api endpoints thread by id invalid")
    public String setApiEndpointsInvalid() {
        return BaseUrl.url + "threads/111212";
    }
    @Step("I send GET HTTP request thread by id invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpointsInvalid());
    }

}
