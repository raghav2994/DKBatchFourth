package org.example.PageObjectModelConcept.demoEverModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModel {

    WebDriver wd;
    private By email= By.name("email");
    private By password = By.name("password");
    private String LoginURL = "https://demo.evershop.io/account/login";
    private By SubmitButton = By.xpath("//button[@type='submit']");
    //private By ClickOnProduct = By.xpath("(//a[contains(@href,'/men')])[2]");

    public LoginModel(WebDriver driver)
    {
        this.wd=driver;
    }

    public LoginModel enterTheURL()
    {
        wd.get(LoginURL);
        return this;
    }

    public LoginModel fillCredential(String emailId, String passwordfield)
    {
        wd.findElement(email).sendKeys(emailId);
        wd.findElement(password).sendKeys(passwordfield);
        return this;
    }

    public void clickOnTheSubmitButton(){
        wd.findElement(SubmitButton).click();

    }




}
