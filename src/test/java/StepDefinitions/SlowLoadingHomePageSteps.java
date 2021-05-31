package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class SlowLoadingHomePageSteps {
    @Given("user navigate to home page")
    public void navigateToHomePage(){
        HomePage.startLoadtime();
        HomePage.goToHomePage();
    }
    @Then("count number of loading times")
    public void countTimeLoadingPage(){
        HomePage.countloadTime();
//        Assert.assertTrue();
    }
}
