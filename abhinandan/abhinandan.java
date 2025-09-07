package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class abhinandan {
    public static void main(String[] args){

        WebDriver driver =new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Click Here']")));

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> id= windows.iterator();
        String parentId= id.next();
        String childId=id.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".example")).getText());
        driver.findElement(By.cssSelector(".example")).getText();
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//h3")).getText());
    }
}
