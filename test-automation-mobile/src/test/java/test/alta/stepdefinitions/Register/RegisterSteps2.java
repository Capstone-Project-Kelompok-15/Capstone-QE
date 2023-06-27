package test.alta.stepdefinitions.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class RegisterSteps2 {

  @Steps
  StartScreen start;

  @Given("user at the landing page2")
  public void userAtTheLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip button2")
  public void userClickSkipButton() {
    start.clickSkip();
  }

  @And("user click next button2")
  public void userClickNextButton() {
    start.clickNext();
  }

  @And("user click register2")
  public void userClickRegister() {
    start.tapRegisterPage();
  }

  @And("user click register button2")
  public void userClickRegisterButton() {
    AndroidDriverPool.ScrollDown();
    start.tapRegisterButton();
  }

  @Then("user failed to create new account2")
  public void userFailedToCreateNewAccount() {
    start.geterrorMessageNullData();

  }
}
