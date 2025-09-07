package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6Udemy {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String Storeoption = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
        Select dd = new Select(dropdown);
        dd.selectByVisibleText(Storeoption);

        driver.findElement(By.id("name")).sendKeys(Storeoption);
        driver.findElement(By.id("alertbtn")).click();

        String text = driver.switchTo().alert().getText();

        if (text.contains(Storeoption)){
            System.out.println("Alert message Successful");

        }
        else{
            System.out.println("Something went wrong, unsuccessful!");
        }




    }
}
