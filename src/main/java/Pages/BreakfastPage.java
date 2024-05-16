package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BreakfastPage extends PageBase{
    public BreakfastPage(WebDriver driver) {super(driver);}
    @FindBy (xpath = "//*[@id=\"mainLayout\"]/div/div[3]/div/div[2]/div[1]/span/picture/img")
    WebElement card;

    @FindBy (xpath = "//*[@id=\"mainLayout\"]/div/div[3]/div/div[1]/div[1]/span/picture/img")
    WebElement card1;

    @FindBy (xpath = "//*[@id=\"mainLayout\"]/div/div[3]/div/div[4]/div[1]/span/picture/img")
    WebElement card2;

    @FindBy(name = "Increment")
    WebElement increment;
    @FindBy(name = "Like")
    WebElement like;

    @FindBy(name="Buy now")
    WebElement buyNow;

    @FindBy(className = "CartBar_bar_icon_length__zND2L")
    WebElement cartIcon;

    public void Open_cinnamon_page()
    {
        card.click();
    }

    public void Open_Petit_page()
    {
        card1.click();
    }

    public void Open_Pate_page()
    {
        card2.click();
    }

    public void open_CartIcon() {
        cartIcon.click();
    }



    public void buyNowClick()
    {
        buyNow.click();
    }

    public void increment_Btn()
    {
        increment.click();


    }
    public void Like_Btn()
    {
        like.click();
        like.click();
    }


}
