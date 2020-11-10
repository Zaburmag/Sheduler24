package com.sch.tests.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public AppiumDriver driver;
    DesiredCapabilities capabilities;

    UserHelper userHelper;
    EventHelper eventHelper;


    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "qa_24_8");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("appPackage", "com.example.svetlana.scheduler");
        capabilities.setCapability("appActivity", "presentation.splashScreen.SplashScreenActivity");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app", "C:\\Users\\yulia\\Downloads\\v.0.0.3 (2).apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );

        userHelper = new UserHelper(driver);
        eventHelper = new EventHelper(driver);
    }

    public void stop(){
        driver.quit();
    }

    public String getAppVersion(){
        return driver.findElement(By.xpath("app_version_res")).getText();
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public EventHelper getEventHelper() {
        return eventHelper;
    }
}
