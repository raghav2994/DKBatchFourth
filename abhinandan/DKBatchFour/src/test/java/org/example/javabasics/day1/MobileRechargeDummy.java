package org.example.javabasics.day1;

public class MobileRechargeDummy {
    static String amazonHomePage = "Opening amazon Home Page";



    static String amazonPayIcon="Clicking on amazon pay icon";
    static String mobileRechargeIcon="Opening a value";
    static String MobileRechargeTitle="Mobile Recharge";

    public static void openingAmazonHomePage(){
        System.out.println(amazonHomePage);

    }

    public static void clickOnAmazonPayIcon(){
        System.out.println(amazonPayIcon);
    }

    public static void clickOnMobileRechargeCategory(){
        System.out.println(mobileRechargeIcon);
    }
    public static String FetchTitle(){
        return MobileRechargeTitle;
    }

    public static void main(String[] args){
        openingAmazonHomePage();
        clickOnAmazonPayIcon();
        clickOnMobileRechargeCategory();
        System.out.println( FetchTitle());
    }


}
