package PageObjects;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutPage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"block-menu-block-2\"]/div/ul/li/ul/li[4]/a")
    private static WebElement jobAndCareerlink;

    public static void navigateToJobAndCareer(){
        String url = jobAndCareerlink.getAttribute("href");
        driver.navigate().to(url);
    }
}
