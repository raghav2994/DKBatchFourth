package amazonPayModel;

public class AndroidMobileRecharge implements MobileRecharge{
    @Override
    public void openAmazon() {
        System.out.println("Opening Amazon in Android");
    }

    @Override
    public void clickOnAmazonPay() {
        System.out.println("Opening Amazon Pay in Android");

    }

    @Override
    public void clickOnMobileRecharge() {
        System.out.println("Clicking on Mobile Recharge in Android");

    }

    @Override
    public String fetchTitle() {
        return "Mobile Recharge";
    }
}
