package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    CreateAccountPage createAccountPage;


    @Test
    public void TestCreateAccount()
    {
        homePage=new HomePage(driver);
        homePage.Open_login_page();

        loginPage=new LoginPage(driver);
        loginPage.Open_CreateAccPage();

        createAccountPage=new CreateAccountPage(driver);
        createAccountPage.CreateAccount("Amany mohamed","amanMohamed123@mail.com","amany123","amany123");
        System.out.println("Account Created Successfully");

    }

}
