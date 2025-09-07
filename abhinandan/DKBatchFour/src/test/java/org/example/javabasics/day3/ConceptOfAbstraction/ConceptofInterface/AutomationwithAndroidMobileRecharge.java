package org.example.javabasics.day3.ConceptOfAbstraction.ConceptofInterface;

public class AutomationwithAndroidMobileRecharge implements MobileRechargeInterface{
    @Override
    public void clickOnMobileRecharge() {
        System.out.println("Clicking on Mobile Recharge via Android");
    }

    @Override
    public void addMobileNumber() {
        System.out.println("Mobile number added");
    }
}
