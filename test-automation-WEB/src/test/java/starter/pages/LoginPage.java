package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By validateLogin() {
        return By.id("loginView");
    }
    private By emailField() {
        return By.id("email");
    }
    private By passwordField() {
        return By.id("password");
    }
    private By loginButton() {
        return By.id("buttonlogin");
    }
    private By alertError(String message) {
        if (message.equals("Tolong masukkan email")) {
            return By.id("errorEmail");
        } else if (message.equals("Tolong masukkan kata sandi")) {
            return By.id("errorPassword");
        } else if (message.equals("Email yang anda masukkan salah")) {
            return By.id("errorEmail");
        } else if (message.equals("Kata sandi yang anda masukkan salah")) {
            return By.id("errorPassword");
        } else {
            return null;
        }
    }
    @Step
    public boolean validateOnLoginPage() {
        return $(validateLogin()).waitUntilPresent().isDisplayed();
    }
    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }
    @Step
    public String seeErrorMessage(String message) {
        return $(alertError(message)).getText();
    }
}