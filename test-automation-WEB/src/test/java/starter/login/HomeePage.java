package starter.login;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomeePage extends PageObject {
  private By containerHomePage(){
    return By.className("container");
  }
  @Step
  public static OpenUrl url(String targetUrl) {
    return new OpenUrl(targetUrl);
  }
  @Step
  public void openTheHomePage(){
    $(containerHomePage()).isDisplayed();
  }

}
