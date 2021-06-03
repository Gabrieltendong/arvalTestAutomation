package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.And;

import java.io.IOException;

public class InsecureLinkSteps {
    @And("ckeck all link to verify insecure links")
    public void ckeckAllLink() throws IOException {
        HomePage.navigateAllLink();
    }
}
