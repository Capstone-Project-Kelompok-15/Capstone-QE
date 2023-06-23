package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import starter.BaseUrl;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class PostLogin {

    //Login Admin
    @Step("I set POST endpoints login admin")
    public String setPostApiEndpointAdmin() {
        return BaseUrl.url + "login/admin";
    }
    @Step("I send POST HTTP request login admin")
    public void sendPostHTTPRequestLoginAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "admin123");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointAdmin());
    }
    @Step("I receive valid data for login admin")
    public void validateDataLoginAdmin() {
        restAssuredThat(response -> response.body("message", equalTo("Login Admin Sukses")));
    }

    @Step("I send POST HTTP request login admin invalid")
    public void sendPostHTTPRequestAdminInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "admin123");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointAdmin());
    }
    @Step("I receive valid data for response code 400 login admin")
    public void validateDataInvalidForResponseCode400LoginAdmin() {
        restAssuredThat(response -> response.body("error", Matchers.equalTo("invalid username or password")));
    }

    //Login User
    @Step("I set POST endpoints login user")
    public String setPostApiEndpointUser() {
        return BaseUrl.url + "login";
    }
    @Step("I send POST HTTP request login user")
    public void sendPostHTTPRequestLoginUser() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "nafal@gmail.com");
        requestBody.put("password", "nafal123");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointUser());
    }
    @Step("I receive valid data for login user")
    public void validateDataLoginUser() {
        restAssuredThat(response -> response.body("message", equalTo("success Login")));
    }

    @Step("I send POST HTTP request login user invalid")
    public void sendPostHTTPRequestLoginUserInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "admin123");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointUser());
    }
//    @Step("I receive valid data for response code 400 login user")
//    public void validateDataInvalidForResponseCode400LoginUser() {
//        restAssuredThat(response -> response.body("error", Matchers.equalTo("invalid username or password")));
//    }
}