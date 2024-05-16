package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase {
    public ShoppingCartPage(WebDriver driver) {super(driver);}

    @FindBy(className="NavbarBrand_navbar_brand__5-720")
    WebElement Home_Icon;

    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/div/button[2]")
    WebElement increment_item1;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/button[2]")
    WebElement increment_item2;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/div/div/div[1]/div[2]/div[2]/div[3]/div[2]/div/div/button[2]")
    WebElement increment_item3;


    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/div/button[1]")
    WebElement decrement_item1;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/button[1]")
    WebElement decrement_item2;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/div/div/div[1]/div[2]/div[2]/div[3]/div[2]/div/div/button[1]")
    WebElement decrement_item3;


    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/div/div/div[1]/div[2]/div[2]/div[1]/div[3]/button")
    WebElement delete_item1;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/div/div/div[1]/div[2]/div[2]/div[2]/div[3]/button")
    WebElement delete_item2;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/main/div/div/div/div[1]/div[2]/div[2]/div[3]/div[3]/button")
    WebElement delete_item3;

    public void BakeToHome()
    {
        Home_Icon.click();
    }
    public void increment_item1_Btn()
    {
        increment_item1.click();


    }
    public void increment_item2_Btn()
    {
        increment_item2.click();
        increment_item2.click();
    }
    public void increment_item3_Btn()

    {
        increment_item3.click();
    }



    public void delete_item2_Btn()
    {
        delete_item2.click();

    }

}