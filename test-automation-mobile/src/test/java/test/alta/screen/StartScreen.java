package test.alta.screen;

import com.github.javafaker.App;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.cucumber.java.bs.A;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class StartScreen extends BasePageObject {

  private By landingPage(){
    return MobileBy.xpath("//android.view.View[@content-desc=\"Mudah Bertukar\n" +
      "Informasi Bersama\n" +
      "Squad Space\"]");
  }
  private By skip(){
    return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lewati\"]");
  }

  private By next(){
    return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lanjutkan\"]");
  }

  private By register(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Daftar Akun\n" +
      "Tab 2 of 2\"]");
  }

  private By emailField(){
    return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
  }

  private By passField(){
    return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
  }

  private By loginButton(){
    return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
  }

  private By homePage(){
    return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Apa yang anda pikirkan ?\n" +
      "Post\"]");
  }
  private By usernameField(){
    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
  }
  private By emailOrPhoneField(){
    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
  }
  private By passwordField(){
    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
  }
  private By ageField(){
    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[4]");
  }
  private By registerButton(){
    return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");
  }
  private By successRegisMessage(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Akun Anda Sudah Terdaftar, Silahkan Login\"]");
  }
  private By errorMessageWthUsrRegis(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Username tidak boleh kosong\"]");
  }
  private By errorMessageNullRegis(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Username tidak boleh kosong\"]");
  }
  private By errorMessageWthEmailRegis(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Email tidak boleh kosong\"]");
  }
  private By errorMessageWthPassRegis(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Password tidak boleh kosong\"]");
  }
  private By errorMessageWthAgeRegis(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Umur tidak boleh kosong\"]");
  }
  private By errorMessageRegisteredMail(){
    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
  }

  private By errorMessageLogin(){
    return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
  }
  private By successBookmark(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Thread Telah Ditambahkan ke Bookmark\"]");
  }
  private By successFollow(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Thread Telah Diikuti\"]");
  }
  private By successThread(){
    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]");
  }
  private By createThread(){
    return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Apa yang anda pikirkan ?\n" +
      "Post\"]");
  }
  private By tapInputTitle(){
    return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Gambar/Video\"]/android.widget.EditText[1]");
  }
  private By bookmarkPage(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"1950\n" +
      "wb\n" +
      "Alessandra dan 155 lainnya\n" +
      "4 Komentar\"]");
  }
  private By profilePage(){
    return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"School\n" +
      "Tab 4 of 4\"]");
  }
  private By profileMenu(){
    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
  }
  private By bookmarkFeature(){
    return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Bookmarks\"]");
  }


  @Step
  public void onLandingPage(){
    waitUntilVisible(landingPage());
  }

  @Step
  public void clickSkip(){
    onClick(skip());
  }

  @Step
  public void clickNext(){
    onClick(next());
  }

  @Step
  public void clickTypeEmail(){
    onClick(emailField());
  }

  @Step
  public void inputEmail(String email){
    onType(emailField(), email);
  }

  @Step
  public void clickTypePass(){
    onClick(passField());
  }

  @Step
  public void inputPass(String pass){
    onType(passField(), pass);
  }

  @Step
  public void tapLoginButton(){
    onClick(loginButton());
  }

  @Step
  public void validateHomePage(){
    waitUntilVisible(homePage());
  }

  @Step
  public void getErrorMessage(){
    waitUntilVisible(errorMessageLogin());
  }

  @Step
  public void tapRegisterPage(){
    onClick(register());
  }

  @Step
  public void tapUsername(){
    onClick(usernameField());
  }

  @Step
  public void inputUsername(String username){
    onType(usernameField(), username);
  }

  @Step
  public void tapEmailorNumberPhone(){
    onClick(emailOrPhoneField());
  }

  @Step
  public void inputEmailorNumberPhone(String email){
    onType(emailOrPhoneField(), email);
  }

  @Step
  public void tapPassword(){
    onClick(passwordField());
  }

  @Step
  public void inputPassword(String password){
    onType(passwordField(), password);
  }

  @Step
  public void tapAge(){
    onClick(ageField());
  }

  @Step
  public void inputAge(String age){
    onType(ageField(), age);
  }

  @Step
  public void tapRegisterButton(){
    onClick(registerButton());
  }

  @Step
  public void validateRegister(){
    waitUntilVisible(successRegisMessage());
  }

  @Step
  public void getErrorMessageRegisWthUsr(){
    waitUntilVisible(errorMessageWthUsrRegis());
  }

  @Step public void geterrorMessageNullData(){
    waitUntilVisible(errorMessageNullRegis());
  }

  @Step public void getErrorMessageWthEmailRegis(){
    waitUntilVisible(errorMessageWthEmailRegis());
  }

  @Step public void getErrorMessageWthPassRegis(){
    waitUntilVisible(errorMessageWthPassRegis());
  }

  @Step public void getErrorMessageWthAgeRegis(){
    waitUntilVisible(errorMessageWthAgeRegis());
  }

  @Step public void getErrorMessageRegisteredMail(){
    waitUntilVisible(errorMessageRegisteredMail());
  }

  @Step public void getSuccessBookmark(){
    waitUntilVisible(successBookmark());
  }

  @Step public void getSuccessFollowThread(){
    waitUntilVisible(successFollow());
  }

  @Step public void getSuccessUploadThread(){
    waitUntilVisible(successThread());
  }

  @Step public void tapCreateThread(){
    onClick(createThread());
  }

  @Step public void getTapInputTitle(){
    onClick(tapInputTitle());
  }

  @Step public void validateBookmark(){
    isElementInvisible(bookmarkPage());
  }

  @Step public void tapProfilePage(){
    onClick(profilePage());
  }

  @Step public void tapProfileMenu(){
    onClick(profileMenu());
  }

  @Step public void tapBookmark(){
    onClick(bookmarkFeature());
  }


}
