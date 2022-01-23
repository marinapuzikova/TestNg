package class01;

import org.testng.annotations.*;

public class BeforeAndAfterClass {
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
    @Test
    public void thirdTest() {

        System.out.println("i am a third test");

    }

    @Test
    public void secondTest() {


        System.out.println("i am a second test");

    }

    @Test
    public void firstTest() {

        System.out.println("i am a first test");
    }
}
