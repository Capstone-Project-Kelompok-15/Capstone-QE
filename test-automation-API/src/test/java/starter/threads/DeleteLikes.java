package starter.threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class DeleteLikes {
    @Step("I set DELETE api endpoints delete like")
    public String setDeleteApiEndpoints(){
        return BaseUrl.url + "threads/1/like";
    }
    @Step("I send DELETE HTTP request delete like")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpoints());
    }


    @Step("I set DELETE api endpoints delete like invalid")
    public String setDeleteApiEndpointsInvalid(){
        return BaseUrl.url + "like/";
    }
    @Step("I send DELETE HTTP request delete like invalid")
    public void sendDeleteHttpRequestInvalid(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpointsInvalid());
    }
}
