package StepDefinitions;

import PageObjects.AnInternationalPatnerPage;
import PageObjects.ExpertiseAndProfessionPage;
import PageObjects.HomePage;
import PageObjects.ProductAndServicePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.io.IOException;

public class LinkNotFoundSteps {
    @And("At footer level click on an international partner")
    public void navigateToInternationalPartner(){
        HomePage.navigateToAnInternationalPatener();
    }

    @Then("The international partner page opens, in the navigation bar click on the expertise and professions tab")
    public void navigateToexpertiseAndProfessional(){
        AnInternationalPatnerPage.navigateToExpertiseLink();
    }

    @And("Scroller et faire un clic sur l'offre location longue durée d’Arval")
    public void scrollerEtFaireUnClicSurLOffreLocationLongueDuréeDArval() {
        ExpertiseAndProfessionPage.clicklongTermOffer();
        ExpertiseAndProfessionPage.navigateTopProductionAndServicePage();
    }

    @And("A drop-down description is displayed, click on the link discover products and services")
    public void aDropDownDescriptionIsDisplayedClickOnTheLinkDiscoverProductsAndServices() throws IOException {
        boolean isdisplay = ProductAndServicePage.getDiplayBlocError();
        Assert.assertFalse(isdisplay);
    }
}
