package starter.threads;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteThreads {
    @Step("I set DELETE api endpoints delete thread")
    public String setDeleteApiEndpoints(){
        return BaseUrl.url + "threads/20";
    }
    @Step("I send DELETE HTTP request delete thread")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .header("Authorization", Token.admin)
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
        return BaseUrl.url + "admin/threads/21";
    }
    @Step("I send DELETE HTTP request delete thread by admin")
    public void sendDeleteHttpRequestByAdmin(){
        SerenityRest.given()
                .header("Authorization", Token.admin)
                .delete(setDeleteApiEndpointsByAdmin());
    }
}
