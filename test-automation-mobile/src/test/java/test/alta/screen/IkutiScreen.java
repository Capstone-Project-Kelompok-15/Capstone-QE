package test.alta.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class IkutiScreen extends BasePageObject {

  private By threadFollowedPengguna(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Pengguna\n" +
      "Tab 2 of 2\"]");
  }

  @Step
  public void tapIkutiPengguna(){
    onClick(threadFollowedPengguna());
  }

  @Step
  public void validateViewFlwdUser(){
    isElementInvisible(threadFollowedPengguna());
  }

}
