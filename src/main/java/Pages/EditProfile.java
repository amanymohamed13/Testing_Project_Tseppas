package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfile extends PageBase {
    public EditProfile(WebDriver driver){ super(driver);}
    @FindBy(id = "name")
    WebElement name;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "phone_number")
    WebElement number;

    @FindBy(className = "PrimaryButton_primary_button__5cdyV")
    WebElement saveBtn;

    public void changeInfo(String userName,String mail,String phoneNumber)
    {
        name.sendKeys(userName);
        email.sendKeys(mail);
        number.sendKeys(phoneNumber);
        saveBtn.click();
    }







}
