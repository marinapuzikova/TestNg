package class02;

import org.testng.annotations.Test;

public class PriorityClass {
    @Test(priority = 1)
    public void thirdTest() {

        System.out.println("i am a third test");

    }
    @Test(priority = 2)
    public void secondTest() {


        System.out.println("i am a second test");

    }

    @Test(priority = 1)
    public void firstTest() {

        System.out.println("i am a first test");
    }

}
