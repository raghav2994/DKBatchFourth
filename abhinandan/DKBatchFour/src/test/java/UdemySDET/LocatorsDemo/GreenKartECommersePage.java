package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GreenKartECommersePage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        //implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        //explicit wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));

        String[] itemsneeded={"Cucumber", "Brocolli", "Mushroom", "Mango"};
        Thread.sleep(5000);
        addItems(driver, itemsneeded);

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input.promocode"))));

        driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        //explicit wait

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


    }

    public static void addItems(WebDriver driver,String[] itemsneeded){
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        int j=0;
        for(int i=0;i< products.size();i++)
        {
            String[] name = products.get(i).getText().split("-");
            String formattingName = name[0].trim();

            //Convert array to array list for easy search
            //Check whether you name extracted is present or not

            List itemNeededList= Arrays.asList(itemsneeded);

            if(itemNeededList.contains(formattingName))
            {
                j++;
                //Add item to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(j==itemsneeded.length)
                {
                    break;
                }
            }


        }
    }
}
