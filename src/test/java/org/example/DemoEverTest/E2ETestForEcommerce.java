package org.example.DemoEverTest;

import demoEverModel.HomePageModel;
import demoEverModel.LoginModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class E2ETestForEcommerce {

    ChromeOptions chromeOptions;
    FirefoxOptions firefoxOptions;
    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(String browserName) throws MalformedURLException {
        switch(browserName){
            case "chrome":
                chromeOptions = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://192.168.68.109:4444"), chromeOptions);
                break;
            case "firefox":
                firefoxOptions = new FirefoxOptions();
                driver = new RemoteWebDriver(new URL("http://192.168.68.109:4444"), firefoxOptions);
                break;
        }
    }

    @Test
    public void addToCart() throws InterruptedException {

        LoginModel login = new LoginModel(driver);
        HomePageModel homePageModel = new HomePageModel(driver);
        login.enterTheURL()
                .fillCredentials("akhiljda@gmail.com", "Password")
                .clickSubmitButton();
        Thread.sleep(5000);
        homePageModel.clickOnProduct("Nike court vision low");
        System.out.println("Hello");
    }

    @Test
    public void monkeyTestForEnterMobileNumberPage() throws InterruptedException {

        LoginModel login = new LoginModel(driver);
        login.enterTheURL()
                .fillCredentials("akhiljda@gmail.com", "Password")
                .clickSubmitButton();

    }


    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}
