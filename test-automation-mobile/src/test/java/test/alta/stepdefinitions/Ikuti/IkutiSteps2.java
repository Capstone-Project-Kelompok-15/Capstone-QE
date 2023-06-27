package test.alta.stepdefinitions.Ikuti;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import test.alta.driver.AndroidDriverPool;
import test.alta.screen.IkutiScreen;
import test.alta.screen.StartScreen;

public class IkutiSteps2 {

  @Steps
  StartScreen start;

  @Steps
  IkutiScreen ikuti;


  @Given("user in the landing pageIkt2")
  public void userInTheLandingPageIkt() {
    start.onLandingPage();
  }
  @When("user can click skipIkt2")
  public void userCanClickSkipIkt() {
    start.clickSkip();
  }

  @And("user can click nextFIkt2")
  public void userCanClickNextFIkt() {
    start.clickNext();
  }

  @And("user can input email or phone numberIkt2")
  public void userCanInputEmailOrPhoneNumberIkt() {
    start.clickTypeEmail();
    start.inputEmail("gilang@gmail.com");
    AndroidDriverPool.pressBack();
  }

  @And("user can input passwordIkt2")
  public void userCanInputPasswordIkt() {
    start.clickTypePass();
    start.inputPass("Gilang68");
    AndroidDriverPool.pressBack();
  }

  @And("user can click login buttonIkt2")
  public void userCanClickLoginButtonIkt() {
    start.tapLoginButton();
  }

  @And("user can see home pageikt2")
  public void userCanSeeHomePageikt() {
    start.validateHomePage();
  }

  @And("user click ikuti pageIkt2")
  public void userClickIkutiPageIkt() {
    AndroidDriverPool.tapByCoordinates(406, 2062);//klik ikuti page
  }

  @And("user click ikuti postingan2")
  public void userClickIkutiPengguna() {
    AndroidDriverPool.tapByCoordinates(190, 298);//klik pengguna
  }

  @Then("user can see thread by ikuti postingan2")
  public void userCanSeeThreadByIkutiPengguna() {
    ikuti.validateViewFlwdUser();
  }


}
