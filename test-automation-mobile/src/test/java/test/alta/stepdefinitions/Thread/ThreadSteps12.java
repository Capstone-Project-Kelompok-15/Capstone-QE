package test.alta.stepdefinitions.Thread;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;
import test.alta.screen.ThreadScreen;

public class ThreadSteps12 {

  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;

  @Given("user in the landing page12")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip12")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next12")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number12")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password12")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button12")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can view all thread12")
  public void userCanViewAllThread() {
    start.validateHomePage();
  }


  @And("user can click follow user12")
  public void userCanClickFollowUser() {
    AndroidDriverPool.tapByCoordinates(366, 582);//klik follow user
  }

  @Then("user success to follow other user12")
  public void userSuccessToFollowOtherUser() {
  }
}
