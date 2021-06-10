package FedExAutomationPOM;

import MyLibrary.AbstractClass;
import MyLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorePrintandProducts extends AbstractClass {
    ExtentTest logger;
    public ExplorePrintandProducts(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;

    }

    @FindBy(xpath="(//a[@aria-label='Signs'])[1]")
    WebElement sign;



    public void signmethod()
    {
        ReusableActions.clickOnElement(driver,sign,logger,"Sign");


    }









}
