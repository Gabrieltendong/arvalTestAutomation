package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;

public class OpenHomePageStep {
    @Given("user connect to the homePage")
    public void user_connect_to_the_home_page() throws InterruptedException {
        HomePage.goToHomePage();
        HomePage.coockieHandle();
    }
}
