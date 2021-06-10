package FedExAutomationPOM;

import MyLibrary.AbstractClass;
import MyLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummary extends AbstractClass {
    ExtentTest logger;
    public CartSummary (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger= AbstractClass.logger;

    }


    @FindBy(xpath = "//button[@aria-describedby='price-module-tooltip']")
    WebElement addtoCart;


    public void addtoCartMethod(){

        ReusableActions.clickOnElement(driver,addtoCart,logger,"Add to Cart");

    }


}
