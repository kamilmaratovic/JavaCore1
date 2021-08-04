package selenium_lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.udemy.com/");
        WebElement searchField = driver.findElement(By.cssSelector("[class ='udlite-text-input udlite-text-input-small udlite-text-sm udlite-search-form-autocomplete-input js-header-search-field']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

//        driver.findElement(By.name("q")).sendKeys("Java", Keys.ENTER);
        Thread.sleep(3000);
        driver.quit();




    }
}
