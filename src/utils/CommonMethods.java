package utils;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonMethods {
    public static WebDriver driver;//static cause we want to use it everywhere
    //pre condition @beforeMethod launch browser
    @BeforeMethod(alwaysRun = true)
        public static void openBrowserAndLaunchApplication() {
        ConfigReader.readProperties("C:\\Users\\maris\\IdeaProjects\\TestNgBasicsBatch11\\src\\config\\config.properties");

        switch(ConfigReader.getPropertyValue("browser")){
            case"chrome":
                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:            //if we don't provide any name browser or simply do mistake in typing browser name
                throw new RuntimeException("Invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    //post condition @aftermethod close browser
    @AfterMethod(alwaysRun = true)
    public static void closeBrowser(){
        driver.quit();
    }
}
