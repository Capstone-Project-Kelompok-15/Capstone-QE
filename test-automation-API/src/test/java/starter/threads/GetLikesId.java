package starter.threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class GetLikesId {
    @Step("I set GET api endpoints like by id")
    public String setApiEndpointsById() {
        return BaseUrl.url + "like";
    }
    @Step("I send GET HTTP request like by id")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(((setApiEndpointsById())));
    }

    @Step("I set GET api endpoints like by id invalid")
    public String setApiEndpointsInvalid() {
        return BaseUrl.url + "like/111212";
    }
    @Step("I send GET HTTP request like by id invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpointsInvalid());
    }
}
