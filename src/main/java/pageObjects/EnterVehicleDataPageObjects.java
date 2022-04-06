package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testBase.TestBase;

import java.util.ArrayList;
import java.util.List;

public class EnterVehicleDataPageObjects extends TestBase {

    @FindBy(id = "make")
    WebElement dd_make;

    @FindBy(id = "model")
    WebElement dd_model;

    @FindBy(id = "cylindercapacity")
    WebElement txt_cylinderCapacity;

    @FindBy(xpath = "//input[@id='cylindercapacity']/following-sibling::span[@class='error']")
    WebElement error_cylinderCapacity;

    @FindBy(id = "engineperformance")
    WebElement txt_enginePerformance;

    @FindBy(id = "dateofmanufacture")
    WebElement date_dateOfManufacture;

    @FindBy(id = "numberofseatsmotorcycle")
    WebElement dd_numberOfSeats;

    @FindBy(id = "listprice")
    WebElement txt_listPrice;

    @FindBy(id = "annualmileage")
    WebElement txt_annualMileage;

    @FindBy(id = "nextenterinsurantdata")
    WebElement btn_Next;

    public EnterVehicleDataPageObjects(){
        PageFactory.initElements(driver,this);
    }
public void enterCylinderCapacity(String cylinderCap){
        txt_cylinderCapacity.sendKeys(cylinderCap);
}
public String getErrorMessageOnCylinderCapacity(){
        return error_cylinderCapacity.getText();
}
public List<String> getDropdownValues_model(){
      return cm.getDropDownOptionsAsList(dd_model);
}
public List<String> getDropdownValues_make(){
        return cm.getDropDownOptionsAsList(dd_make);
}
public void enterVehicleData() throws Exception {
        cm.selectDropDownOption(dd_make,"BMW");
        cm.selectDropDownOption(dd_model,"Moped");
        txt_cylinderCapacity.sendKeys("333");
        txt_enginePerformance.sendKeys("555");
        date_dateOfManufacture.sendKeys("12/02/2020");
        cm.selectDropDownOption(dd_numberOfSeats,"2");
        txt_listPrice.sendKeys("2345");
        txt_annualMileage.sendKeys("3456");
}
public void clickOnNextButton(){
 btn_Next.click();
}
}
