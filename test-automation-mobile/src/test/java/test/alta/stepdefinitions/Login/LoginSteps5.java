package test.alta.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class LoginSteps5 {

  @Steps
  StartScreen start;

  @Given("user on landing page5")
  public void userOnLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip5")
  public void userClickSkip() {
    start.clickSkip();
  }

  @And("user click next5")
  public void userClickNext() {
    start.clickNext();
  }

  @And("user input password5")
  public void userInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user click login button5")
  public void userClickLoginButton() {
    start.tapLoginButton();
  }

  @Then("user cant login and see error message5")
  public void userCantLoginAndSeeErrorMessage() {
    start.getErrorMessage();
  }

}
