package z_helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void take(WebDriver driver, String screenshotName){
        try{
            TakesScreenshot screenshot = (TakesScreenshot) driver; //this is casting operation (when we try to switch between different types)
            //double xx = 5.6;
           // int tt = (int) xx; //this is casting operation. In this case I'm loosing decimal part and we got only 5
           File file = screenshot.getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(file, new File("./screenshot"+screenshotName+".png"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
