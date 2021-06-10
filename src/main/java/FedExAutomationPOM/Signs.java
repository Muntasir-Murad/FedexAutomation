package FedExAutomationPOM;

import MyLibrary.AbstractClass;
import MyLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signs extends AbstractClass {
    ExtentTest logger;
    public Signs (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;

    }

    @FindBy(xpath="//a[@data-analytics='link|Yard Signs']")
    WebElement yardSign;


    public void yardsignmethod(){
        ReusableActions.clickOnElement(driver,yardSign,logger,"Yard Sign");



    }

}
