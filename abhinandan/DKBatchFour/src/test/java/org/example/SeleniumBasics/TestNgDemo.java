package org.example.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestNgDemo {

    @Test
    public void successLoginTest() throws MalformedURLException {
        /*
        1. Browser is getting started
        2. Hitting the website
         */

        ChromeOptions cd = new ChromeOptions();
        WebDriver chromeDriver = new RemoteWebDriver(new URL("  http://192.168.29.125:4444"), cd);


        chromeDriver.get("https://demo.evershop.io/account/login");

        chromeDriver.findElement(By.xpath("//input[@name='email']"))
                .sendKeys("basuabhinandan99@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@name='password']"))
                .sendKeys("Abhi@12345");
        chromeDriver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
        public void LoginFailedSenario() throws MalformedURLException
        {


            ChromeOptions cd=new ChromeOptions();
            WebDriver chromeDriver =new RemoteWebDriver(new URL("  http://192.168.29.125:4444"), cd);


            chromeDriver.get("https://demo.evershop.io/account/login");

            chromeDriver.findElement(By.xpath("//input[@name='email']"))
                    .sendKeys("basuabhinandan99@gmail.com");
            chromeDriver.findElement(By.xpath("//input[@name='password']"))
                    .sendKeys("Abhi@123456");
            chromeDriver.findElement(By.xpath("//button[@type='submit']")).click();


        }
}


