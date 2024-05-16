package Tests;

import Pages.*;
import org.testng.annotations.Test;


public class LoginTest extends TestBase{
        HomePage homePage;
        LoginPage loginPage;

        @Test
        public void Verify_LoggedIn_User()
        {
                homePage=new HomePage(driver);
                homePage.Open_login_CreateAccPage();

                loginPage=new LoginPage(driver);
                loginPage.LogIn("ama372002@gmail.com","amany123");
                System.out.println("Logged In Successfully" );

        }
}
