package class02;

import org.testng.annotations.Test;

public class EnableAndDisable {
    @Test(groups = "smoke")//by default its true
    public void firstTest() {

        System.out.println("i am a first test");
    }
    @Test(enabled = false)
    public void secondTest() {


        System.out.println("i am a second test");

    }
    @Test(groups = "smoke")
    public void thirdTest() {

        System.out.println("i am a third test");

    }

}
