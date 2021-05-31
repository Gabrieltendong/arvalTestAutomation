package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.net.URL;
import java.net.HttpURLConnection;

public class WhyArvalPage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div/div[1]/div/div/div/div/div/div[1]/img")
    private static WebElement imageHeader;

    public static void verifyLoadImage(){
        String source = imageHeader.getAttribute("src");
        try{
            HttpURLConnection Connect = (HttpURLConnection) (new URL(source)).openConnection();
            int Response = Connect.getResponseCode();
            if(Response != 200){
                Assert.assertTrue(false);
            }else {
                Assert.assertTrue(true);
            }
            System.out.println("Responsecode: " + Response);
        }catch (Exception e){
            System.out.println("error load: " + e);
            Assert.assertTrue(false);
        }
    }
}
