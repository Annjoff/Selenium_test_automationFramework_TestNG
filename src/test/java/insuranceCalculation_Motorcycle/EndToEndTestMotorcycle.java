package insuranceCalculation_Motorcycle;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testBase.TestBase;

public class EndToEndTestMotorcycle extends TestBase {

    @Test
    public void insuranceCalculate() throws Exception {
        homepage.clickOnMotorcycleLink();
        vehData.enterVehicleData();
        vehData.clickOnNextButton();
        insData.enterInsuranceData();
        insData.clickNextButton();
        proData.enterProductData();
        proData.clickNextButton();

       String expectedSilverPlanPrice = "241.00";
       String actualSilverPlanPrice= selectPrice.getPriceForSelectedOption("Silver");
        Assert.assertEquals(actualSilverPlanPrice,expectedSilverPlanPrice);

        selectPrice.selectPriceOption("silver");

		selectPrice.clickOnNextButton();
}
}
