package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.ProfessionalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class IncorretAlignmentComponentSteps {
    @And("navigate to \"a car in long term rental\"")
    public void navigateToCarInLongTermRental(){
        HomePage.navigateTopLinklongTermRental();
    }
    @Then("verfiy position element")
    public void verfiyPositionElement() throws IOException {
        ProfessionalPage.comparePosition();
    }
}
