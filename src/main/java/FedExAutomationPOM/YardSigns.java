package FedExAutomationPOM;

import MyLibrary.AbstractClass;
import MyLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YardSigns extends AbstractClass {
    ExtentTest logger;
    public YardSigns (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;

    }

    @FindBy(xpath="//a[@class='fxg-link js-fxgc-init  fxg-button fxg-button--orange  fxg-link--mobile-align-center       ']")
    //a[@title='Use Your File']
    WebElement useyourfile;


    public void useyourfilemethod(){

        ReusableActions.clickOnElement(driver,useyourfile,logger,"use your file");


    }


    @FindBy(xpath ="(//div[@class='browse-files-btn'])[2]")
    WebElement browsefile;

        public void browseFileMethod(){

            ReusableActions.clickOnElement(driver,browsefile,logger,"Browse file");

        }






}
