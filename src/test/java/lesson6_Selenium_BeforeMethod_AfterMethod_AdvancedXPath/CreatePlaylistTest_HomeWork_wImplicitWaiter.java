package lesson6_Selenium_BeforeMethod_AfterMethod_AdvancedXPath;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class CreatePlaylistTest_HomeWork_wImplicitWaiter {
    WebDriver driver;

    @BeforeMethod

    public void startUp () {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        this.driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("[placeholder='Email Address']")).sendKeys("koeluser06@testpro.io");
        driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("te$t$tudent", Keys.ENTER);

    }

    @AfterMethod

    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


    @Test

    public void createPlaylist_playlistCreated()  {
        driver.findElement(By.xpath("//*[contains(@class,'fa-plus-circle')]")).click();
        driver.findElement(By.xpath("//*[text()='New Playlist']")).click();
        driver.findElement(By.xpath("//*[contains(@placeholder, 'to save')]")).sendKeys("KAMIL", Keys.ENTER);

//        boolean created = false;
//        try {
//            driver.findElement(By.xpath("//*[@href='#!/playlist/4040']"));
//            created = true;
//        } catch (NoSuchElementException ignored){}
//
//        Assert.assertTrue(created);

        boolean created1 = false;
        try {
            driver.findElement(By.xpath("//*[contains(@class, 'success')]"));
            created1 = true;
        } catch (NoSuchElementException ignored){}

        Assert.assertTrue(created1);






//        for (int i=0;i<50;i++){
//            try{
//                driver.findElement(By.xpath("//*[contains(@class,'fa-plus-circle')]")).click();
//                break;
//            } catch (ElementClickInterceptedException xx){
//                System.out.println("Error");
//            }
//        }



    }
}
