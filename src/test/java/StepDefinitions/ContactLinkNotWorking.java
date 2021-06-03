package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.io.IOException;

public class ContactLinkNotWorking {
    @And("search car")
    public void searchCar() throws InterruptedException {
        HomePage.selectMarque();
        HomePage.clickBtnSearch();
    }
    @Then("click on button \"Contact us\"")
    public void clickOnButtonContact() throws IOException {
        Assert.assertTrue(HomePage.getUrlContact());
    }
}
