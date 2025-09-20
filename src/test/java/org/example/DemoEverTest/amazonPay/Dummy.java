package org.example.DemoEverTest.amazonPay;

import MobileRecharge.AndroidMobileRecharg;
import MobileRecharge.MobileRechargeInterface;

public class Dummy {

    public static void main(String[] args){
        MobileRechargeInterface m = new AndroidMobileRecharg();
        m.openAmazon();
        m.openAmazonPay();
        m.openMobileRecharge();
        System.out.println(m.verifyMobileRechargeTitle());

    }
}
