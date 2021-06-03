package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.SolutionManageParcPage;
import PageObjects.WhyArvalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class ImageNotLoadSteps {
    @And("navigate to link Fleet management solutions")
    public void navigateToLinkFleetManagementSolutions(){
        HomePage.navigateToSolutionManageParc();
    }

    @And("navigate to link Why arval")
    public void navigateToLinkWhyArval(){
        SolutionManageParcPage.navigateToWhyArval();
    }

    @Then("see image header not load")
    public void checkLoadImage() throws IOException {
        WhyArvalPage.verifyLoadImage();
    }
}
