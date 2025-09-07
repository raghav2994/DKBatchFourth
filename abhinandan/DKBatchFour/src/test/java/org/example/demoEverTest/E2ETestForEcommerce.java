package org.example.demoEverTest;

import org.example.PageObjectModelConcept.demoEverModel.HomePageModel;
import org.example.PageObjectModelConcept.demoEverModel.LoginModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class E2ETestForEcommerce {
    ChromeOptions chromeOptions;
    //FirefoxOptions firefoxOptions;
    EdgeOptions edgeOptions;
    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(String browserName) throws MalformedURLException {
        switch(browserName){
            case "chrome":
                chromeOptions = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://192.168.29.125:4444"), chromeOptions);
                break;
            case "edge":
                edgeOptions = new EdgeOptions();
                driver = new RemoteWebDriver(new URL("http://192.168.29.125:4444"), edgeOptions);
                break;
        }
    }
    @Test
    @Parameters({"username", "password"})
    public void addToCart(String username, String password) throws InterruptedException {
        LoginModel login =new LoginModel(driver);
        HomePageModel homePageModel = new HomePageModel(driver);
        login.enterTheURL()
                .fillCredential(username, password)
                .clickOnTheSubmitButton();
    Thread.sleep(5000);
        homePageModel.clickOnProduct("Nike react infinity run flyknit");
    }



//    @AfterMethod
//    public void tearDown()
//    {
//        if(wd!=null)
//            wd.quit();
//    }
}
