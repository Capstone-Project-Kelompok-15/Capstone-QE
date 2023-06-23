package starter.users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class GetUserAll {
    @Step("I set GET api endpoints all users")
    public String setApiEndpoints() {
        return BaseUrl.url + "Alluser";
    }
    @Step("I send GET HTTP request all users")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpoints());
    }

    @Step("I set GET api endpoints all users invalid")
    public String setApiEndpointsInvalid() {
        return BaseUrl.url + "Allusers";
    }
    @Step("I send GET HTTP request all users invalid")
    public void sendGetHttpRequestInvalid() {
        SerenityRest.given()
                .header("Authorization", Token.user)
                .get(setApiEndpointsInvalid());
    }

    //Get all users by admin
    @Step("I set GET api endpoints all users by admin")
    public String setApiEndpointsGetAllUserByAdmin() {
        return BaseUrl.url + "admin";
    }
    @Step("I send GET HTTP request all users by admin")
    public void sendGetHttpRequestByAdmin() {
        SerenityRest.given()
                .header("Authorization", Token.admin)
                .get(setApiEndpointsGetAllUserByAdmin());
    }

}
