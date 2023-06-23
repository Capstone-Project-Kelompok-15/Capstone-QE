package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.*;
import starter.users.DeleteUser;
import starter.users.GetUserAll;
import starter.users.GetUserId;
import starter.users.PutUser;

public class AuthUserSteps {
    @Steps
    PostRegister Register;
    @Steps
    PostLogin Login;

    //Register user +
    @Given("I set POST api endpoints register user")
    public void setPostApiEndpointsRegister(){
        Register.setPostApiEndpoint();
    }
    @When("I send POST HTTP request register user")
    public void sendPostHttpRequestRegister(){
        Register.sendPostHTTPRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode200(){
        Register.validateHttpResponseCode200();
    }
    @And("I receive valid data for register user")
    public void validateDataRegister(){
        Register.validateDataRegister();
    }

    //Register user -
    @When("I send POST HTTP request register user invalid")
    public void sendPostHttpRequestRegisterInvalid(){
        Register.sendPostHTTPRequestInvalid();
    }
    @Then("I receive valid HTTP response code 400")
    public void receiveHttpResponseCode404(){
        Register.validateHttpResponseCode400();
    }
    @And("I receive valid data for response code 400")
    public void receiveValidDataForResponseCode400(){
        Register.validateDataInvalidForResponseCode400();
    }


    //Login user +
    @Given("I set POST api endpoints login user")
    public void setPostApiEndpointsLoginUser(){
        Login.setPostApiEndpointUser();
    }
    @When("I send POST HTTP request login user")
    public void sendPostHttpRequestLoginUser(){
        Login.sendPostHTTPRequestLoginUser();
    }
    @And("I receive valid data for login user")
    public void validateDataLoginUser(){
        Login.validateDataLoginUser();
    }
    //Login user -
    @When("I send POST HTTP request login user invalid")
    public void sendPostHttpRequestLoginUserInvalid(){
        Login.sendPostHTTPRequestLoginUserInvalid();
    }
}
