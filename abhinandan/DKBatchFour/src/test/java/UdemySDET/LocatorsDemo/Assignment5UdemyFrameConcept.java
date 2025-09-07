package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5UdemyFrameConcept {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");

            driver.findElement(By.linkText("Frames")).click();
            driver.findElement(By.linkText("Nested Frames")).click();

            driver.switchTo().frame("frame-top");
            driver.switchTo().frame("frame-middle");

            System.out.println(driver.findElement(By.id("content")).getText());

    }
}
