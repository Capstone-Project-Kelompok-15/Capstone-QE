package starter.authentication;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import starter.BaseUrl;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostRegister {
    public String password = "password";

    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public int createRandomAge(){
        Faker faker = new Faker();
        return faker.number().numberBetween(10,20);
    }

    @Step("I set POST endpoints register")
    public String setPostApiEndpoint() {
        return BaseUrl.url + "user";
    }
    @Step("I send POST HTTP request register")
    public void sendPostHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", createRandomName());
        requestBody.put("email", createRandomName() + "@gmail.com");
        requestBody.put("password", password);
        requestBody.put("bio", "Penulis Buku");
        requestBody.put("age", createRandomAge());
        requestBody.put("image_url", "");
        requestBody.put("role", "user");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for register")
    public void validateDataRegister() {
        restAssuredThat(response -> response.body("$", notNullValue()));
        restAssuredThat(response -> response.body("message", Matchers.equalTo("Berhasil membuat pengguna baru")));
    }

    @Step("I send POST HTTP request register invalid")
    public void sendPostHTTPRequestInvalid() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", createRandomName());
        requestBody.put("email", "nafal2@gmail.com");
        requestBody.put("password", password);
        requestBody.put("bio", "Penulis Buku");
        requestBody.put("age", createRandomAge());
        requestBody.put("image_url", "");
        requestBody.put("role", "user");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }
    @Step("I receive valid HTTP response code 400")
    public void validateHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("I receive valid data for response code 400")
    public void validateDataInvalidForResponseCode400() {
        restAssuredThat(response -> response.body("$", notNullValue()));
    }
}
