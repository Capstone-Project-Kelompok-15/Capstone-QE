package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.PostLogin;
import starter.authentication.PostRegister;

public class AuthAdminSteps {
    @Steps
    PostRegister Register;
    @Steps
    PostLogin Login;

    //Login Admin
    @Given("I set POST api endpoints login admin")
    public void setPostApiEndpointsLoginAdmin(){
        Login.setPostApiEndpointAdmin();
    }
    @When("I send POST HTTP request login admin")
    public void sendPostHttpRequestLoginAdmin(){
        Login.sendPostHTTPRequestLoginAdmin();
    }
    @And("I receive valid data for login admin")
    public void validateDataLoginAdmin(){
        Login.validateDataLoginAdmin();
    }

    @When("I send POST HTTP request login admin invalid")
    public void sendPostHttpRequestLoginAdminInvalid(){
        Login.sendPostHTTPRequestAdminInvalid();
    }
    @And("I receive valid data for response code 400 login admin")
    public void receiveValidDataForResponseCode400LoginAdmin(){
        Login.validateDataInvalidForResponseCode400LoginAdmin();
    }
}
