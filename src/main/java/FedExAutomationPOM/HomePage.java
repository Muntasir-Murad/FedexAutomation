package FedExAutomationPOM;

import MyLibrary.AbstractClass;
import MyLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractClass {
    ExtentTest logger;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;

    }

    @FindBy(xpath = "//span[normalize-space()='Design & Print']")
    WebElement DesignPrint;




    public void DesignPrintMethod()
    {
        ReusableActions.clickOnElement(driver,DesignPrint,logger,"Design and Print");
    }
    @FindBy(xpath = "//a[normalize-space()='Explore Print Products']")
    WebElement ExplorePrintProducts;




    public void ExplorePrintProducts()
    {
        ReusableActions.clickOnElement(driver,ExplorePrintProducts,logger,"ExplorePrintProducts");
    }



}
