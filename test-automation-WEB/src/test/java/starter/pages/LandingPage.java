package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LandingPage extends PageObject {
    private By validateLanding() {
        return By.id("landingPageView");
    }
    private By signButton() {
        return By.id("buttonmasuk");
    }
    public void maximizeBrowserWindow() {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
    }
    @Step
    public void openPage() {
        maximizeBrowserWindow();
        open();
    }

    @Step
    public boolean validateOnLandingPage() {
        return $(validateLanding()).waitUntilPresent().isDisplayed();
    }

    @Step
    public void clickSignButton() {
        $(signButton()).click();
    }
}
