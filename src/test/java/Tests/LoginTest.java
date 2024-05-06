package Tests;

import Pages.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTest extends TestBase{
        HomePage homePage;
        LoginPage loginPage;

        @Test
        public void VerifyPurchase_Products()
        {
                homePage=new HomePage(driver);
                homePage.Open_login_CreateAccPage();
                loginPage=new LoginPage(driver);
                loginPage.LogIn("ama372002@gmail.com","amany123");
                System.out.println("Logged In Successfully" );

        }
}
