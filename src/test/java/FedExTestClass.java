import FedExAutomationPOM.BaseClass;
import MyLibrary.AbstractClass;
import org.testng.annotations.Test;

public class FedExTestClass extends AbstractClass {


    @Test
    public void fedexYardSign() throws InterruptedException {
        driver.get("https://www.fedex.com/en-us/home.html");
        BaseClass.homePage().DesignPrintMethod();
        BaseClass.homePage().ExplorePrintProducts();
        BaseClass.explorePrintandProducts().signmethod();
        BaseClass.signs().yardsignmethod();
        Thread.sleep(5000);
        BaseClass.yardSigns().useyourfilemethod();
        Thread.sleep(5000);
        BaseClass.yardSigns().browseFileMethod();
        Thread.sleep(5000);


        BaseClass.fileupload().ImgUpload("C:\\Users\\Muntasir\\Pictures\\R.jpg");
        BaseClass.fileupload().setSetUpProjectmethod();
        Thread.sleep(6000);
        BaseClass.cartSummary().addtoCartMethod();
        Thread.sleep(3000);
        BaseClass.checkOut().CheckoutMethod();


    }



}
