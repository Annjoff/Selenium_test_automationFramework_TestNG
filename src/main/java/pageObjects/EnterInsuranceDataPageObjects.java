package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

import java.util.List;

public class EnterInsuranceDataPageObjects extends TestBase {

    @FindBy(id = "firstname")
    WebElement txt_firstName;

    @FindBy(id = "lastname")
    WebElement txt_lastName;

    @FindBy(id ="birthdate")
    WebElement dd_dateOfBirth;

    @FindBy(xpath = "//input[@name='Gender']/parent::label")
   List<WebElement>  rdo_gender;

    @FindBy(id = "streetaddress")
    WebElement txt_streetAddress;

    @FindBy(id = "country")
    WebElement dd_country;

    @FindBy(id = "zipcode")
    WebElement txt_zipcode;

    @FindBy(id = "city")
    WebElement txt_city;

    @FindBy(id = "occupation")
    WebElement dd_occupation;

    @FindBy(xpath = "//input[@name='Hobbies']/parent::label")
   List<WebElement> chk_hobbies;

    @FindBy(id = "website")
    WebElement txt_website;

    @FindBy(id = "open")
    WebElement btn_open;

    @FindBy(id = "nextenterproductdata")
    WebElement btn_Next;

    public EnterInsuranceDataPageObjects(){
        PageFactory.initElements(driver,this);

    }
    public void enterInsuranceData() throws Exception {
        txt_firstName.sendKeys("John");
        txt_lastName.sendKeys("Peter");
        dd_dateOfBirth.sendKeys("23/09/1990");
        cm.selectRadioButtonValue(rdo_gender,"male");
        cm.selectDropDownOption(dd_country,"United Kingdom");
        txt_zipcode.sendKeys("12356");
        cm.selectDropDownOption(dd_occupation,"Selfemployed");
        cm.selectCheckBoxes(chk_hobbies, "speeding,other");
    }
    public void clickNextButton(){
        btn_Next.click();
    }
}
