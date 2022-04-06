package insuranceCalculation_Motorcycle;

import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

import java.util.Arrays;
import java.util.List;

public class ErrorTestsMotorcycle extends TestBase {
    @Test(enabled = false)
    public void errorMessage_payloadField() {
        homepage.clickOnMotorcycleLink();
        vehData.enterCylinderCapacity("3333");
        String actualErrorMessage = vehData.getErrorMessageOnCylinderCapacity();
        String expectedErrorMessage = "Must be a number between 1 and 2000";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "error message displayed as expected");
        //System.out.println(actualErrorMessage);
    }

    @Test(enabled = false)
    public void verifyDropdownOptions_model() {
        homepage.clickOnMotorcycleLink();
        List<String> actualValues = vehData.getDropdownValues_model();
        test.log(Status.INFO, "Actual dd contents for model dd is: " + actualValues);
        List<String> expectedValues = Arrays.asList("– please select –", "Scooter", "Three-Wheeler", "Moped", "Motorcycle");
        test.log(Status.INFO, "Expected dd contents for model dd is: " + expectedValues);
        Assert.assertEquals(actualValues, expectedValues, "Error in Dropdown options compare at Model Dropdown");
    }

    @Test(enabled = false)
    public void verifyDropdownOptions_make() {
        homepage.clickOnMotorcycleLink();
        List<String> actualValues = vehData.getDropdownValues_make();
        test.log(Status.INFO, "Actual dd contents for make dd is: " + actualValues);
        List<String> expectedValues = Arrays.asList("– please select –", "Audi", "BMW", "Ford", "Honda", "Mazda", "Mercedes Benz", "Nissan", "Opel",
                "Porsche", "Renault", "Skoda", "Suzuki", "Toyota", "Volkswagen", "Volvo");
        test.log(Status.INFO, "Expected dd contents for make dd is: " + expectedValues);
        Assert.assertEquals(actualValues, expectedValues, "Error in Dropdown options compare at make Dropdown");
    }



}


