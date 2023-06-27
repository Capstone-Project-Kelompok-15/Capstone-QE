package test.alta.stepdefinitions.Thread;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;
import test.alta.screen.ThreadScreen;

public class ThreadSteps11 {

  @Steps
  StartScreen start;


  @Given("user in the landing page11")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip11")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next11")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number11")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password11")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button11")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can view all thread11")
  public void userCanViewAllThread() {
    start.validateHomePage();
  }

  @And("user click thread menu11")
  public void userClickThreadMenu() {
    AndroidDriverPool.tapByCoordinates(995, 917);//klik thread menu
  }

  @And("user click follow thread11")
  public void userClickFollowThread() {
    AndroidDriverPool.tapByCoordinates(298, 1178);//klik follow thread
  }

  @Then("user success to follow thread11")
  public void userSuccessToFollowThread() {
    start.getSuccessFollowThread();
  }
}
