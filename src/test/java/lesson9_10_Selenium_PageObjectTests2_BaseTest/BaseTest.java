package lesson9_10_Selenium_PageObjectTests2_BaseTest;

import com.github.javafaker.Faker;
import z_helpers.ScreenShot;
import lesson11_Selenium_BrowserFabric.enums.BrowserFabric;
import lesson11_Selenium_BrowserFabric.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest {
   protected WebDriver driver;
   protected Faker faker;
   protected String username;
   protected String password;
   protected String wrongPassword;
   protected int error_count = 0;
   @Parameters
           ({"email", "password", "wrongPassword"})
    @BeforeMethod
    public void startUp(String email, String password, String wrongPassword) {
//        this.username = "koeluser06@testpro.io";
//        this.password = "te$t$tudent";
//        this.wrongPassword = "te$t$tudent1";
       username = email;
       this.password = password;
       this.wrongPassword = wrongPassword;
        BrowserType browserType = BrowserType.OPERA;
        driver = BrowserFabric.getWebdriver(browserType);

        this.faker = new Faker();
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException {
       if(iTestResult.getStatus()==iTestResult.FAILURE){
           DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
           Date date = new Date();
//           String time = now.format(DateTimeFormatter.ISO_DATE_TIME);
//           String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
           ScreenShot.take(driver, iTestResult.getName()+" "+dateFormat.format(date));
       }

        driver.quit();
    }
}
