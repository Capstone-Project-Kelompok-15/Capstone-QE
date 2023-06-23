package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.GetUserInfo;
import starter.authentication.PostLogin;
import starter.authentication.PostRegister;

public class AuthSteps {
    @Steps
    PostRegister Register;
    @Steps
    PostLogin Login;
    @Steps
    GetUserInfo GetUserInfo;

    //Register
    @Given("I set POST api endpoints register")
    public void setPostApiEndpointsRegister(){
        Register.setPostApiEndpoint();
    }
    @When("I send POST HTTP request register")
    public void sendPostHttpRequestRegister(){
        Register.sendPostHTTPRequest();
    }
    @And("I receive valid data for register")
    public void validateDataRegister(){
        Register.validateDataRegister();
    }

    @Given("I set POST api endpoints register invalid")
    public void setPostApiEndpointsRegisterInvalid(){
        Register.setPostApiEndpointInvalid();
    }
    @When("I send POST HTTP request register invalid")
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


    //Login
    @Given("I set POST api endpoints login")
    public void setPostApiEndpointsLogin(){
        Login.setPostApiEndpoint();
    }
    @When("I send POST HTTP request login")
    public void sendPostHttpRequestLogin(){
        Login.sendPostHTTPRequest();
    }
    @And("I receive valid data for login")
    public void validateDataLogin(){
        Login.validateDataLogin();
    }

    @When("I send POST HTTP request login invalid")
    public void sendPostHttpRequestLoginInvalid(){
        Login.sendPostHTTPRequestInvalid();
    }
    @And("I receive valid data for response code 400 login")
    public void receiveValidDataForResponseCode400Login(){
        Login.validateDataInvalidForResponseCode400Login();
    }


    //Get user information
    @Given("I set GET api endpoints user info")
    public void setGetApiEndpointsUserInfo() {
        GetUserInfo.setApiEndpoints();
    }
    @When("I send GET HTTP request user info")
    public void sendGetHttpRequestUserInfo(){
        GetUserInfo.sendGetHttpRequest();
    }
    @And("I receive valid data for user info")
    public void receiveValidDataForUserInfo(){
        GetUserInfo.validateDataUserInfo();
    }

    @When("I send GET HTTP request user info invalid")
    public void sendGetHttpRequestUserInfoInvalid() {
        GetUserInfo.sendGetHttpRequestInvalid();
    }
    @Then("I receive valid HTTP response code 401")
    public void receiveHttpResponseCode401(){
        GetUserInfo.validateHttpResponseCode401();
    }
    @And("I receive valid data for response code 401")
    public void receiveValidDataForResponseCode401(){
        GetUserInfo.validateDataInvalidForResponseCode401();
    }
}