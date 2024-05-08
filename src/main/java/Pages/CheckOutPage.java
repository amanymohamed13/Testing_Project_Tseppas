package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase {
    public CheckOutPage(WebDriver driver) { super(driver);}
    @FindBy(name = "checkout")
    WebElement checkoutBtn;

   @FindBy(name = "country")
   WebElement country;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "area")
    WebElement area;

    @FindBy(name = "sub_area")
    WebElement sub_area;

    @FindBy(id = "address_line_1")
    WebElement addressone;
    @FindBy(id = "address_line_2")
    WebElement addresslinetwo;
    @FindBy(id = "building_number")
    WebElement buildNum;
    @FindBy(id = "flat_number")
    WebElement flatNum;
    @FindBy(id = "postal_code")
    WebElement postal;
    @FindBy(name = "Save")
    WebElement SaveBtn;
    @FindBy(name = "Next")
    WebElement NextBtn;
    @FindBy(xpath = "//*[@id=\"mainLayout\"]/div/div/div/div[1]/div[3]/div/div[2]/div/div/label/div/p")
    public WebElement Shipping;


    public void address(String addressline_1,String addressline_2 ,String buildingNum,String flatNumer,String postalCode)
    {
       addressone.sendKeys(addressline_1);
       addresslinetwo.sendKeys(addressline_2);
       buildNum.sendKeys(buildingNum);
       flatNum.sendKeys(flatNumer);
       postal.sendKeys(postalCode);

    }
    public void saveBtnClick(){
        SaveBtn.click();
    }
    public void nextBtnClick(){
        NextBtn.click();
    }




    public void clickCheckoutBtn() {
        checkoutBtn.click();
    }

    public void setCountry() {
        Select selectObj = new Select(country);
        selectObj.selectByVisibleText("Egypt");
    }
    public void setCity() {
        Select selectObj = new Select(city);
        selectObj.selectByVisibleText("Cairo");
    }

    public void setArea() {
        Select selectObj = new Select(area);
        selectObj.selectByVisibleText("Garden City");
    }

    public void setsub_area() {
        Select selectObj = new Select(sub_area);
        selectObj.selectByVisibleText("Out of range");
    }
}
