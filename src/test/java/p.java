import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class p {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/main/java/MyLibrary/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");



    }
}
