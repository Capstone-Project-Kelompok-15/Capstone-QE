package starter.stepDefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;

public class LogoutSteps {
    @Steps
    DashboardPage dashboardPage;
    @And("I click logout button")
    public void clickLogoutButton() {
        dashboardPage.clickLogoutButton();
    }
    @And("I click exit on the confirmation popup")
    public void clickExitButton() {
        dashboardPage.clickExitButton();
    }
}
