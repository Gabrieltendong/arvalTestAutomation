package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.ProfessionalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BadCharacterManagementSteps {
    @And("navigate to professional page")
    public void navigateToProfessionalPage(){
        HomePage.navigateTopLinklongTermRental();
    }
    @Then("click to mark BMW")
    public void navigateToMarkBMW(){
        ProfessionalPage.navigateToMarkBMW();
        ProfessionalPage.verifyNameMark();
    }
}
