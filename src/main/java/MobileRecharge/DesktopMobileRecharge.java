package MobileRecharge;

public class DesktopMobileRecharge implements MobileRechargeInterface{
    @Override
    public void openAmazon() {
        System.out.println("Opening Amazon in Desktop");
    }

    @Override
    public void openAmazonPay() {
        System.out.println("Opening Amazon Pay in Desktop");

    }

    @Override
    public void openMobileRecharge() {
        System.out.println("Opening Mobile Recharge in Desktop");

    }

    @Override
    public String verifyMobileRechargeTitle() {
        return "Mobile Recharge";
    }

    @Override
    public void xyz() {
        System.out.println("xyz");
    }
}
