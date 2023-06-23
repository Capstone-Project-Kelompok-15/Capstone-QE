package starter.bookmarks;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.BaseUrl;
import starter.Token;

public class DeleteBookmarks {
    @Step("I set DELETE api endpoints delete bookmark")
    public String setDeleteApiEndpoints(){
        return BaseUrl.url + "bookmark/11";
    }
    @Step("I send DELETE HTTP request delete bookmark")
    public void sendDeleteHttpRequest(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpoints());
    }


    @Step("I set DELETE api endpoints invalid delete bookmark")
    public String setDeleteApiEndpointsInvalid(){
        return BaseUrl.url + "bookmark/";
    }
    @Step("I send DELETE HTTP request invalid delete bookmark")
    public void sendDeleteHttpRequestInvalid(){
        SerenityRest.given()
                .header("Authorization", Token.user)
                .delete(setDeleteApiEndpointsInvalid());
    }
}
