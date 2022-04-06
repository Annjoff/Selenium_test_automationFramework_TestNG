package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

import java.util.List;

public class EnterProductDataPageObjects extends TestBase {

    @FindBy(id = "startdate")
    WebElement date_startDate;

    @FindBy(id = "insurancesum")
    WebElement dd_insuranceSum;

    @FindBy(id = "damageinsurance")
    WebElement dd_damageInsurance;

    @FindBy(xpath = "//input[@name='Optional Products[]']/parent::label")
    List<WebElement> chk_optionalProducts;

    @FindBy(id = "nextselectpriceoption")
    WebElement btn_Next;

    public EnterProductDataPageObjects(){
    PageFactory.initElements(driver,this);
    }

    public void enterProductData() throws Exception {
        date_startDate.sendKeys("04/25/2022");
        cm.selectDropDownOption(dd_insuranceSum,"3.000.000,00");
        cm.selectDropDownOption(dd_damageInsurance,"Partial Coverage");
        cm.selectCheckBoxes(chk_optionalProducts,"Euro Protection");

    }
   public void clickNextButton(){
        btn_Next.click();
   }
}
