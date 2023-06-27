package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailThreadPage;
import starter.pages.ManageThreadPage;

public class ManageThreadSteps {
    @Steps
    ManageThreadPage manageThreadPage;
    @Steps
    DetailThreadPage detailThreadPage;

    @And("I click manage thread icon on the side bar")
    public void clickManageThreadIcon() {
        manageThreadPage.clickManageThreadIcon();
    }
    @When("I am on the manage thread page")
    public void onTheManageThreadPage() {
        manageThreadPage.validateManageThreadPage();
    }
    @Then("I see the number of threads")
    public void onNumberofThreads() {
        manageThreadPage.validateNumberofThreads();
    }
    @And("I click on the view thread icon")
    public void clickViewThreadIcon() {
        manageThreadPage.clickViewThreadIcon();
    }
    @Then("I am on the detail thread page")
    public void onTheDetailThreadPage() {
        detailThreadPage.validateDetailThreadPage();
    }
    @And("I click the delete thread icon")
    public void clickDeleteThreadIcon() {
        manageThreadPage.clickDeleteThreadIcon();
    }
    @Then("I click delete on the confirmation popup")
    public void clickDeleteButton() {
        manageThreadPage.clickDeleteButton();
    }
}
