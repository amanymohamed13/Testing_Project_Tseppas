package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    /*@FindBy(xpath = "//*[@id=\"root\"]/div[2]/nav/div[1]/div/div/div")
    WebElement profileMenue;
    @FindBy(className = "DropdownList_dropdown_menu_link__p5Pd2")
    WebElement myProfile;*/


    //add to favoriate
    @FindBy (xpath = "//*[@id=\"mainLayout\"]/main/section[3]/div/div/div/div/div[1]/div/div/div/figure[2]/div/a")
    WebElement breakFast;

    //Torta in second Section to make test like
    @FindBy(className ="OverlayImg_figure_caption__Tc3-J")
    WebElement Tortas;

   //Login Section
    @FindBy(className = "UserSettingsBar_login__4Nnvt")
    WebElement accountLogin;


    //open breakfast
    public void Open_breakfast()
    {
        breakFast.click();

    }

    /*
    public void Open_Profile_page()
    {
        profileMenue.click();

    }
    public void Open_myProfile()
    {
       myProfile.click();

    }*/

    public void Open_tortasPage()
    {
        Tortas.click();
    }
    public void Open_login_CreateAccPage()
    {
        accountLogin.click();

    }


}
