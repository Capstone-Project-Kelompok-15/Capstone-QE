package starter.register;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject{

    private By usernameField(){ return By.xpath("//label[text()='Nama Lengkap']/following-sibling::input");
    }
    private By emailField(){
        return By.xpath("//label[text()='Email']/following-sibling::input");
    }
    private By passwordField(){
        return By.xpath("//label[text()='Password']/following-sibling::input");
    }
    private By registerButton(){
        return By.xpath("//span[@class='v-btn__content' and text()='Register']");
    }

    private By errorMessage(){
        return By.xpath("//i[@class='v-icon notranslate v-alert__icon fas fa-exclamation-triangle theme--light error--text']");
    }

    @Step
    public static OpenUrl url(String targetUrl) {
        return new OpenUrl(targetUrl);
    }
    @Step
    public void validateOnTheRegisterPage(){
        $(registerButton()).isDisplayed();
    }
    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickButtonRegister(){
        $(registerButton()).click();
    }
    @Step
    public boolean validateErrorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean validateEqualErrorMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }
}
