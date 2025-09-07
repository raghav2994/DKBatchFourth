package org.example.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectorshubwebsite {
    public static void main(String[] args)
    {
        ChromeDriver cd=new ChromeDriver();
        cd.get("https://selectorshub.com/xpath-practice-page/");

        cd.findElement(By.xpath("//input[@name='email']"))
                .sendKeys("basuabhinandan99@gmail.com");
        cd.findElement(By.xpath("//input[@name='Password']"))
                .sendKeys("Abhi@12345");
        cd.findElement(By.xpath("//input[@name='company']"))
                .sendKeys("Infor(India) pvt. ltd.");
        cd.findElement(By.xpath("//input[@name='mobile number']"))
                .sendKeys("9144243431");
        cd.findElement(By.xpath("//label[text()='Country']"))
                .sendKeys("India");
        cd.findElement(By.xpath("//button[@value='Submit']"));

        cd.findElement(By.xpath("//input[@id='inp_val']"))
                .sendKeys("Mimi");


        cd.findElement(By.xpath("//input[@id='cardName']"))
                .sendKeys("Abhinandan Basu");
        cd.findElement(By.xpath("//input[@id='cardNumber']"))
                .sendKeys("1235612357123214");
        cd.findElement(By.xpath("//input[@id='expiry']"))
                .sendKeys("08/31");
        cd.findElement(By.xpath("//input[@id='cvv']"))
                .sendKeys("999");
        cd.findElement(By.xpath("//button[@type='submit']"));

    }
}
