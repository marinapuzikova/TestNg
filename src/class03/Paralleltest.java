package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class Paralleltest extends CommonMethods {

    //@Test perform login
    @Test(groups = "regression", enabled = true)
    public void adminLogin() {
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");

        WebElement pass = driver.findElement(By.cssSelector("input#txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(groups = "regression")
    public void validationOfTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Management System";
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test is passed");
        } else {
            System.out.println("test failed");
        }
    }

    @Test(groups = "regression")
    public void validationOfTitle2() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Management System";
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test is passed");
        } else {
            System.out.println("test failed");
        }
    }
}
