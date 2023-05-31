package starter.authentication;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostRegister {


    public String name = createRandomName();
    public String password = "password";

    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints register")
    public String setPostApiEndpoint() {
        return url + "auth/register";
    }
    @Step("I send POST HTTP request register")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", createRandomName() + "@gmail.com");
        requestBody.put("password", password);
        requestBody.put("fullname", createRandomName());
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }
    @Step("I receive valid data for register")
    public void validateDataRegister() {
        restAssuredThat(response -> response.body("$", notNullValue()));
        restAssuredThat(response -> response.body("data.Password", equalTo(password)));
    }

    @Step("I set POST endpoints register invalid")
    public String setPostApiEndpointInvalid() {
        return url + "auth/register";
    }
    @Step("I send POST HTTP request register invalid")
    public void sendPostHTTPRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "123123");
        requestBody.put("fullname", "Firstname Lastname");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpointInvalid());
    }
    @Step("I receive valid HTTP response code 400")
    public void validateHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("I receive valid data for response code 400")
    public void validateDataInvalidForResponseCode400() {
        restAssuredThat(response -> response.body("error", Matchers.equalTo("ERROR: duplicate key value violates unique constraint \"users_email_key\" (SQLSTATE 23505)")));
    }
}
