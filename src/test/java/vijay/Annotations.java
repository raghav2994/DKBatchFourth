package vijay;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    public void beforeSuiteMethod()
    {
        System.out.println("Before Suite is executed");
    }

    @BeforeClass
    public void beforeClassMethod()
    {
        System.out.println("Before Class is executed");
    }

    @BeforeMethod
    public void beforeMethodMethod()
    {
        System.out.println("Before Method is executed");
    }

    @BeforeTest
    public void beforeTestMethod()
    {
        System.out.println("Before Test  is executed");
    }

    @Test
    public void testOne()
    {
        System.out.println("Test one method is executed");
    }

    @Test
    public void testTwo()
    {
        System.out.println("Test two method is executed in the end");
    }

    @Test
    public void testThree()
    {
        System.out.println("Test three method is executed");
    }

//    @Test(groups = {"sanity"},priority = 1)
//    public void testOne()
//    {
//        System.out.println("Test 1 is executed");
//    }

    @AfterSuite
    public void afterSuiteMethod()
    {
        System.out.println("After suite method is executed");
    }

    @AfterClass
    public void afterClassMethod()
    {
        System.out.println("After class is executed");
    }

    @AfterMethod
    public void afterMethodMethod()
    {
        System.out.println("After method is executed");
    }

    @AfterTest
    public void afterTestMethod()
    {
        System.out.println("After test  is executed");
    }
}
