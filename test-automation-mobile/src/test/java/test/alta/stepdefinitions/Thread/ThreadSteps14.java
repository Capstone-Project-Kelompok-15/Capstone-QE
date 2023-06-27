package test.alta.stepdefinitions.Thread;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.StartScreen;
import test.alta.screen.ThreadScreen;

public class ThreadSteps14 {
  @Steps
  StartScreen start;

  @Steps
  ThreadScreen thread;

  @Given("user in the landing page14")
  public void userInTheLandingPage() {
    start.onLandingPage();
  }

  @When("user can click skip14")
  public void userCanClickSkip() {
    start.clickSkip();
  }

  @And("user can click next14")
  public void userCanClickNext() {
    start.clickNext();
  }

  @And("user can input email or phone number14")
  public void userCanInputEmailOrPhoneNumber() {
    start.clickTypeEmail();
    start.inputEmail("adminqa@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input password14")
  public void userCanInputPassword() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login button14")
  public void userCanClickLoginButton() {
    start.tapLoginButton();
  }

  @And("user can see home page14")
  public void userCanSeeHomePage() {
    start.validateHomePage();
  }

  @And("user click profile page14")
  public void userClickProfilePage() {
//    AndroidDriverPool.tapByCoordinates(945, 2062);//klik profile page
    start.tapProfilePage();
  }

  @And("user clik profile menu14")
  public void userClikProfileMenu() {
//    AndroidDriverPool.tapByCoordinates(995, 169);//klik profile menu
    start.tapProfileMenu();
  }

  @And("user click bookmarks14")
  public void userClickBookmarks() {
    AndroidDriverPool.tapByCoordinates(264, 372);//klik bookmarks
//    start.tapBookmark();
  }

  @Then("user success to see bookmark threads")
  public void userSuccessToSeeBookmarkThreads() {
    start.validateBookmark();
  }
}
