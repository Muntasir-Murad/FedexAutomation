package FedExAutomationPOM;

import MyLibrary.AbstractClass;
import MyLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut extends AbstractClass {
    ExtentTest logger;
    public CheckOut (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger= AbstractClass.logger;

    }

    @FindBy(xpath = "//button[@class='cart-btn btn-check-out']")
    WebElement Checkout;


    public void CheckoutMethod(){


        ReusableActions.clickOnElement(driver,Checkout,logger,"Check out");

    }




}
