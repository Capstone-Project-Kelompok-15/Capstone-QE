package starter.comments;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class GetCommentsId {
    @Step("I set GET api endpoints comment by id")
    public String setApiEndpointsById() {
        return BaseUrl.url + "comment/6";
    }
    @Step("I send GET HTTP request comment by id")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(((setApiEndpointsById())));
    }

    @Step("I set GET api endpoints comment by id invalid")
    public String setApiEndpointsInvalid() {
        return BaseUrl.url + "comment/111212";
    }
    @Step("I send GET HTTP request comment by id invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpointsInvalid());
    }
}
