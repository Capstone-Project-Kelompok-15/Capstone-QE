package starter.comments;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class DeleteComments {
    @Step("I set DELETE api endpoints delete comment")
    public String setDeleteApiEndpoints(){
        return BaseUrl.url + "comment/14";
    }
    @Step("I send DELETE HTTP request delete comment")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpoints());
    }


    @Step("I set DELETE api endpoints delete comment invalid")
    public String setDeleteApiEndpointsInvalid(){
        return BaseUrl.url + "comment/";
    }
    @Step("I send DELETE HTTP request delete comment invalid")
    public void sendDeleteHttpRequestInvalid(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpointsInvalid());
    }
}
