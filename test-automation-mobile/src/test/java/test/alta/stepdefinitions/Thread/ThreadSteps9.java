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

public class ThreadSteps9 {
  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;


  @Given("user in the landing page9")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip9")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next9")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number9")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password9")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button9")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can view all thread9")
  public void userCanViewAllThread() {
    start.validateHomePage();
  }

  @And("user click comment button9")
  public void userClickCommentButton() {
    AndroidDriverPool.tapByCoordinates(196, 934);//klik comment

  }


  @And("user can input comment9")
  public void userCanInputComment() {
    AndroidDriverPool.tapByCoordinates(518, 2062);//klik input comment
    AndroidDriverPool.pressKeyboardKey(AndroidKey.M);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.A);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.N);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.A);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.P);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.SPACE);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.P);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.A);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.K);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.SPACE);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.E);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.K);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.O);
  }


  @And("user click send comment button9")
  public void userClickSendCommentButton() {
    AndroidDriverPool.tapByCoordinates(985, 1385);//klik send comment
  }

  @Then("user success to comment9")
  public void userSuccessToComment() {
    thread.validateComment();
  }
}
