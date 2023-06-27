package test.alta.stepdefinitions.Register;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class RegisterSteps6 {
  public int id = 6;

  @Steps
  StartScreen start;

  @Given("user at the landing page6")
  public void userAtTheLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip button6")
  public void userClickSkipButton() {
    start.clickSkip();
  }

  @And("user click next button6")
  public void userClickNextButton() {
    start.clickNext();
  }

  @And("user click register6")
  public void userClickRegister() {
    start.tapRegisterPage();
  }

  @And("user input username6")
  public void userInputUsername() {
    start.tapUsername();
    start.inputUsername("adminqe" + id);
    AndroidDriverPool.pressBack();
  }

  @And("user input email and phone number fill6")
  public void userInputEmailAndPhoneNumberFill() {
    start.tapEmailorNumberPhone();
    start.inputEmailorNumberPhone("prasetyo" + id + "@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user input password fill6")
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
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_6);
    AndroidDriverPool.pressBack();
  }

  @And("user click register button6")
  public void userClickRegisterButton() {
    start.tapRegisterButton();
  }

  @Then("user failed to create new account6")
  public void userFailedToCreateNewAccount() {
    start.getErrorMessageWthAgeRegis();
  }
}
