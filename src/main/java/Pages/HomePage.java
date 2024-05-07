package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/nav/div[1]/div/div/div")
    WebElement profileMenue;

    @FindBy(className = "DropdownList_dropdown_menu_link__p5Pd2")
    WebElement myProfile;

    //Torta in second Section to make test like
    @FindBy(className ="OverlayImg_figure_caption__Tc3-J")
    WebElement Tortas;

   //Login Section
    @FindBy(className = "UserSettingsBar_login__4Nnvt")
    WebElement accountLogin;

    public void Open_Profile_page()
    {
        act.contextClick(profileMenue).moveToElement(myProfile).click().perform();

    }

    public void Open_tortasPage()
    {
        Tortas.click();
    }
    public void Open_login_CreateAccPage()
    {
        accountLogin.click();

    }


}
