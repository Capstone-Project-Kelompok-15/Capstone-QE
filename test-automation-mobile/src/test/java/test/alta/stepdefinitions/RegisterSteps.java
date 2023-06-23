package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LandingScreen;
import test.alta.pages.RegisterScreen;

public class RegisterSteps {

    @Steps
    RegisterScreen registerScreen;

//    @Steps
//    LoginScreen loginScreen;

    @Steps
    LandingScreen landingScreen;

    @Given("I'm on the login page")
    public void onTheLoginPage() {
        registerScreen.clickSigninIcon();
        boolean actual = registerScreen.isOnRegisterPage();
        Assert.assertTrue(actual);
    };

    @And("I click register link")
    public void clickRegisterLink(){
        registerScreen.clickRegisterLink();
    };

    @When("I am on the register page")
    public void onTheRegisterPage(){
        registerScreen.isOnRegisterPage();
    };

    @And("I input fullname")
    public void inputFullnameField(){
        registerScreen.inputFullnameField();
    };

    @And("I didn't fill in the fullname")
    public void blankFullnameField(){
        registerScreen.blankFullnameField();
    };

    @And("I input email")
    public void inputEmailField(){
        registerScreen.inputEmailField();
    };

    @And("I didn't fill in the email")
    public void blankEmailField(){
        registerScreen.blankEmailField();
    };

    @And("I input password")
    public void inputPasswordField(){
        registerScreen.inputPasswordField();
    };

    @And("I didn't fill in the password")
    public void blankPasswordField(){
        registerScreen.blankPasswordField();
    };

    @And("I click register button")
    public void clickRegisterButton(){
        registerScreen.clickRegisterButton();
    };

    @Then("I am on the landing page")
    public void onTheLandingPage() throws InterruptedException {
        landingScreen.isOnLandingPage();
        Thread.sleep(2000);
    }

    @Then("I see error message: {string}")
    public void seeErrorMessage2(String message) throws InterruptedException {
        registerScreen.getErrorMessage2(message);
        Thread.sleep(2000);
    }
}
