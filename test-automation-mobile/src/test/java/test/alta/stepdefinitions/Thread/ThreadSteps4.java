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

public class ThreadSteps4 {

  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;

  @Given("user in the landing page4")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip4")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next4")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number4")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password4")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button4")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can see home page4")
  public void userCanSeeHomePage() {
    start.validateHomePage();
  }

  @And("user tap create thread4")
  public void userTapCreateThread() {
    AndroidDriverPool.tapByCoordinates(464, 344);

  }

  @And("user input tittle4")
  public void userInputTittle() {
    AndroidDriverPool.tapByCoordinates(494, 342);// klik input
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.E);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.S);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.SPACE);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.A);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.L);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.A);
    AndroidDriverPool.pressBack();
  }

  @And("user input topic4")
  public void userInputTopic() {
    AndroidDriverPool.tapByCoordinates(477, 609);//klik topic
    AndroidDriverPool.pressKeyboardKey(AndroidKey.A);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.Y);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.O);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.E);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.S);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressBack();
  }

  @And("user add media4")
  public void userAddMedia() {
    AndroidDriverPool.tapByCoordinates(941, 1449);//click media
    AndroidDriverPool.tapByCoordinates(230, 572);//add media
  }

  @And("user click send button4")
  public void userClickSendButton() {
    AndroidDriverPool.tapByCoordinates(941, 146);//klik

  }

  @Then("user can see their new thread4")
  public void userCantSeeTheirNewThread() {
    thread.validateNewThread();
  }
}
