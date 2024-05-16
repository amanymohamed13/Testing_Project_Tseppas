package Tests;

import Pages.EditProfile;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class EditProfileTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    EditProfile editProfile;



    @Test
    public void EditProfileInfo()
    {
        homePage=new HomePage(driver);
        homePage.Open_login_page();

        loginPage=new LoginPage(driver);
        loginPage.LogIn("alaayousef777.lolo@gmail.com","baba123");
        System.out.println("Logged In Successfully" );

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        homePage=new HomePage(driver);
        //click on username to open dropdown menu
        homePage.Open_Profile_page();

        // click on my profile item to open edit screen
        homePage.Open_myProfile();

        editProfile=new EditProfile(driver);
        // add new data
        editProfile.changeInfo("Alaa","alaayousef777.lolo@gmail.com","01024127915");
    }

}
