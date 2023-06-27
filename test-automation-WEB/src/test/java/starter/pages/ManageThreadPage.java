package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ManageThreadPage extends PageObject {
    private By manageThreadIcon() {
        return By.id("sidebar-thread");
    }
    private By validateManageThread() {
        return By.id("manage-thread");
    }
    private By validateThreads() {
        return By.id("container_middle");
    }
    private By viewThreadIcon() {
        return By.id("linkview");
    }
    private By deleteThreadIcon() {
        return By.id("buttonhapus");
    }
    private By deleteButton() {
        return By.id("hapusthread");
    }
    @Step
    public void clickManageThreadIcon() {
        $(manageThreadIcon()).click();
    }
    @Step
    public boolean validateManageThreadPage() {
        return $(validateManageThread()).waitUntilPresent().isDisplayed();
    }
    @Step
    public boolean validateNumberofThreads() {
        return $(validateThreads()).waitUntilPresent().isDisplayed();
    }
    @Step
    public void clickViewThreadIcon() {
        $(viewThreadIcon()).click();
    }
    @Step
    public void clickDeleteThreadIcon() {
        $(deleteThreadIcon()).click();
    }
    @Step
    public void clickDeleteButton() {
        $(deleteButton()).click();
    }
}
