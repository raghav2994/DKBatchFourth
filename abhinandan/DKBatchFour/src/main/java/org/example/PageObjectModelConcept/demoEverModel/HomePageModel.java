package org.example.PageObjectModelConcept.demoEverModel;

import org.openqa.selenium.*;

public class HomePageModel {
    WebDriver wd;
    private String itemTextLinkXpathLocator= "//div[@class ='listing-tem']//a/span[text()='**#']";

    public HomePageModel(WebDriver driver)
    {
        this.wd=driver;
    }

    public void clickOnProduct(String itemName){

        String itemTextLocator = itemTextLinkXpathLocator.replace("**#",itemName);
        By productXpath=By.xpath(itemTextLocator);
        WebElement itemElement= wd.findElement(productXpath);
        scrollToElement(itemElement);
        wd.findElement(productXpath).click();
    }

    private void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


}
