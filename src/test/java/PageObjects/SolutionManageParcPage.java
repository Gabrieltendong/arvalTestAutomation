package PageObjects;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SolutionManageParcPage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"block-menu-block-4\"]/div/ul/li[3]/a")
    private static WebElement whyArvallink;

    public static void navigateToWhyArval(){
        navigateTo(whyArvallink);
    }
}
