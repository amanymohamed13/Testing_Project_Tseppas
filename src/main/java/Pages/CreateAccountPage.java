package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends PageBase{
    public CreateAccountPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(id="name")
    WebElement Name;
    @FindBy(id="email")
    WebElement email;
    @FindBy(id="password")
    WebElement pass;

    @FindBy(id="confirmPassword")
    WebElement coPass;
    @FindBy(className = "PrimaryButton_primary_button__5cdyV")
    WebElement regButton;

    public void CreateAccount(String name,String mail,String password,String cpassword)
    {
        Name.sendKeys(name);
        email.sendKeys(mail);
        pass.sendKeys(password);
        coPass.sendKeys(cpassword);
        regButton.click();
    }
}
