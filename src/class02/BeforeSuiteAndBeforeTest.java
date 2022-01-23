package class02;

import org.testng.annotations.*;

public class BeforeSuiteAndBeforeTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("i am after suit");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("i am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("i am after test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("i am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("i am after class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("i am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @Test(groups = "alfadhli")
    public void regressionlTest(){
        System.out.println("I am regression test");
    }
    @Test(groups = "smoke")
    public void smokelTest(){
        System.out.println("I am smoke test");
    }
}
