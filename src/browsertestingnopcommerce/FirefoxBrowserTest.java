package browsertestingnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.sql.Driver;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // Open  URL
        driver.get(baseUrl);
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);
        // Print current URL
        System.out.println("Current url"+driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page source"+driver.getPageSource());
        // Enter Email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Amar65@mozila.com");
        // Enter Password to password field
       WebElement passwordField =  driver.findElement(By.name("Password"));
        passwordField.sendKeys("Amijackson23");
        //close the browser
        driver.quit();
    }
}
