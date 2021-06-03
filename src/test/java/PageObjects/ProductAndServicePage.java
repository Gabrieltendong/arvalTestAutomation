package PageObjects;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ProductAndServicePage extends BaseClass {

    private static ExcelManager excel = new ExcelManager();

    @FindBy(id = "content")
    private static WebElement errorPage;

    public static Boolean getDiplayBlocError() throws IOException {
        if(errorPage.isDisplayed()){
            excel.excelWriting("499", "KO", getDate(), getTime());
        }else {
            excel.excelWriting("499", "OK", getDate(), getTime());
        }
        return errorPage.isDisplayed();
    }

}
