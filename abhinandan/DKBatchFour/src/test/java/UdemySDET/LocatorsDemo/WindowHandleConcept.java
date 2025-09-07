package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleConcept {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();//to maximize the screen
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows= driver.getWindowHandles(); //[parentId,childId]
        Iterator<String> id= windows.iterator();
        String parentId= id.next();
        String childId= id.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        driver.findElement(By.cssSelector(".im-para.red")).getText();
        String emailid= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailid);

    }
}
