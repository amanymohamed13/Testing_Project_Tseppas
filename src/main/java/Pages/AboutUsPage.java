package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutUsPage extends PageBase {
    public AboutUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id=\"mainLayout\"]/main/div/section[2]/article/p[1]")
    public WebElement paragraph1 ;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/section[2]/article/p[2]")
    public WebElement paragraph2;


    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/section[2]/article/p[3]")
    public WebElement paragraph3;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/section[2]/article/p[4]")
    public WebElement paragraph4;
    @FindBy(xpath="//*[@id=\"mainLayout\"]/main/div/section[3]/div/a")
    public WebElement ViewLocation;


    public WebElement getViewLocation() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       return wait.until(ExpectedConditions.elementToBeClickable(ViewLocation));
    }
}
