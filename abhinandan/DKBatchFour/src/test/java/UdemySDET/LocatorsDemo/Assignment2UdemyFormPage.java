package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2UdemyFormPage {
    public static void main(String[] args){

        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("Abhinandan Basu");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("basuabhinandan99@gmail.com");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Abhi@12345");
        driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();

        WebElement dropmenu = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown =new Select(dropmenu);

        dropdown.selectByIndex(0);

        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20/09/2001");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

    }
}
