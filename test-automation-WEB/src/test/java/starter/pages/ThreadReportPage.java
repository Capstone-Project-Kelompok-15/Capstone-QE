package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ThreadReportPage extends PageObject {
    private By threadReportIcon() {
        return By.id("sidebar-report");
    }
    private By validateThreadReport() {
        return By.id("thread-report");
    }
    private By validateReport() {
        return By.id("container_middle");
    }
    private By approveIcon() {
        return By.id("buttonterima");
    }
    private By agreeButton() {
        return By.id("setujuilaporan");
    }
    private By rejectIcon() {
        return By.id("buttontolak");
    }
    private By rejectButton() {
        return By.id("tolaklaporan");
    }
    @Step
    public void clickThreadReportIcon() {
        $(threadReportIcon()).click();
    }
    @Step
    public boolean onTheThreadReportPage() {
        return $(validateThreadReport()).waitUntilPresent().isDisplayed();
    }
    @Step
    public boolean validateNumberofReport() {
        return $(validateReport()).waitUntilPresent().isDisplayed();
    }
    @Step
    public void clickApproveIcon() {
        $(approveIcon()).click();
    }
    @Step
    public void clickAgreeButton() {
        $(agreeButton()).click();
    }
    @Step
    public void clickRejectIcon() {
        $(rejectIcon()).click();
    }
    @Step
    public void clickRejectButton() {
        $(rejectButton()).click();
    }
}
