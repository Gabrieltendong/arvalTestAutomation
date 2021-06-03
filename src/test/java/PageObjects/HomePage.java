package PageObjects;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class HomePage extends BaseClass{

    private static long startTime;
    private static long finishTime;
    private static long totalTime;
    private static ExcelManager excel = new ExcelManager();

    @FindBy(xpath = "//*[@id=\"block-menu-menu-segments\"]/ul/li[1]/a")
    private static WebElement linklongTermRental;

    @FindBy(id = "onetrust-banner-sdk")
    private static WebElement cookieModal;

    @FindBy(id = "onetrust-accept-btn-handler")
    private static WebElement accepteCookieBtn;

    @FindBy(xpath = "//*[@id=\"block-menu-block-1\"]/div/ul/li/a")
    private static WebElement aboutArvalLink;

    @FindBy(xpath = "//*[@id=\"block-menu-block-9\"]/div/ul/li[2]/a")
    private static WebElement anInternationalPatnerLink;

    @FindBy(tagName = "a")
    private static List<WebElement> listLink;

    @FindBy(xpath = "//*[@id=\"block-menu-menu-segments\"]/ul/li[3]/a")
    private static WebElement solutionManageParcLink;

    @FindBy(id = "makeRef")
    private static WebElement makeRef;

    @FindBy(xpath = "//*[@id=\"submitOffer\"]")
    private static WebElement submitOffer;

    @FindBy(xpath = "//*[@id=\"comparator_bar_container\"]/ul/li[3]/a")
    private static WebElement btnContact;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div[1]/div")
    private static WebElement dropdown_lang;

    public static void goToHomePage() {
        driver.get("https://www.arval.fr/");
    }

    public static void coockieHandle() throws InterruptedException {
        if(cookieModal.isDisplayed()) {
            accepteCookieBtn.click();
        }
    }

    public static void navigateToAboutArval(){
        navigateTo(aboutArvalLink);
    }

    public static void navigateTopLinklongTermRental(){
        navigateTo(linklongTermRental);
    }

    public static void navigateToAnInternationalPatener(){
        navigateTo(anInternationalPatnerLink);
    }

    public static void navigateAllLink() throws IOException {
        excel.excelWriting("495", "OK", getDate(), getTime());
        for(int i = 0; i < listLink.size(); i++){
            String url = listLink.get(i).getAttribute("href");
            if(url != null && url.split(":")[0].equals("http")){
                excel.excelWriting("495", "KO", getDate(), getTime());
//                Assert.assertTrue(false);
                System.out.println("link: " + listLink.get(i).getAttribute("href"));
            }
        }
    }

    public static void startLoadtime(){
        startTime = System.currentTimeMillis();
    }

    public static boolean countloadTime() throws IOException {
        finishTime = System.currentTimeMillis();
        totalTime = finishTime - startTime;
        if((totalTime/1000)< 5){
            excel.excelWriting("449", "OK", getDate(), getTime());
            System.out.println("temps de chargement normal" + totalTime/1000);
            return true;
        }else {
            excel.excelWriting("449", "KO", getDate(), getTime());
            System.out.println("temps de chargement long" + totalTime/1000);
            return false;
        }
    }

    public static void selectMarque(){
        Select drpMarque = new Select(makeRef);
        drpMarque.selectByVisibleText("ABARTH");
    }

    public static void clickBtnSearch() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            Actions action = new Actions(driver);
            action.moveToElement(submitOffer);
            action.perform();
            submitOffer.click();
        }catch (Exception e){
            js.executeScript("document.getElementById('submitOffer').click();");
        }
    }

    public static boolean getUrlContact() throws IOException {
        String url = btnContact.getAttribute("href");
        if(url.contains("#xx")){
            excel.excelWriting("448", "KO", getDate(), getTime());
            System.out.println("link non correct, bug non corrigé" + url);
            return false;
        }else{
            excel.excelWriting("448", "OK", getDate(), getTime());
            System.out.println("link correct, bug corrigé" + url);
            return true;
        }
    }

    public static void getcontentdropdown() throws IOException {
        List<WebElement> allElement = dropdown_lang.findElements(By.xpath(".//*"));
        if(allElement.size() != 0){
            excel.excelWriting("441", "OK", getDate(), getTime());
            System.out.println("bug resolu");
            Assert.assertTrue(true);
        }else {
            excel.excelWriting("441", "KO", getDate(), getTime());
            System.out.println("bug non resolu");
            Assert.assertTrue(false);
        }
    }

    public static void navigateToSolutionManageParc(){
        navigateTo(solutionManageParcLink);
    }

}
