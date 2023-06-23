package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.users.DeleteUser;
import starter.users.GetUserAll;
import starter.users.GetUserId;
import starter.users.PutUser;

public class UsersSteps {
    @Steps
    PutUser Update;
    @Steps
    GetUserId Get;
    @Steps
    GetUserAll GetAll;
    @Steps
    DeleteUser Delete;

    //Update user +
    @Given("I set PUT api endpoints update user")
    public void setPutApiEndpointsUpdateUser(){
        Update.setPutApiEndpointsUpdateUser();
    }
    @When("I send PUT HTTP request update user")
    public void sendPutHttpRequestUpdateUser(){
        Update.sendPutHttpRequestUpdateUser();
    }

    //Update user -
    @When("I send PUT HTTP request update user invalid")
    public void sendPutHttpRequestUpdateUserInvalid(){
        Update.sendPutHttpRequestUpdateUserInvalid();
    }
    @Then("I receive valid HTTP response code 500")
    public void receiveValidHttpResponseCode500(){
        Update.validateHttpResponseCode500();
    }
    @And("I receive valid data for response code 500")
    public void receiveValidDataForResponseCode500() throws Exception {
        Update.validateDataForResponseCode500();
    }

    //Update user by admin +
    @Given("I set PUT api endpoints update user by admin")
    public void setPutApiEndpointsUpdateUserByAdmin(){
        Update.setPutApiEndpointsUpdateUserByAdmin();
    }
    @When("I send PUT HTTP request update user by admin")
    public void sendPutHttpRequestUpdateUserByAdmin(){
        Update.sendPutHttpRequestUpdateUserByAdmin();
    }
    //Update user by admin -
    @Given("I set PUT api endpoints update user invalid by admin")
    public void setPutApiEndpointsUpdateUserInvalidByAdmin(){
        Update.setPutApiEndpointsUpdateUserInvalidByAdmin();
    }
    @When("I send PUT HTTP request update user invalid by admin")
    public void sendPutHttpRequestUpdateUserInvalidByAdmin(){
        Update.sendPutHttpRequestUpdateUserInvalidByAdmin();
    }

    //Get user detail +
    @Given("I set GET api endpoints user")
    public void setGetApiEndpointsUserDetail() {
        Get.setApiEndpoints();
    }
    @When("I send GET HTTP request user")
    public void sendGetHttpRequestUserInfo(){
        Get.sendGetHttpRequest();
    }
    @And("I receive valid data for response code 200")
    public void receiveValidDataForResponseCode200() throws Exception {
        Get.validateDataForResponseCode200();
    }
    //Get user detail -
    @When("I send GET HTTP request user invalid")
    public void sendGetHttpRequestUserInfoInvalid() {
        Get.sendGetHttpRequestInvalid();
    }
    @Then("I receive valid HTTP response code 401")
    public void receiveValidHttpResponseCode401(){
        Get.validateHttpResponseCode401();
    }
    @And("I receive valid data for response code 401")
    public void receiveValidDataForResponseCode401() throws Exception {
        Get.validateDataForResponseCode401();
    }

    //Delete user +
    @Given("I set DELETE api endpoints delete user")
    public void setDeleteApiEndpoints(){
        Delete.setDeleteApiEndpoints();
    }
    @When("I send DELETE HTTP request delete user")
    public void sendDeleteApiEndpoints(){
        Delete.sendDeleteHttpRequest();
    }
    @And("I receive valid data for delete user")
    public void receiveValidDataForDelete(){
        Delete.validateDataDelete();
    }
    //Delete user -
    @Given("I set DELETE api endpoints delete user invalid")
    public void setDeleteApiEndpointsInvalid(){
        Delete.setDeleteApiEndpointsInvalid();
    }
    @When("I send DELETE HTTP request delete user invalid")
    public void sendDeleteApiEndpointsInvalid(){
        Delete.sendDeleteHttpRequestInvalid();
    }
    @Then("I receive valid HTTP response code 405")
    public void receiveHttpResponseCode405(){
        Delete.validateHttpResponseCode405();
    }
    @And("I receive valid data for response code 405")
    public void receiveValidDataForResponseCode405(){
        Delete.validateDataInvalidForResponseCode405();
    }

    //Delete user by admin+
    @Given("I set DELETE api endpoints delete user by admin")
    public void setDeleteApiEndpointsByAdmin(){
        Delete.setDeleteApiEndpointsByAdmin();
    }
    @When("I send DELETE HTTP request delete user by admin")
    public void sendDeleteApiEndpointsByAdmin(){
        Delete.sendDeleteHttpRequestByAdmin();
    }


    //Get all users
    @Given("I set GET api endpoints all users")
    public void setGetApiEndpointsAllUsers() {
        GetAll.setApiEndpoints();
    }
    @When("I send GET HTTP request all users")
    public void sendGetHttpRequestAllUsers(){
        GetAll.sendGetHttpRequest();
    }

    @Given("I set GET api endpoints all users invalid")
    public void setGetApiEndpointsAllUsersInvalid() {
        GetAll.setApiEndpointsInvalid();
    }
    @When("I send GET HTTP request all users invalid")
    public void sendGetHttpRequestAllUsersInvalid(){
        GetAll.sendGetHttpRequestInvalid();
    }

    //Get all users by admin
    @Given("I set GET api endpoints all users by admin")
    public void setGetApiEndpointsAllUsersByAdmin() {
        GetAll.setApiEndpointsGetAllUserByAdmin();
    }
    @When("I send GET HTTP request all users by admin")
    public void sendGetHttpRequestAllUsersByAdmin(){
        GetAll.sendGetHttpRequestByAdmin();
    }
}
