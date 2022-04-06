package reusableComponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CommonMethods {

    public void selectDropDownOption(WebElement element, String valueToBeSelected) throws Exception {
        Select os =new Select(element);
        try {
            os.selectByVisibleText(valueToBeSelected);
        } catch(Exception e) {
            throw new Exception("Value is not present in dropdown for WebElement: "+element + "Value to be selected is: "+valueToBeSelected);
        }
    }

    public List<String> getDropDownOptionsAsList(WebElement element){
        Select values= new Select(element);
        List<WebElement> list_webElement_model=values.getOptions();
        List<String> actualValues= new ArrayList<String>();
        for(WebElement ref : list_webElement_model){
            actualValues.add(ref.getText());
        }
        return actualValues;
    }
    public void selectRadioButtonValue(List<WebElement> element,String valueToBeSelected){
        for(WebElement ref : element){
            if(ref.getText().equalsIgnoreCase(valueToBeSelected)) {
                ref.click();
                break;
            }
        }

    }
    //selecting check boxes
    public void selectCheckBoxes(List<WebElement> element, String checks) {
        String[] checksArray = checks.split(",");
        for (String str : checksArray) {   //speeding, Other
            for (WebElement ele : element) {
                if(ele.getText().equalsIgnoreCase(str)) {
                    ele.click();
                    break;
                }
            }
        } }
}
