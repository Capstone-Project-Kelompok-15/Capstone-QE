package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailThreadPage extends PageObject {
    private By validateDetailThread() {
        return By.id("buttonkembali");
    }
    @Step
    public boolean validateDetailThreadPage() {
        return $(validateDetailThread()).waitUntilPresent().isDisplayed();
    }
}
