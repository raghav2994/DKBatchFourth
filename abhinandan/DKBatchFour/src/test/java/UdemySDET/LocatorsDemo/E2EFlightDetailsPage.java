package UdemySDET.LocatorsDemo;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Objects;

public class E2EFlightDetailsPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
         //Country selection
        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(2000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[class=ui-menu-item] a"));

        for(WebElement option:options)
        {
            if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }
        }

        Thread.sleep(1000);
        //checkbox
        driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click();

        //source and destination selection
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='CCU']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();


        //calendar section
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();

        //Passenger selection
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        int i=1;
        while(i<3)
        {
            driver.findElement(By.id("hrefIncAdt")).click();//4 more adult selected
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();



        //currency selection

        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown =new Select(staticdropdown);
        dropdown.selectByIndex(1);
        //search option
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

    }
}
