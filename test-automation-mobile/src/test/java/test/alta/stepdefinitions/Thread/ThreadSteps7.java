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

public class ThreadSteps7 {

  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;

  @Given("user in the landing page7")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip7")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next7")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number7")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password7")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button7")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can see home page7")
  public void userCanSeeHomePage() {
    start.validateHomePage();
  }

  @And("user click leaderboard page7")
  public void userClickLeaderboardPage() {
    AndroidDriverPool.tapByCoordinates(677, 2062);//klik leaderboard
  }

  @And("user click weekly7")
  public void userClickWeekly() {
    AndroidDriverPool.tapByCoordinates(196, 288);//klik weekly
  }

  @Then("user can see leaderboard by weekly7")
  public void userCanSeeLeaderboardByWeekly() {
    thread.validateLeaderboards();
  }
}
