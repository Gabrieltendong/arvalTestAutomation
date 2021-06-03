package PageObjects;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

public class WhyArvalPage extends BaseClass {

    private static ExcelManager excel = new ExcelManager();

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div/div[1]/div/div/div/div/div/div[1]/img")
    private static WebElement imageHeader;

    public static void verifyLoadImage() throws IOException {
        String source = imageHeader.getAttribute("src");
        try{
            HttpURLConnection Connect = (HttpURLConnection) (new URL(source)).openConnection();
            int Response = Connect.getResponseCode();
            if(Response != 200){
                excel.excelWriting("488", "OK", getDate(), getTime());
                Assert.assertTrue(false);
            }else {
                excel.excelWriting("488", "OK", getDate(), getTime());
                Assert.assertTrue(true);
            }
            System.out.println("Responsecode: " + Response);
        }catch (Exception e){
            excel.excelWriting("488", "OK", getDate(), getTime());
            System.out.println("error load: " + e);
            Assert.assertTrue(false);
        }
    }
}
