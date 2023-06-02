package starter.login;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject{
  private By loginPageButton(){
    return By.xpath("//i[@class='v-icon notranslate fas fa-sign-in theme--dark']");
  }
  private By emailField(){
    return By.xpath("//label[text()='Email']/following-sibling::input");
  }
  private By passwordField(){
    return By.xpath("//label[text()='Password']/following-sibling::input");
  }
  private By loginButton(){
    return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");

  }
  private By errorMessage(){
    return By.xpath("//i[@class='v-icon notranslate v-alert__icon fas fa-exclamation-triangle theme--light error--text']");
  }
  @Step
  public static OpenUrl url(String targetUrl) {
    return new OpenUrl(targetUrl);
  }
  @Step
  public void openTheLoginPage(){
    $(loginPageButton()).click();
  }
  @Step
  public void validateOnTheLoginPage(){
    $(loginButton()).isDisplayed();
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
  public void clickButtonLogin(){
    $(loginButton()).click();
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
