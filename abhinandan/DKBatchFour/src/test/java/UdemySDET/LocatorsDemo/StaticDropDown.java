package UdemySDET.LocatorsDemo;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //select checkbox
        driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click();
       // System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());//to check true or false wheather it is selcted or not

        //count the number of checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());



        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown =new Select(staticdropdown);
        dropdown.selectByIndex(1);
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByVisibleText("AED");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByValue("INR");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        int i=1;
        while(i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();//4 more adult selected
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Thread.sleep(1000);

        //dynamic dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='CCU']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();







    }
}
