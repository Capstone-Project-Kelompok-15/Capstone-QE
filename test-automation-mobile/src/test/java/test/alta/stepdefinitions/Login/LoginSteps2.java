package test.alta.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class LoginSteps2 {

  @Steps
  StartScreen start;

  @Given("user on landing page2")
  public void userOnLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip2")
  public void userClickSkip() {
    start.clickSkip();
  }

  @And("user click next2")
  public void userClickNext() {
    start.clickNext();
  }

  @And("user input email or phone number2")
  public void userInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("gilang@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user input wrong password2")
  public void userInputWrongPassword() {
    start.clickTypePass();
    start.inputPass("kel15jay");
    AndroidDriverPool.pressBack();
  }

  @And("user click login button2")
  public void userClickLoginButton() {
    start.tapLoginButton();
  }

  @Then("user cant login and see error message2")
  public void userCantLoginAndSeeErrorMessage() {
    start.getErrorMessage();
  }
}
