package amazonPayModel;

public class DesktopMobileRecharge implements MobileRecharge{


    @Override
    public void openAmazon() {
        System.out.println("Opening Amazon in Desktop");
    }

    @Override
    public void clickOnAmazonPay() {
        System.out.println("Opening Amazon Pay in Desktop");

    }

    @Override
    public void clickOnMobileRecharge() {
        System.out.println("Clicking on Mobile Recharge in Desktop");

    }

    @Override
    public String fetchTitle() {
        return "Mobile Recharge";
    }
}
