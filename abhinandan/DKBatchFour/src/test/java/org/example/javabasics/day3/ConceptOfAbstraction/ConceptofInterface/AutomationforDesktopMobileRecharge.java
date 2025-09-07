package org.example.javabasics.day3.ConceptOfAbstraction.ConceptofInterface;

public class AutomationforDesktopMobileRecharge implements MobileRechargeInterface{
    @Override
    public void clickOnMobileRecharge() {
        System.out.println("Clicking on Mobile Recharge via Desktop");
    }

    @Override
    public void addMobileNumber() {

    }
}
