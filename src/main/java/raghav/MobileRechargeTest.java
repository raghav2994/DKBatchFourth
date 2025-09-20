package raghav;

import MobileRecharge.anjali;

public class MobileRechargeTest {

        static String amazonUrl = "...";
        String AmazonPayTile = "Clicked on it";
        String MobileRechargeTile = "Clicked on Mobile Recharge";
        String title = "Mobile Recharge";

        public static void main(String[] args){
            Class2 raghav = new Class2();
            raghav.abc();
            raghav.xyz();

            anjali an = new anjali();
            an.anjaliPillai();


        }

        public static void openAmazon(){
            System.out.println(amazonUrl); // Business logic
        }

        public void clickOnAmazonPay(){
            System.out.println(AmazonPayTile);
        }

        public void clickOnMobileRecharge(){
            System.out.println(MobileRechargeTile);
        }

        public String fetchTitle(){
            return title;
        }

    }

