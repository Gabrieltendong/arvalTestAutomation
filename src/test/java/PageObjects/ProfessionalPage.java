package PageObjects;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class ProfessionalPage extends BaseClass {

    private static ExcelManager excel = new ExcelManager();

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div/div[6]/div/div/div/div/div[1]/a/div/div[3]/p[5]")
    private static WebElement menuItem1;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div/div[6]/div/div/div/div/div[2]/a/div/div[3]/p[2]")
    private static WebElement menuItem2;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div/div[6]/div/div/div/div/div[3]/a/div/div[3]/p[7]")
    private static WebElement menuItem3;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div/div[6]/div/div/div/div/div[4]/a/div/div[3]/p[2]")
    private static WebElement menuItem4;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div/div[8]/div/div/div[2]/div/div/table/tbody/tr[1]/td[4]/a")
    private static WebElement linkMarkBMW;

    @FindBy(tagName = "h4")
    private static List<WebElement> listNameMark;

    public static void comparePosition() throws IOException {
       int position1 = menuItem1.getLocation().getY();
       int position2 = menuItem2.getLocation().getY();
       int position3 = menuItem3.getLocation().getY();
       int position4 = menuItem4.getLocation().getY();

       if(position1 == position2 && position1 == position3 && position1 == position4){
           System.out.println("Bug Corrigé");
           excel.excelWriting("481", "OK", getDate(), getTime());
       }else {
           excel.excelWriting("481", "KO", getDate(), getTime());
           System.out.println("Bug non corrigé");
           Assert.assertTrue(false);
       }
    }

    public static void navigateToMarkBMW(){
        navigateTo(linkMarkBMW);
    }

    public static void verifyNameMark() throws IOException {
        for(int i = 0; i < listNameMark.size(); i++){
            if(listNameMark.get(i).getText().contains("�")){
                excel.excelWriting("467", "KO", getDate(), getTime());
                System.out.println("Bug non corrigé: " + listNameMark.get(i).getText());
                Assert.assertTrue(false);
            }else {
                excel.excelWriting("467", "OK", getDate(), getTime());
                System.out.println("Bug corrigé: ");
                Assert.assertTrue(true);
            }
        }
    }
}
