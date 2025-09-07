package org.example.javabasics.day2.methodconcept;

public class DemoEverWebsite {

    /*
   Test Case 1:
    1. open the browser and hit the login url
    2. Enter valid username and password
    3. Click the submit button
    4. Varify if customer is logged in successfully

    Test Case 2:
    1. open the browser and hit the login url
    2. Enter invalid username and password
    3. Click the submit button
    4. Customer will see error message

    */

    public static void openBrowser()
    {
        System.out.println("Opening the browser with login url");
    }
    public static void enterUNandPW(String UN, String PW)
    {
        System.out.println("Username is " +UN);
        System.out.println("Password is "+ PW);

    }
    public static void clickOnSubmitButton(){
        System.out.println("Clicked on Submit Button");
    }

    public static String errorMessage(){
        return "Invalid UN or PW";
    }

    public static void main(String[] args){

        System.out.println("Test Case 1 is being executed");
        openBrowser();
        enterUNandPW("basuabhinandan99@gmail.com", "Abhi@9144243431");
        clickOnSubmitButton();

        System.out.println("Test Case 2 is being executed");
        openBrowser();
        enterUNandPW("fewhbfwhc@gmail.com", "cwcwcfeve");
        clickOnSubmitButton();
        String actualMessage = errorMessage();

        System.out.println(actualMessage);
    }
}
