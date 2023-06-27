package test.alta.stepdefinitions.Register;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class RegisterSteps4 {
  public int id = 4;

  @Steps
  StartScreen start;

  @Given("user at the landing page4")
  public void userAtTheLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip button4")
  public void userClickSkipButton() {
    start.clickSkip();
  }

  @And("user click next button4")
  public void userClickNextButton() {
    start.clickNext();
  }

  @And("user click register4")
  public void userClickRegister() {
    start.tapRegisterPage();
  }

  @And("user input username4")
  public void userInputUsername() {
    start.tapUsername();
    start.inputUsername("adminqe" + id);
    AndroidDriverPool.pressBack();
  }


  @And("user input password fill4")
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
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_4);
    AndroidDriverPool.pressBack();
  }

  @And("user input age4")
  public void userInputAge() {
    start.tapAge();
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_2);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_4);
    AndroidDriverPool.pressBack();
  }

  @And("user click register button4")
  public void userClickRegisterButton() {
    start.tapRegisterButton();
  }

  @Then("user failed to create new account4")
  public void userFailedToCreateNewAccount() {
    start.getErrorMessageWthEmailRegis();
  }
}
