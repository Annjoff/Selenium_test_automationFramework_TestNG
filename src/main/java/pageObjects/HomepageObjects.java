package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

public class HomepageObjects extends TestBase {

    @FindBy(id = "nav_automobile")
    WebElement link_automobile;

    @FindBy(id = "nav_truck")
    WebElement link_truck;

    @FindBy(id = "nav_motorcycle")
    WebElement link_motorcycle;

    @FindBy(id = "nav_camper")
    WebElement link_camper;

//constructor- to use initElements method
    public HomepageObjects(){
        PageFactory.initElements(driver,this);
    }

    public void clickOnMotorcycleLink(){
        link_motorcycle.click();
    }
}
