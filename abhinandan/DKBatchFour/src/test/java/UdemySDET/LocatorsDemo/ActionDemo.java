package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionDemo {
    public static void main(String[] args){
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_3bw860gpls_e&adgrpid=155259813553&hvpone=&hvptwo=&hvadid=674842289467&hvpos=&hvnetw=g&hvrand=7656230635862372145&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007829&hvtargid=kwd-489770084352&hydadcr=5650_2359487&gad_source=1");

        Actions a =new Actions(driver);

        //Composite Actions(double clicking the text and put that in caps)
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("toys").doubleClick().build().perform();

        //Move to specific element
        //Contextclick - to perform right click operation
        a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).contextClick().build().perform();


        }
    }

