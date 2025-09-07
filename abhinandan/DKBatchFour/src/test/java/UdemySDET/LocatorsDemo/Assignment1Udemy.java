package UdemySDET.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Udemy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //selecting the first checkbox
        WebElement firstCheckbox= driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
            firstCheckbox.click();
        //varify if it is checked
        if(firstCheckbox.isSelected()){
            System.out.println("Successful checked");
        }
        else{
        System.out.println("Not Successful");
        }
        Thread.sleep(2000);

        //uncheck the first checkbox

        firstCheckbox.click();
        if(!firstCheckbox.isSelected())
        {
            System.out.println("Successfully unchecked");
        }
        else{
            System.out.println("Checkbox is still checked");
        }


        //count the number of checkboxes
        System.out.println("Total no of checkboxes = " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());



    }
}
