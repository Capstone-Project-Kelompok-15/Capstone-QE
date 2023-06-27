package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.ProfilPage;

public class ProfilSteps {
    @Steps
    DashboardPage dashboardPage;
    @Steps
    ProfilPage profilPage;
    @And("I click the profile button")
    public void clickProfilButton() {
        dashboardPage.clickProfilButton();
    }
    @When("I am on the change profile page")
    public void onTheProfilPage() {
        profilPage.onTheProfilPage();
    }
    @And("I click change profile picture")
    public void clickChangePicture() {
        profilPage.clickChangePicture();
    }
    @And("I input a new {string}")
    public void inputValid(String field) {
        profilPage.inputValid(field);
    }
    @Then("I click the save button")
    public void clickSaveButton() {
        profilPage.clickSaveButton();
    }
    @And("I click save on the confirmation popup")
    public void clickSave2Button() {
        profilPage.clickSave2Button();
    }
    @And("I click button back")
    public void clickBackButton() {
        profilPage.clickBackButton();
    }
    @Then("I see the results of the changes")
    public void validateResultChange() {
        profilPage.validateResultChange();
    }
}
