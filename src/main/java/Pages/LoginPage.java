package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(id="email")
    WebElement mail;
    @FindBy(id="password")
    WebElement pass;
    @FindBy(className="PrimaryButton_primary_button__5cdyV")
    WebElement logBtn;
    @FindBy(className = "TabListItemBtn_tabs_list_item__43iOl")
    WebElement createAccButton;

    public void LogIn(String email,String password)
    {
        mail.sendKeys(email);
        pass.sendKeys(password);
        logBtn.click();
    }
    public void Open_CreateAccPage()
    {
        createAccButton.click();
    }
}
