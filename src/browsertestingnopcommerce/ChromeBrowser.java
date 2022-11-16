package browsertestingnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //print title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :"+ title);
        // get current url
        System.out.println("current url"+driver.getCurrentUrl());
        //get page source
        System.out.println("Page source"+driver.getPageSource());
        //Enter  the email to email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("cast999@gmail.com");
      //  Enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("cope123");
        // close browser
       driver.quit();



    }
}
