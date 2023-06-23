package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pagesobject.BasePageObject;

public class LandingScreen extends BasePageObject {
    private By landingPage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }

    @Step
    public boolean isOnLandingPage(){
        return waitUntilVisible(landingPage()).isDisplayed();
    }
}
