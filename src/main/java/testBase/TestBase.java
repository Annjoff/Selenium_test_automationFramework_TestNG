package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.*;
import reusableComponents.PropertiesOperations;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase extends ObjectRepo {



    public  void LaunchBrowserAndNavigate() throws Exception {
//read property file and get url and browser
        String browser = PropertiesOperations.getPropertyValueByKey("browser");
        String url = PropertiesOperations.getPropertyValueByKey("url");

        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(url);
    }
    @BeforeMethod
    public void setupMethod() throws Exception {
        LaunchBrowserAndNavigate();
        homepage=new HomepageObjects();
        vehData= new EnterVehicleDataPageObjects();
        proData=new EnterProductDataPageObjects();
        insData=new EnterInsuranceDataPageObjects();
        selectPrice=new SelectPriceOptionsPageObjects();
    }
    @AfterMethod
    public void tearDown(){
       // driver.quit();
    }
 }

