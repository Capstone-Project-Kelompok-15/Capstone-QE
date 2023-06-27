package test.alta.stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class LoginSteps {

  @Steps
  StartScreen start;


  @Given("user on landing page")
  public void userOnLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip")
  public void userClickSkip() {
    start.clickSkip();
  }

  @And("user click next")
  public void userClickNext() {
    start.clickNext();
  }

  @And("user input email or phone number")
  public void userInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("gilang@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user input password")
  public void userInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user click login button")
  public void userClickLoginButton() {
    start.tapLoginButton();
  }

  @Then("user can see home page")
  public void userCanSeeHomePage() {
    start.validateHomePage();
  }
}
