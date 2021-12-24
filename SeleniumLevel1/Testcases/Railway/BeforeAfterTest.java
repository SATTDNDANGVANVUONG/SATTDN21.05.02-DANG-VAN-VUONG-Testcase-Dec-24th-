package Railway;

import Constant.Constant;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BeforeAfterTest {
        @BeforeMethod
        public void beforeMethod(){
            System.out.println("Pre-condition");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hpenvy\\Desktop\\Logigear\\manual mobile testing\\New folder\\chromedriver.exe");
            Constant.WEBDRIVER= new ChromeDriver();
            Constant.WEBDRIVER.manage().window().maximize();
            Constant.WEBDRIVER.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            Actions actions = new Actions(Constant.WEBDRIVER);
        }
        @AfterMethod
        public void afterMethod(){
            System.out.println("Post-condition");
           Constant.WEBDRIVER.quit();
        }
}
