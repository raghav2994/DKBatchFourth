package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Assignment3UdemyE2EPage {
    public static void LoginPage(WebDriver driver){

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//input[@value='user']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement options= driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown=new Select(options);
        dropdown.selectByIndex(2);
        driver.findElement(By.xpath("//input[@id='terms']")).click();
        driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

    }
    public static void AddItems(WebDriver driver)
    {
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));
        List<WebElement> products = driver.findElements(By.xpath("//button[contains(text(),'Add')]"));

        int prodCount=products.size();
        System.out.println("Total product count = "+ prodCount);

        for(int i=0;i<products.size();i++)
        {
           WebElement addBtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add')]")));
           addBtn.click();
        }

        WebElement checkoutbutton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class*='btn-info']")));
        checkoutbutton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));



    }
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        LoginPage(driver);




        AddItems(driver);
    }
}
