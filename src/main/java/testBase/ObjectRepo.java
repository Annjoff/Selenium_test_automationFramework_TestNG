package testBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import pageObjects.*;
import reusableComponents.CommonMethods;

public class ObjectRepo {
    //objects to access pages created here,then objectrepo extends to testbase which extends to testcases
    //achieving multilevel inheritance
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;
   public static HomepageObjects homepage;
   public static EnterVehicleDataPageObjects vehData;
   public static EnterProductDataPageObjects proData;
   public static EnterInsuranceDataPageObjects insData;
   public static SelectPriceOptionsPageObjects selectPrice;

   public CommonMethods cm= new CommonMethods();
}
