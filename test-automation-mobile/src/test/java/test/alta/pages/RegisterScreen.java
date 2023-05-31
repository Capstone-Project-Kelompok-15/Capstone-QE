package test.alta.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pagesobject.BasePageObject;

public class RegisterScreen extends BasePageObject {

    public String name = createRandomName();
    public String password = "password";

    private By SigninIcon() {
        return MobileBy.xpath("//android.view.View/android.view.View[1]/android.widget.Button");
    }

    private By registerLink(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    private By fullnameField(){
        return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");
    }

    private By emailField(){
        return MobileBy.xpath("//android.view.View/android.widget.EditText[2]");
    }

    private By passwordField(){
        return MobileBy.xpath("//android.view.View/android.widget.EditText[3]");
    }

    private By registerButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    private By snackbarError2(String message) {
        if (message.equals("email can not empty")) {
            return MobileBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
        } else if (message.equals("password can not empty")) {
            return MobileBy.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
        } else if (message.equals("fullname can not empty")) {
            return MobileBy.xpath("//android.view.View[@content-desc=\"fullname can not empty\"]");
        } else if (message.equals("Gagal :(")) {
            return MobileBy.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");
        } else {
            return null;
        }
    }

    @Step
    public void clickSigninIcon() {
        onClick(SigninIcon());
    }

    @Step
    public boolean isOnRegisterPage(){
        return waitUntilVisible(registerLink()).isDisplayed();
    }

    @Step
    public void clickRegisterLink(){
        onClick(registerLink());
    }

    @Step
    public void inputFullnameField(){
        clear(fullnameField());
        onClick(fullnameField());
        onType(fullnameField(), createRandomName());
    }

    @Step
    public void blankFullnameField(){
        clear(fullnameField());
        onClick(fullnameField());
        onType(fullnameField(), "");
    }

    @Step
    public void inputEmailField(){
        clear(emailField());
        onClick(emailField());
        onType(emailField(), createRandomName() + "@gmail.com");
    }

    @Step
    public void blankEmailField(){
        clear(emailField());
        onClick(emailField());
        onType(emailField(), "");
    }

    @Step
    public void inputPasswordField(){
        clear(passwordField());
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void blankPasswordField(){
        clear(passwordField());
        onClick(passwordField());
        onType(passwordField(), "");
    }

    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }

    @Step
    public void getErrorMessage2(String message) {
        waitUntilVisible(snackbarError2(message)).isDisplayed();
    }
}