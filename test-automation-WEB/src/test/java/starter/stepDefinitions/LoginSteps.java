package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.LandingPage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LandingPage landingPage;
    @Steps
    LoginPage loginPage;
    @Given("I am on the landing page")
    public void onTheLandingPage(){
        landingPage.openPage();
        landingPage.validateOnLandingPage();
    }
    @And("I click masuk button")
    public void clickSignButton() {
        landingPage.clickSignButton();
    }
    @When("I am on the login page")
    public void onTheLoginPage() {
        loginPage.validateOnLoginPage();
    }
    @And("I input email {string} on email field")
    public void inputValidEmail(String email) {
        loginPage.inputEmail(email);
    }
    @And("I input password {string} on password field")
    public void inputValidPassword(String password) {
        loginPage.inputPassword(password);
    }
    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
    @And("I see error message {string}")
    public void seeErrorMessage(String message) {
        loginPage.seeErrorMessage(message);
    }
}