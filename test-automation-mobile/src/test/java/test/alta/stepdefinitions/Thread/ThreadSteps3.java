package test.alta.stepdefinitions.Thread;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;
import test.alta.screen.ThreadScreen;

public class ThreadSteps3 {

  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;

  @Given("user in the landing page3")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip3")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next3")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number3")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password3")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button3")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can see home page3")
  public void userCanSeeHomePage() {
    start.validateHomePage();
  }

  @And("user tap create thread3")
  public void userTapCreateThread() {
    AndroidDriverPool.tapByCoordinates(464, 344);
  }

  @And("user click send button3")
  public void userClickSendButton() {
    AndroidDriverPool.tapByCoordinates(941, 146);//klik
  }

  @Then("user cant create thread and see error message3")
  public void userCantCreateNewThread() {
    thread.getThreadErrorMessage();
  }
}
