package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By containerHomePage(){
        return By.className("container");
    }

    @Step
    public void validateOnTheHomePage(){
        $(containerHomePage()).isDisplayed();
    }
}
