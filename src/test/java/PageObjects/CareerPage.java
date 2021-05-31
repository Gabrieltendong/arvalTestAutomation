package PageObjects;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CareerPage  extends BaseClass {
    @FindBy(xpath = "//*[@id=\"block-i-need-menu\"]/div/li/a")
    private static WebElement searchHeaderBtn;

    @FindBy(xpath = "//*[@id=\"block-i-need-menu\"]/div/li/ul/div/div/div/div/div[1]/a")
    private static WebElement careerCDIlink;

    @FindBy(xpath = "//*[@id=\"node-74\"]/div/div/div/div/div/div/div/div[3]")
    private static WebElement resultSearchEmpty;

    public static void hoverSearchBtn(){
        Actions action = new Actions(driver);
        action.moveToElement(searchHeaderBtn).build().perform();
    }

    public static void clickCareerCDIlink(){
        careerCDIlink.click();
    }

    public static Boolean getText(){
        return resultSearchEmpty.isDisplayed();
    }
}
