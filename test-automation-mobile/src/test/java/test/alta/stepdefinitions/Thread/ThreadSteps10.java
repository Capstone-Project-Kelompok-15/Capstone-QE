package test.alta.stepdefinitions.Thread;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;
import test.alta.screen.ThreadScreen;

public class ThreadSteps10 {
  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;


  @Given("user in the landing page10")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip10")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next10")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number10")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password10")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button10")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can view all thread10")
  public void userCanViewAllThread() {
    start.validateHomePage();
  }

  @And("user click comment button10")
  public void userClickCommentButton() {
    AndroidDriverPool.tapByCoordinates(196, 931);//klik comment

  }

  @And("user can input comment10")
  public void userCanInputComment() {
    AndroidDriverPool.tapByCoordinates(491, 2062);//klik input comment
  }


  @And("user click send comment button10")
  public void userClickSendCommentButton() {
    AndroidDriverPool.tapByCoordinates(985, 1385);//klik send comment
  }

  @Then("user failed to comment10")
  public void userFailedToComment() {
  }
}
