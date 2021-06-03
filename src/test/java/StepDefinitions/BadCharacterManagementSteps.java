package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.ProfessionalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class BadCharacterManagementSteps {
    @And("navigate to professional page")
    public void navigateToProfessionalPage(){
        HomePage.navigateTopLinklongTermRental();
    }
    @Then("click to mark BMW")
    public void navigateToMarkBMW() throws IOException {
        ProfessionalPage.navigateToMarkBMW();
        ProfessionalPage.verifyNameMark();
    }
}
