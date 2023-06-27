package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    private By validateDashboard() {
        return By.id("homepage");
    }
    private By validateSummaryStats() {
        return By.id("chart");
    }
    private By profilButton() {
        return By.id("buttonProfile");
    }
    private By exitButton() {
        return By.id("keluar");
    }
    private By logoutButton() {
        return By.id("buttonKeluar");
    }

    @Step
    public boolean validateOnDashboardPage() {
        return $(validateDashboard()).waitUntilPresent().isDisplayed();
    }
    @Step
    public boolean validateSeeSummaryStats() {
        return $(validateSummaryStats()).waitUntilPresent().isDisplayed();
    }
    @Step
    public void clickProfilButton() {
        $(profilButton()).click();
    }
    @Step
    public void clickLogoutButton() {
        $(logoutButton()).click();
    }
    @Step
    public void clickExitButton() {
        $(exitButton()).click();
    }

}