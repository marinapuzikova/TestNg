package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreconditionAndPostCondition {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am pre condition");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am post condition");
    }
    @Test
    public void test(){
        System.out.println("i am actual test");
    }

    @Test
    public void anothertest(){
        System.out.println("i am another test");
    }
}
