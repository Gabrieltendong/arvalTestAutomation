package PageObjects;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnInternationalPatnerPage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"block-menu-block-5\"]/div/ul/li[5]/a")
    private static WebElement expertiseAndProfessionLink;

    public static void navigateToExpertiseLink(){
        String url = expertiseAndProfessionLink.getAttribute("href");
        driver.navigate().to(url);
    }
}
