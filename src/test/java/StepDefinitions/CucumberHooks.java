package StepDefinitions;

import Base.BaseClass;
import PageObjects.*;
import Utils.SendMail;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

import java.io.IOException;
public class CucumberHooks extends BaseClass {
    @Before
    public void setup(){
        setUpDriver();
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, AboutPage.class);
        PageFactory.initElements(driver, CareerPage.class);
        PageFactory.initElements(driver, AnInternationalPatnerPage.class);
        PageFactory.initElements(driver, ExpertiseAndProfessionPage.class);
        PageFactory.initElements(driver, ProductAndServicePage.class);
        PageFactory.initElements(driver, SolutionManageParcPage.class);
        PageFactory.initElements(driver, WhyArvalPage.class);
        PageFactory.initElements(driver, ProfessionalPage.class);
    }
    @After
    public void teardown() throws IOException {
        closeDriver(driver);
        SendMail sendMail = new SendMail();
        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "gtendong@gmail.com");
        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "fokourou@zenity.fr");
       // ExcelManager.formatResult("reports/Verification.xlsx","Data");
//      SendEmail.sendEmailTo("fokourou@zenity.fr");
//        SendEmail.sendEmailTo("israel.mouofopk68@gmail.com");
    }
    @AfterSuite
    public void endTestSuite(){
        System.out.println("after test suite");
        SendMail sendMail = new SendMail();
        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "gtendong@gmail.com");
    }
}