package MyLibrary;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;

public class AbstractClass {

    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;



    @BeforeSuite
    public void startdriver() throws IOException, InterruptedException {
        driver = ReusableActions.defineTheDriver();
        reports = new ExtentReports("src/main/java/HTML_Reports/"+getClass().getSimpleName()+".html");

    }

    @BeforeMethod
    public void gettestname(Method method){
    logger=reports.startTest(method.getName());
    }

    @AfterMethod
    public void endlogger(){

        reports.endTest(logger);


    }




    @AfterSuite
    public void clossedriver(){

        driver.quit();
        reports.flush();
    }





}
