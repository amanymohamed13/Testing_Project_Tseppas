package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage extends PageBase{
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/nav/div[1]/div/div/div")
    WebElement profileMenu;

    @FindBy(xpath = "/html/body/div[1]/div[2]/nav/div[1]/div/div/ul/li[1]/a")
    WebElement myProfile;

    // about us element
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/nav/div[1]/ul/li[3]/a")
    WebElement aboutUs;

    //add to favorite
    @FindBy (xpath = "//*[@id=\"mainLayout\"]/main/section[3]/div/div/div/div/div[1]/div/div/div/figure[2]/div/a")
    WebElement breakFast;

   //Login Section
    @FindBy(className = "UserSettingsBar_login__4Nnvt")
    WebElement accountLogin;

    // Contact us
    @FindBy (xpath = "//*[@id=\"root\"]/div[2]/nav/div[1]/ul/li[4]/a")
    WebElement contactUs;



    //open breakfast
    public void Open_breakfast()
    {
        breakFast.click();

    }


    public void Open_Profile_page()
     {       try
         {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(profileMenu));
        closeBtn.click();
        System.out.println("profile Menu opened ");
         }

        catch (Exception e)
        {
             System.out.println("profile Menu not clickable ");
           }

     }
    public void Open_myProfile()
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(myProfile));
            closeBtn.click();
            System.out.println("My profile opened ");
        }
        catch (Exception e)
        {
            System.out.println("profile not clickable ");
        }

    }

    public void OpenAboutUs(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement close = wait.until(ExpectedConditions.elementToBeClickable(aboutUs));
            close.click();
    }

    public void Open_login_page()
    {
        accountLogin.click();

    }


    public void  Open_contact_US_Page(){
    contactUs.click();
    }
}
