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

public class ThreadSteps5 {
  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;

  @Given("user in the landing page5")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip5")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next5")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number5")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password5")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button5")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can see home page5")
  public void userCanSeeHomePage() {
    start.validateHomePage();
  }

  @And("user can click searchbar5")
  public void userCanClickSearchbar() {
    AndroidDriverPool.tapByCoordinates(548, 149);//klik search
  }

  @And("user input tittle thread5")
  public void userInputTittleThread() {
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.E);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.S);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.SPACE);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.A);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.L);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.A);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.ENTER);
  }

  @Then("user can see the thread5")
  public void userCanSeeTheThread() {
    start.validateHomePage();
  }
}
