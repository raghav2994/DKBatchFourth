package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Locale;

public class Assignmnet8UdemyAutoCompleteDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");

        driver.findElement(By.id("autocomplete")).sendKeys("aus");
        Thread.sleep(3000);
//        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//
//
//        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));

        for(WebElement option:options)
        {
            if(option.getText().equalsIgnoreCase("Australia")){
                option.click();
                break;
            }

        }


    }
}
