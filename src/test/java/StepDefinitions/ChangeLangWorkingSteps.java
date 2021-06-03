package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.And;

import java.io.IOException;

public class ChangeLangWorkingSteps {
    @And("change language website")
    public void changeLanguage() throws IOException {
        HomePage.getcontentdropdown();
    }
}
