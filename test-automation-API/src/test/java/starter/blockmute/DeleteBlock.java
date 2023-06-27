package starter.blockmute;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class DeleteBlock {
    @Step("I set POST api endpoints unblock user")
    public String setDeleteApiEndpoints(){
        return BaseUrl.url + "Block/1";
    }
    @Step("I send POST HTTP request unblock user")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .header("Authorization", Token.admin)
                .delete(setDeleteApiEndpoints());
    }


    @Step("I set POST api endpoints unblock user invalid")
    public String setDeleteApiEndpointsInvalid(){
        return BaseUrl.url + "Block/";
    }
    @Step("I send POST HTTP request unblock user invalid")
    public void sendDeleteHttpRequestInvalid(){
        SerenityRest.given()
                .header("Authorization", Token.admin)
                .delete(setDeleteApiEndpointsInvalid());
    }
}
