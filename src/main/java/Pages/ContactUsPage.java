package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends PageBase {
    public ContactUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id=\"mainLayout\"]/div/main/section[1]/article/h2")
    public WebElement element1 ;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/div/main/section[1]/article/p")
    public WebElement element2;


    @FindBy(xpath = "//*[@id=\"mainLayout\"]/div/main/section[1]/section/ul/li[2]/a")
    public WebElement element3;


}