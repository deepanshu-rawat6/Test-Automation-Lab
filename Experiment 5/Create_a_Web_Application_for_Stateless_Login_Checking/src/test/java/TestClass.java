import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestClass {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.getProperty("webdriver.gecko.driver",
                "D:\\GitHub\\TA Lab\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(
                "D:\\GitHub\\TA Lab\\TA-Lab\\Experiment 5\\" +
                        "Create_a_Web_Application_for_Stateless_Login_Checking\\src\\main\\web\\index.html");
    }

    @Test
    public void testLoginFailureUserNotFound() {
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        usernameInput.sendKeys("nonexistentuser");
        passwordInput.sendKeys("invalidpassword");
        loginButton.click();

        WebElement loginMessage = driver.findElement(By.id("loginMessage"));
        Assert.assertEquals(loginMessage.getText(), "User does not exist");
        Assert.assertEquals(loginMessage.getCssValue("color"), "rgb(255, 0, 0)"); // Red color
    }

    @Test
    public void testLoginSuccess() {
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        usernameInput.sendKeys("ABC");
        passwordInput.sendKeys("pass1");
        loginButton.click();

        WebElement loginMessage = driver.findElement(By.id("loginMessage"));
        Assert.assertEquals(loginMessage.getText(), "Login successful");
        Assert.assertEquals(loginMessage.getCssValue("color"), "rgb(0, 128, 0)"); // Green color
    }

    @Test
    public void testLoginFailureIncorrectPassword() {
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        usernameInput.sendKeys("ABC");
        passwordInput.sendKeys("pass11");
        loginButton.click();

        WebElement loginMessage = driver.findElement(By.id("loginMessage"));
        Assert.assertEquals(loginMessage.getText(), "Incorrect password");
        Assert.assertEquals(loginMessage.getCssValue("color"), "rgb(255, 0, 0)"); // Green color
    }

    @Test
    public void testLoginSuccessAnotherUser() {
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        usernameInput.sendKeys("DEF");
        passwordInput.sendKeys("pass2");
        loginButton.click();

        WebElement loginMessage = driver.findElement(By.id("loginMessage"));
        Assert.assertEquals(loginMessage.getText(), "Login successful");
        Assert.assertEquals(loginMessage.getCssValue("color"), "rgb(0, 128, 0)"); // Green color
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}