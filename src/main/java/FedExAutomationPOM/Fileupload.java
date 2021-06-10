package FedExAutomationPOM;

import MyLibrary.AbstractClass;
import MyLibrary.ReusableActions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fileupload extends AbstractClass {
    ExtentTest logger;
    public Fileupload (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;

    }
    public void ImgUpload(String path) throws InterruptedException {
        ReusableActions.uploadFile(path);
        Thread.sleep(5000);
    }

    @FindBy(xpath="(//button[@class='project-button'])[1]")
    WebElement setUpProject;


    public void setSetUpProjectmethod(){

        ReusableActions.clickOnElement(driver,setUpProject,logger,"Set up project");

    }
}
