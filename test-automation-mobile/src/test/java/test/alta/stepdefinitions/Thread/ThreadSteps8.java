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

public class ThreadSteps8 {
  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;


  @Given("user in the landing page8")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip8")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next8")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number8")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password8")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button8")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can view all thread8")
  public void userCanViewAllThread() {
    start.validateHomePage();
  }

  @And("user click like button8")
  public void userClickLikeButton() {
    AndroidDriverPool.tapByCoordinates(91, 938);//klik like

  }

  @Then("user can liked a thread8")
  public void userCanLikedAThread() {
    thread.validateLikedThread();
  }
}
