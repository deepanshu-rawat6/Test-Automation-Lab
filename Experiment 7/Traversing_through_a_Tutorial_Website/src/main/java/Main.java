import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.getProperty("webdriver.gecko.driver",
                "D:\\GitHub\\TA Lab\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");

        // URL of the tutorial website
        String githubProfileUrl = "https://github.com/deepanshu-rawat6";

        // Initialize Firefox WebDriver
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();

        // Set implicit wait time to wait for elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to the GitHub user's profile
        driver.get(githubProfileUrl);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy({ top: document.body.scrollHeight, behavior: 'smooth' })");

        // Wait for a small delay (for demonstration purposes)
        try {
            Thread.sleep(5000); // Delay of 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find and click on the "Repositories" tab
        WebElement repositoriesTab = driver.findElement(By.xpath("//a[@data-tab-item='repositories']"));
        repositoriesTab.click();

        JavascriptExecutor jsScroll = (JavascriptExecutor) driver;
        jsScroll.executeScript("window.scrollBy({ top: document.body.scrollHeight, behavior: 'smooth' })");

        try {
            Thread.sleep(5000); // Delay of 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
//        driver.quit();
    }
}
