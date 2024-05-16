package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class TestBase {
    public static WebDriver driver;

    @BeforeClass
    public void openUrl()
    {


        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://tseppas.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterClass
    public void closeUrl()
    {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.close();
    }

}
