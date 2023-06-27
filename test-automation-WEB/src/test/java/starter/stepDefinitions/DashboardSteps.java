package starter.stepDefinitions;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;

public class DashboardSteps {
    @Steps
    DashboardPage dashboardPage;
    @Then("I am on the dashboard page")
    public void onTheDashboardPage() {
        dashboardPage.validateOnDashboardPage();
    }
    @Then("I can see summary stats for admin")
    public void seeSummaryStats() {
        dashboardPage.validateSeeSummaryStats();
    }
}
