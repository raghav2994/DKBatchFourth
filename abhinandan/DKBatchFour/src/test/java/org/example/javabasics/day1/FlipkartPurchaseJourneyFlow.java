package org.example.javabasics.day1;

public class FlipkartPurchaseJourneyFlow {
    static String FlipkartHomePAge = "Opening Flipkart Home Page";
    static String SelectProduct = "Selected the Item";
    static String AddToCartProduct = "Added the Item to Cart Succesfully";
    static String ProductTitle = "   -->BOAT HEADPHONE";
    static String CheckoutPage = "Checkout options Pop-out";
    static String SelectAddress = "Select Address to proceed to payment screen";
    static String SelectPaymentMethod = "Selected the Payment option as ---> COD ";
    static String OrderPlacedPage= "Order placed Successfully";
    static String OrderIsPlacedTitle = "---THANK YOU your order is placed--- ";

    public static void OpeningFlipkartHomePage(){
        System.out.println(FlipkartHomePAge);
    }
    public static void SelectProductItem(){
        System.out.println(SelectProduct);
    }
    public static void AddToCartItem(){
        System.out.println(AddToCartProduct);
    }
    public static String ProductTitle(){
        return ProductTitle;
    }
    public static void ProceedToCheckoutPage(){
        System.out.println(CheckoutPage);

    }
    public static void SelectAddressOption(){
        System.out.println(SelectAddress);
    }
    public static void SelectPaymentOption()
    {
        System.out.println(SelectPaymentMethod);
    }
    public static void RetractOrderPlacedCaption(){
        System.out.println(OrderPlacedPage);

    }
    public static String OrderPlacedTitle()
    {
        return OrderIsPlacedTitle;
    }


    public static void main(String[] args)
    {
        OpeningFlipkartHomePage();
        SelectProductItem();
        AddToCartItem();
        System.out.println(ProductTitle());
        ProceedToCheckoutPage();
        SelectAddressOption();
        SelectPaymentOption();
        RetractOrderPlacedCaption();
        System.out.println(OrderPlacedTitle());
    }
}
