package browsertestingnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseURl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("wrong browser name");
        }
        // Open URL
        driver.get(baseURl);
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:" + title);
        // Print the current URL
        System.out.println("Currnet url" + driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page source" + driver.getPageSource());
        // Enter the Email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Dhoni07@yahoo.com");
        // Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Yuvican");
        // close the browser
        driver.quit();

    }
}


