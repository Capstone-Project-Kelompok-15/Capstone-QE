package test.alta.stepdefinitions.Thread;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;
import test.alta.screen.ThreadScreen;

public class ThreadSteps6 {

  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;

  @Given("user in the landing page6")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip6")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next6")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number6")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password6")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button6")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can see home page6")
  public void userCanSeeHomePage() {
    start.validateHomePage();
  }

  @And("user click leaderboard page6")
  public void userClickLeaderboardPage() {
    AndroidDriverPool.tapByCoordinates(677, 2062);//klik leaderboard
  }

  @And("user click monthly6")
  public void userClickMonthly() {
    AndroidDriverPool.tapByCoordinates(521, 298);//klik monthly
  }

  @Then("user can see leaderboard by monthly6")
  public void userCanSeeLeaderboardByMonthly() {
    thread.validateLeaderboards();
  }
}
