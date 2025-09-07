package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SCOPEDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //1. Count the no. of link present on the page

        System.out.println("No of Total link count on the page: " + driver.findElements(By.tagName("a")).size());

        //2.Count no of links on the footer.

        WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
        System.out.println("No.of footer links: " + footerdriver.findElements(By.tagName("a")).size());

        //3.Count the links on one column of the footer page

        WebElement columndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(" No. of links on the column footer of one side: " + columndriver.findElements(By.tagName("a")).size());

        //4.Click on each link in the column and check if the pages are opening and also print their title name.

        for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
        {
            String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
            Thread.sleep(5000);
        }//opens all the links on different tabs

        Set<String> abc= driver.getWindowHandles();

        Iterator<String> it=abc.iterator();

        while(it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }




    }
}
