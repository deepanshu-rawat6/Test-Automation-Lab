import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestCases {
    @Test
    public void test1() throws InterruptedException {
        // TODO Auto-generated method stub
        System.getProperty("webdriver.gecko.driver",
                "D:\\GitHub\\TA Lab\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
        WebDriver obj=new FirefoxDriver();
        obj.manage().window().maximize();
        obj.get("http://www.gmail.com");
        System.out.println("Opened Browser");
        //Find By ID
        obj.findElement(By.id("identifierId")).sendKeys("check");
        System.out.println("Placed Email");
        //Find By ClassName
//		obj.findElement(By.className("VfPpkd-vQzf8d")).click();
//		System.out.println("Clicked Next");
//		Thread.sleep(3000);
        //Find By X Path
        WebElement elementOpen = obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]"
                + "/c-wiz/div/div[3]/div/div[1]/div/div/button/span"));
        elementOpen.click();
//        String outV=obj.findElement(By.xpath("//div[@class='Ekjuhf Jj6Lae']")).getText();
//        System.out.println("Obtained"+outV);
        //Find By TextLink
        WebElement linkText= obj.findElement(By.linkText("Learn more about using Guest mode"));
        String text=linkText.getAttribute("href");
        obj.get(text);
        Thread.sleep(3000);
        System.out.println(obj.getTitle());
    }

//    @Test
//    public void test2() {
//        System.getProperty("webdriver.gecko.driver",
//                "D:\\GitHub\\TA Lab\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
//
//        // URL of the tutorial website
//        String githubProfileUrl = "https://github.com/deepanshu-rawat6";
//
//        // Initialize Firefox WebDriver
//        FirefoxOptions options = new FirefoxOptions();
//        WebDriver driver = new FirefoxDriver(options);
//
//        driver.manage().window().maximize();
//
//        // Set implicit wait time to wait for elements
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        // Navigate to the GitHub user's profile
//        driver.get(githubProfileUrl);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy({ top: document.body.scrollHeight, behavior: 'smooth' })");
//
//        // Wait for a small delay (for demonstration purposes)
//        try {
//            Thread.sleep(3000); // Delay of 3 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Find and click on the "Repositories" tab
//        WebElement repositoriesTab = driver.findElement(By.xpath("//a[@data-tab-item='repositories']"));
//        repositoriesTab.click();
//
//        try {
//            Thread.sleep(5000); // Delay of 5 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        WebElement firstRepo = driver.findElement(By.xpath("(//a[@itemprop='name deepanshu-rawat6'])[1]"));
//        firstRepo.click();
//
//        // Wait for some time (for demonstration purposes)
//        try {
//            Thread.sleep(5000); // Delay of 5 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Return back to the repositories page
//        driver.navigate().back();
//
//        // Wait for the repositories page to load again
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        // Find and click on the second repository
//        WebElement secondRepo = driver.findElement(By.xpath("(//a[@itemprop='name SPCP-Lab'])[2]"));
//        secondRepo.click();
//
//        // Close the browser
//        driver.quit();
//    }
}
