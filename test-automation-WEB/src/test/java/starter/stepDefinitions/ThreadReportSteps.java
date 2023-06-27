package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ThreadReportPage;

public class ThreadReportSteps {
    @Steps
    ThreadReportPage threadReportPage;

    @And("I click thread report icon on the side bar")
    public void clickThreadReportIcon() {
        threadReportPage.clickThreadReportIcon();
    }
    @When("I am on the thread report page")
    public void onTheThreadReportPage() {
        threadReportPage.onTheThreadReportPage();
    }
    @Then("I see the report thread count")
    public void onNumberofReport() {
        threadReportPage.validateNumberofReport();
    }
    @And("I click the approve report icon")
    public void clickApproveIcon() {
        threadReportPage.clickApproveIcon();
    }
    @Then("I click the agree button on the confirmation popup")
    public void clickAgreeButton() {
        threadReportPage.clickAgreeButton();
    }
    @And("I click the reject report icon")
    public void clickRejectIcon() {
        threadReportPage.clickRejectIcon();
    }
    @Then("I click the reject button on the confirmation popup")
    public void clickRejectButton() {
        threadReportPage.clickRejectButton();
    }
}
