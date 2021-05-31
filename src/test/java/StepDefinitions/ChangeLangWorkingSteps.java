package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.And;

public class ChangeLangWorkingSteps {
    @And("change language website")
    public void changeLanguage(){
        HomePage.getcontentdropdown();
    }
}
