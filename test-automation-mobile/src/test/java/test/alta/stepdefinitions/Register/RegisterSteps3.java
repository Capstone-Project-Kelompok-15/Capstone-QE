package test.alta.stepdefinitions.Register;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class RegisterSteps3 {
  public int id = 3;

  @Steps
  StartScreen start;

  @Given("user at the landing page3")
  public void userAtTheLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip button3")
  public void userClickSkipButton() {
    start.clickSkip();
  }

  @And("user click next button3")
  public void userClickNextButton() {
    start.clickNext();
  }

  @And("user click register3")
  public void userClickRegister() {
    start.tapRegisterPage();
  }

  @And("user input email and phone number fill3")
  public void userInputEmailAndPhoneNumberFill() {
    start.tapEmailorNumberPhone();
    start.inputEmailorNumberPhone("prasetyo" + id + "@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user input password fill3")
  public void userInputPasswordFill() {
    start.tapPassword();
    AndroidDriverPool.pressKeyboardKey(AndroidKey.Q);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.U);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.A);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.L);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.I);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.T);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.Y);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_2);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_3);
    AndroidDriverPool.pressBack();
  }

  @And("user input age3")
  public void userInputAge() {
    start.tapAge();
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_2);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_3);
    AndroidDriverPool.pressBack();
  }

  @And("user click register button3")
  public void userClickRegisterButton() {
    start.tapRegisterButton();
  }

  @Then("user failed to create new account3")
  public void userFailedToCreateNewAccount() {
    start.getErrorMessageRegisWthUsr();
  }
}
