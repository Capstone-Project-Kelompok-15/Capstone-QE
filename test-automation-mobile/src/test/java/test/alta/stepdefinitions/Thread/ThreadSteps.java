package test.alta.stepdefinitions.Thread;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class ThreadSteps {

  @Steps
  StartScreen start;


  @Given("user in the landing page")
  public void userInTheLandingPage() {
  start.onLandingPage();
  }

  @When("user can click skip")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @Then("user can view all thread")
  public void userCanViewAllThread() {
    start.validateHomePage();
  }
}
