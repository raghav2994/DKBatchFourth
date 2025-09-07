package org.example.SeleniumBasics;

import org.testng.annotations.*;

public class AnnotationClass {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuiteMethod(){ System.out.println("Before Suite is executed");}
    @BeforeClass
    public void beforeClassMethod(){ System.out.println("Before Class is executed");}
    @BeforeMethod
    public void beforeMethodMethod(){System.out.println("Before Method is executed");}
    @BeforeTest
    public void beforeTestMethod(){ System.out.println("Before Test is executed");}
    @Test(groups = "Sanity2", priority = 2)
    public void testOne() { System.out.println("Test 1 is executed");}
    @Test(priority = 1)
    public void testTwo() { System.out.println("Test 2 is executed");}
    @Test(priority = 0)
    public void testThree() { System.out.println("Test 3 is executed");}
    @AfterMethod
    public void afterMethodMethod() { System.out.println("After Method is executed");}
    @AfterClass
    public void afterClassMethod() { System.out.println("After Class is executed");}
    @AfterTest
    public void afterTestMethod() { System.out.println("After Test is executed");}
    @AfterSuite
    public void afterSuiteMethod() { System.out.println("After Suite is executed");}


}
