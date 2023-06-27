package test.alta.driver;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AndroidDriverPool {

  private static AndroidDriver driver;

  public static AndroidDriver create() {
    String appiumUrl = "http://127.0.0.1:4723/wd/hub/";
    driver = null;

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
    caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "AltaMobile");
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
    caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + File.separator + "app/app-release-FIXBGT.apk");


    try {
      driver = new AndroidDriver(new URL(appiumUrl), caps);
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    return driver;
  }

  public static void pressBack() {
    driver.pressKey(new KeyEvent(AndroidKey.BACK));
  }

  public static void tapByCoordinates(int x, int y) {
    new TouchAction(driver)
      .tap(PointOption.point(x, y))
      .perform();
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

  public static void pressKeyboardKey(AndroidKey key) {
    driver.pressKey(new KeyEvent(key));
  }

  public static void ScrollDown(){
      Dimension size = driver.manage().window().getSize();
      int start = (int) (size.height * 0.8);
      int end = (int) (size.height * 0.2);
      int x = (int) (size.width * 0.5);

      TouchAction<?> action = new TouchAction<>(driver);
      action.press(PointOption.point(x, start))
        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
        .moveTo(PointOption.point(x, end))
        .release()
        .perform();
  }

}


