package UdemySDET.LocatorsDemo;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalenderTest {
    public static void main(String[] args){

        String month="9";
        String date="20";
        String year="2028";


        WebDriver driver=new ChromeDriver();
        String[] expectedList={month, date, year};

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        driver.findElement(By.xpath("//button[text()='"+ year +"']")).click();

        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();

        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();

        List<WebElement> actualList=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for(int i=0; i<actualList.size();i++){

            System.out.println(actualList.get(i).getAttribute("value"));
            Assert.assertEquals(actualList.get(i).getAttribute("value"),expectedList[i]);
        }
    }
}
