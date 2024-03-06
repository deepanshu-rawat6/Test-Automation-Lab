import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
//        Connecting the browser driver path
        System.getProperty("webdriver.gecko.driver", "D:\\GitHub\\TA Lab\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
//        driver.get("https://github.com/deepanshu-rawat6");
        driver.get("D:\\GitHub\\TA Lab\\Experiment 1\\Invoking the WebPage via WebDriver in Java\\src\\index.html");
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Deepanshu");
        textBox = driver.findElement(By.id("email"));
        textBox.sendKeys("deepanshu@example.com");
        textBox = driver.findElement(By.id("message"));
        textBox.sendKeys("404 not found!");
    }
}