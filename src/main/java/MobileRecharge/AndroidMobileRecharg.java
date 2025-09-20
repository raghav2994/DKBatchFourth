package MobileRecharge;

public class AndroidMobileRecharg implements MobileRechargeInterface{
    @Override
    public void openAmazon() {
        System.out.println("Opening Amazon in Android");

    }

    @Override
    public void openAmazonPay() {
        System.out.println("Opening Amazon Pay in Android");

    }

    @Override
    public void openMobileRecharge() {
        System.out.println("Opening Mobile Recharge in Android");

    }

    @Override
    public String verifyMobileRechargeTitle() {
        return "Mobile Recharge";
    }

    @Override
    public void xyz() {}
}
