package PageObjects;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpertiseAndProfessionPage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"ui-accordion-faqfield_field_faq_106-header-2\"]")
    private static WebElement longtermOfferLink;

    @FindBy(xpath = "//*[@id=\"ui-accordion-faqfield_field_faq_106-panel-2\"]/p[2]/a")
    private static WebElement productAndServiceLink;

    public static void clicklongTermOffer(){
        longtermOfferLink.click();
    }

    public static void navigateTopProductionAndServicePage(){
        String url = productAndServiceLink.getAttribute("href");
        driver.navigate().to(url);
    }
}
