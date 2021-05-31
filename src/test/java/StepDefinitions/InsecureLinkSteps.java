package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.And;

public class InsecureLinkSteps {
    @And("ckeck all link to verify insecure links")
    public void ckeckAllLink(){
        HomePage.navigateAllLink();
    }
}
