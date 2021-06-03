package StepDefinitions;

import PageObjects.AboutPage;
import PageObjects.CareerPage;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.IOException;

public class IneffectiveJobSearchFilterSteps {

    private static final String MESSAGE_EMPTY_RESULT = "Aucun contenu ne correspond à vos critères.";

    @And("Click on the link About Arval")
    public void ClickOnTheLinkAboutArval(){
        HomePage.navigateToAboutArval();
    }
    @And("Click on the link 'Careers & jobs'")
    public void ClickOnTheLinkCareersJobs(){
        AboutPage.navigateToJobAndCareer();
    }
    @Then("Select 'CDI' from the <<I'm looking for>> link")
    public void SelectCareerCDI() throws IOException {
        CareerPage.hoverSearchBtn();
        CareerPage.clickCareerCDIlink();
//        System.out.println("boolean: " + );
        Assert.assertFalse(CareerPage.getText());
    }
}
