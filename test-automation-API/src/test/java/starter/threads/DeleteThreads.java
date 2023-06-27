package starter.threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Data;
import starter.Token;

public class DeleteThreads {
    @Step("I set DELETE api endpoints delete thread")
    public String setDeleteApiEndpoints(){
        return BaseUrl.url + "threads/" + Data.deletethread1;
    }
    @Step("I send DELETE HTTP request delete thread")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpoints());
    }

    @Step("I set DELETE api endpoints delete thread invalid")
    public String setDeleteApiEndpointsInvalid(){
        return BaseUrl.url + "threads/";
    }
    @Step("I send DELETE HTTP request delete thread invalid")
    public void sendDeleteHttpRequestInvalid(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpointsInvalid());
    }


    //Delete thread by admin
    @Step("I set DELETE api endpoints delete thread by admin")
    public String setDeleteApiEndpointsByAdmin(){
        return BaseUrl.url + "admin/threads/" + Data.deletethread2;
    }
    @Step("I send DELETE HTTP request delete thread by admin")
    public void sendDeleteHttpRequestByAdmin(){
        SerenityRest.given()
                .header("Authorization", Token.admin)
                .delete(setDeleteApiEndpointsByAdmin());
    }
}
