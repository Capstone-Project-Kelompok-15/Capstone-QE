package test.alta.screen;

import com.github.javafaker.App;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.cucumber.java.bs.A;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class ThreadScreen extends BasePageObject {


//  private By tittleField(){
//    return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Gambar/Video\"]/android.widget.EditText[1]");
//  }
//  private By topicField(){
//    return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Gambar/Video\"]/android.widget.EditText[2]");
//  }
//  private By sendButton(){
//    return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Kirim\"]");
//  }



  private By newThreadMess(){
    return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]");
  }
  private By threadnewError(){
    return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View");
  }

  private By vldtMonthlyLdbPage(){
    return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Leaderboard\"]");
  }

  private By likeButton(){
    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
  }

  private By typeComment(){
    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText");
  }

  private By commentMessage(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Komentar telah terkirim\"]");
  }

  private By followUser(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"UU TENAGA KERJA\n" +
      "Brielle dan 155 lainnya\n" +
      "4 Komentar\"]");
  }

  private By threadMenu(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"cob-coba\n" +
      "23-06-2023\n" +
      "Nathan dan 155 lainnya\n" +
      "4 Komentar\"]/android.widget.ImageView[4]");
  }

  private By bookmarksThread(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Bookmark\"]");
  }

  private By addingMedia(){
    return AppiumBy.xpath("//android.widget.Button[@content-desc=\"add\"]");
  }
  private By messageSuccessFollowThrd(){
    return AppiumBy.xpath("//android.view.View[@content-desc=\"Thread Telah Diikuti\"]");
  }

//  private By addMedia(){
//    return AppiumBy.xpath("//android.widget.Button[@content-desc=\"add\"]");
//  }
//
//  private By searchThread(){
//    return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText");
//  }

//  @Step
//  public void tapCreateThread(){
//  }

//  @Step
//  public void clickTypeTittle(){
//    onClick(tittleField());
//  }

//  @Step
//  public void inputTittle(String tittle){
//    onType(tittleField(), tittle);
//  }

//  @Step
//  public void clickTypeTopic(){
//    onClick(topicField());
//  }

//  @Step
//  public void inputTopic(String topic){
//    onType(topicField(), topic);
//  }

//  @Step
//  public void clickSendButton(){
//    onClick(sendButton());
//  }

  public boolean validateNewThread(){
    return isElementInvisible(newThreadMess());
  }

  @Step
  public void getThreadErrorMessage(){
    isElementInvisible(threadnewError());
  }

  @Step
  public void validateLeaderboards(){
    isElementInvisible(vldtMonthlyLdbPage());
  }

  @Step
  public void validateLikedThread(){
    isElementInvisible(likeButton());
  }

  @Step
  public void clickTypeComment(){
    onClick(typeComment());
  }

  @Step
  public void inputComment(String comment){
    onType(typeComment(), comment);
  }

  @Step
  public void validateComment(){
    isElementInvisible(commentMessage());
  }

  @Step
  public void validateFollowUser(){
    isElementInvisible(followUser());
  }

  @Step
  public void tapThreadMenu(){
    onClick(threadMenu());
  }

  @Step
  public void validateBookmarks(){
    isElementInvisible(bookmarksThread());
  }

  @Step
  public void successFollow(){
    waitUntilVisible(messageSuccessFollowThrd());
  }


  //  @Step
//  public void getSearchThread(){
//    onClick(searchThread());
//  }
//
//  @Step
//  public void typeSearchThread(String search){
//    onType(searchThread(),search);
//  }

}

