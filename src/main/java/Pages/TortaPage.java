package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TortaPage extends PageBase {

    @FindBy(className= "card_card_link__71oH9")
    public WebElement buyNow ;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/div/div[3]/div/div[1]/div[2]/h3")
    public WebElement name;
    public TortaPage(WebDriver driver) {
        super(driver);
    }

}
