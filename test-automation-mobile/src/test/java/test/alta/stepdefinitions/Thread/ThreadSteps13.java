package test.alta.stepdefinitions.Thread;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;
import test.alta.screen.ThreadScreen;

public class ThreadSteps13 {

  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;

  @Given("user in the landing page13")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip13")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next13")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number13")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password13")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button13")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can see home page13")
  public void userCanSeeHomePage() {
    start.validateHomePage();
  }

  @And("user click thread menu13")
  public void userClickThreadMenu() {
    AndroidDriverPool.tapByCoordinates(992, 917);//klik thread menu
  }

  @And("user click add to bookmark13")
  public void userClickAddToBookmark() {
    AndroidDriverPool.tapByCoordinates(311, 1300);//klik to bookmark

  }

  @Then("user success to add thread to bookmark13")
  public void userSuccessToAddThreadToBookmark() {
    start.getSuccessBookmark();
  }
}
