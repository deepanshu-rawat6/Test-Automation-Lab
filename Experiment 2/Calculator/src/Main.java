import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.getProperty("webdriver.gecko.driver", "D:\\GitHub\\TA Lab\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
//        driver.get("https://github.com/deepanshu-rawat6");
        driver.get("D:\\GitHub\\TA Lab\\Experiment 2\\Calculator\\src\\index.html");
        enterValue(driver, "7");
        enterValue(driver, "0");
        enterValue(driver, "-");
        enterValue(driver, "8");
        calculate(driver);
    }

    private static void enterValue(WebDriver driver, String value) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + value + "']"));
        button.click();
    }

    private static void calculate(WebDriver driver) {
        WebElement equalsButton = driver.findElement(By.xpath("//button[text()='=']"));
        equalsButton.click();
    }
}