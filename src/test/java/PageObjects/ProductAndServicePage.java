package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductAndServicePage {
    @FindBy(id = "content")
    private static WebElement errorPage;

    public static Boolean getDiplayBlocError(){
        return errorPage.isDisplayed();
    }

}
