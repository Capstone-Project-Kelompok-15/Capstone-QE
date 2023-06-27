package test.alta.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class LoginSteps6 {

  @Steps
  StartScreen start;

  @Given("user on landing page6")
  public void userOnLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip6")
  public void userClickSkip() {
    start.clickSkip();
  }

  @And("user click next6")
  public void userClickNext() {
    start.clickNext();
  }

  @And("user input email or phone number6")
  public void userInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("gilang@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user click login button6")
  public void userClickLoginButton() {
    start.tapLoginButton();
  }

  @Then("user cant login and see error message6")
  public void userCantLoginAndSeeErrorMessage() {
    start.getErrorMessage();
  }
}
