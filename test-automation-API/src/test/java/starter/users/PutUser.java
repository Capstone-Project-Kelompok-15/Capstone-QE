package starter.users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import starter.BaseUrl;
import starter.Token;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class PutUser {

    //Update user
    @Step("I set PUT api endpoints update user")
    public String setPutApiEndpointsUpdateUser() {
        return BaseUrl.url + "user";
    }
    @Step("I send PUT HTTP request update user")
    public void sendPutHttpRequestUpdateUser() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "adi");
        requestBody.put("email", "adi@gmail.com");
        requestBody.put("password", "adi123");
        requestBody.put("bio", "Pejuang Tangguh");
        requestBody.put("age", 12);
        requestBody.put("image_url", "");
        requestBody.put("role", "user");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.user)
                .body(requestBody.toJSONString())
                .put(setPutApiEndpointsUpdateUser());
    }

    @Step("I send PUT HTTP request update user invalid")
    public void sendPutHttpRequestUpdateUserInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "adi");
        requestBody.put("email", "adi@gmail.com");
        requestBody.put("password", "adi123");
        requestBody.put("bio", "Pejuang Tangguh");
        requestBody.put("age", 12);
        requestBody.put("image_url", "");
        requestBody.put("role", "user");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .put(setPutApiEndpointsUpdateUser());
    }
    @Step("I receive valid HTTP response code 500")
    public void validateHttpResponseCode500() {
        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("I receive valid data for response code 500")
    public void validateDataForResponseCode500() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }

    //Update user by admin
    @Step("I set PUT api endpoints update user by admin")
    public String setPutApiEndpointsUpdateUserByAdmin() {
        return BaseUrl.url + "admin/2";
    }
    @Step("I send PUT HTTP request update user by admin")
    public void sendPutHttpRequestUpdateUserByAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("photo", "");
        requestBody.put("username", "gilang");
        requestBody.put("email", "gilang@gmail.com");
        requestBody.put("password", "gilang123");
        requestBody.put("bio", "Pejuang Kuat");
        requestBody.put("role", "user");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.admin)
                .body(requestBody.toJSONString())
                .put(setPutApiEndpointsUpdateUserByAdmin());
    }
    @Step("I set PUT api endpoints update user invalid by admin")
    public String setPutApiEndpointsUpdateUserInvalidByAdmin() {
        return BaseUrl.url + "admin/1";
    }
    @Step("I send PUT HTTP request update user invalid by admin")
    public void sendPutHttpRequestUpdateUserInvalidByAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("photo", "");
        requestBody.put("username", "gilang");
        requestBody.put("email", "gilang@gmail.com");
        requestBody.put("password", "gilang123");
        requestBody.put("bio", "Pejuang Kuat");
        requestBody.put("role", "user");
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", Token.admin)
                .body(requestBody.toJSONString())
                .put(setPutApiEndpointsUpdateUserInvalidByAdmin());
    }
}
