package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class DataProviderDemo extends CommonMethods {

@DataProvider
    public Object[][] data(){
        Object[][] login=new Object[4][2];//number of rows 4 and number of columns 2
    //we are providing data below
        login[0][0] = "Admin";      //first row and first
        login[0][1] = "Hum@nhrm123";//and second column
        login[1][0] = "Admin";     //second row first
        login[1][1] = "Hum@nhrm123";//and second column
        login[2][0] = "Admin";      //third row first
        login[2][1] = "Hum@nhrm123";  //and second column
        login[3][0] = "Admin";
        login[3][1] = "Hum@nhrm123";
        return login;
    }


    //@Test perform login
    //if we want to execute one test case across of multiple sets of data to achieve data driven testing we can use data provider
    @Test(groups = "regression", dataProvider = "data")//"data" from line 17
    public void adminLogin(String username,String password) {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }

}
