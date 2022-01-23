package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class HardAssertion extends CommonMethods {

    @Test()
    public void validationOfTitle(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Human Maaaaanagement System";
        //we write this line instead of if condition
        Assert.assertEquals(actualTitle,expectedTitle);//hard assertion it will stop the execution if it contains the error
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
        Assert.assertTrue(username.isDisplayed());//we write this line instead of if condition
        System.out.println("I am test code");
      /*  if (expectedTitle.equals(actualTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("test failed");
        }*/
    }

}
