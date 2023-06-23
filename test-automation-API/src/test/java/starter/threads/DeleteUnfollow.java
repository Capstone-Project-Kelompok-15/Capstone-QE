package starter.threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class DeleteUnfollow {
    @Step("I set POST api endpoints unfollow thread")
    public String setDeleteApiEndpoints(){
        return BaseUrl.url + "follow/11";
    }
    @Step("I send POST HTTP request unfollow thread")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpoints());
    }


    @Step("I set POST api endpoints unfollow thread invalid")
    public String setDeleteApiEndpointsInvalid(){
        return BaseUrl.url + "follow/";
    }
    @Step("I send POST HTTP request unfollow thread invalid")
    public void sendDeleteHttpRequestInvalid(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpointsInvalid());
    }
}
