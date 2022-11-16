package browsertestingnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.msedge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Open the URL
        driver.get(baseUrl);
        //print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+title);
        //print the current URL
        System.out.println("current url"+driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source"+driver.getPageSource());
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Jani@ms.com");
        //Enter password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Jhoni99");
        //close the browser
        driver.quit();
    }
}
