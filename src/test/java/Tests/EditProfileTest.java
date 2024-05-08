package Tests;

import Pages.EditProfile;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class EditProfileTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    EditProfile editProfile;


    @Test
    public void EditProfileInfo()
    {
        homePage=new HomePage(driver);
        homePage.Open_login_CreateAccPage();
        loginPage=new LoginPage(driver);
        loginPage.LogIn("ama372002@gmail.com","amany123");
        System.out.println("Logged In Successfully" );
        //homePage.Open_Profile_page();
       // homePage.Open_myProfile();
        editProfile=new EditProfile(driver);
        editProfile.changeInfo("Alaa","alaa.alshemi.aam@gmail.com","01024127915");


    }

}
