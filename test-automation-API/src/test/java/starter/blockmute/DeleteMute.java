package starter.blockmute;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class DeleteMute {
    @Step("I set POST api endpoints unmute user")
    public String setDeleteApiEndpoints(){
        return BaseUrl.url + "Mute/1";
    }
    @Step("I send POST HTTP request unmute user")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .header("Authorization", Token.admin)
                .delete(setDeleteApiEndpoints());
    }


    @Step("I set POST api endpoints unmute user invalid")
    public String setDeleteApiEndpointsInvalid(){
        return BaseUrl.url + "Mute/10000";
    }
    @Step("I send POST HTTP request unmute user invalid")
    public void sendDeleteHttpRequestInvalid(){
        SerenityRest.given()
                .header("Authorization", Token.admin)
                .delete(setDeleteApiEndpointsInvalid());
    }
}
