package test.alta.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class LoginSteps3 {

  @Steps
  StartScreen start;

  @Given("user on landing page3")
  public void userOnLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip3")
  public void userClickSkip() {
    start.clickSkip();
  }

  @And("user click next3")
  public void userClickNext() {
    start.clickNext();
  }

  @And("user input invalid email or phone number3")
  public void userInputInvalidEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("kel10@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user input invalid password3")
  public void userInputInvalidPassword() {
    start.clickTypePass();
    start.inputPass("kelompok10");
    AndroidDriverPool.pressBack();
  }

  @And("user click login button3")
  public void userClickLoginButton() {
    start.tapLoginButton();
  }

  @Then("user cant login and see error message3")
  public void userCantLoginAndSeeErrorMessage() {
    start.getErrorMessage();
  }

}
