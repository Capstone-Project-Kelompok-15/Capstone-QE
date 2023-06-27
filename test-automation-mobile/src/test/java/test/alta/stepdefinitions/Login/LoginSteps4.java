package test.alta.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.screen.StartScreen;

public class LoginSteps4 {

  @Steps
  StartScreen start;

  @Given("user on landing page4")
  public void userOnLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip4")
  public void userClickSkip() {
    start.clickSkip();
  }

  @And("user click next4")
  public void userClickNext() {
    start.clickNext();
  }

  @And("user click login button4")
  public void userClickLoginButton() {
    start.tapLoginButton();
  }

  @Then("user cant login and see error message4")
  public void userCantLoginAndSeeErrorMessage() {
    start.getErrorMessage();
  }

}
