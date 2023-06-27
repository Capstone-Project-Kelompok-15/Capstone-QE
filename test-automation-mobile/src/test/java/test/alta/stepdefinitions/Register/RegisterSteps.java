package test.alta.stepdefinitions.Register;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class RegisterSteps {

  public int id = 1;

  @Steps
  StartScreen start;

  @Given("user at the landing page")
  public void userAtTheLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip button")
  public void userClickSkipButton() {
    start.clickSkip();
  }

  @And("user click next button")
  public void userClickNextButton() {
    start.clickNext();
  }

  @And("user click register")
  public void userClickRegister() {
    start.tapRegisterPage();
  }

  @And("user input username")
  public void userInputUsername() {
    start.tapUsername();
    start.inputUsername("adminqe" + id);
    AndroidDriverPool.pressBack();
  }

  @And("user input email and phone number fill")
  public void userInputEmailAndPhoneNumberFill() {
    start.tapEmailorNumberPhone();
    start.inputEmailorNumberPhone("adul" + id + "@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user input password fill")
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
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_1);
    AndroidDriverPool.pressBack();
  }

  @And("user input age")
  public void userInputAge() {
    start.tapAge();
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_2);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_1);
    AndroidDriverPool.pressBack();
  }

  @And("user click register button")
  public void userClickRegisterButton() {
    start.tapRegisterButton();
  }

  @Then("user success to create new account")
  public void userSuccessToCreateNewAccount() {
    start.validateRegister();
  }


}
