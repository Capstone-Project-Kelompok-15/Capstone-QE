package test.alta.stepdefinitions.Register;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;

public class RegisterSteps5 {
  public int id = 5;

  @Steps
  StartScreen start;

  @Given("user at the landing page5")
  public void userAtTheLandingPage() {
    start.onLandingPage();
  }

  @When("user click skip button5")
  public void userClickSkipButton() {
    start.clickSkip();
  }

  @And("user click next button5")
  public void userClickNextButton() {
    start.clickNext();
  }

  @And("user click register5")
  public void userClickRegister() {
    start.tapRegisterPage();
  }

  @And("user input username5")
  public void userInputUsername() {
    start.tapUsername();
    start.inputUsername("adminqe" + id);
    AndroidDriverPool.pressBack();
  }

  @And("user input email and phone number fill5")
  public void userInputEmailAndPhoneNumberFill() {
    start.tapEmailorNumberPhone();
    start.inputEmailorNumberPhone("prasetyo" + id + "@gmail.com");
    AndroidDriverPool.pressBack();
  }


  @And("user input age5")
  public void userInputAge() {
    start.tapAge();
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_2);
    AndroidDriverPool.pressKeyboardKey(AndroidKey.DIGIT_5);
    AndroidDriverPool.pressBack();
  }

  @And("user click register button5")
  public void userClickRegisterButton() {
    start.tapRegisterButton();
  }

  @Then("user failed to create new account5")
  public void userFailedToCreateNewAccount() {
    start.getErrorMessageWthPassRegis();
  }
}
