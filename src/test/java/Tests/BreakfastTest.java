package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class BreakfastTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    BreakfastPage breakfast;


    @Test
    public void breakfastInfo()
    {
        homePage=new HomePage(driver);
        homePage.Open_login_CreateAccPage();
        loginPage=new LoginPage(driver);
        loginPage.LogIn("ama372002@gmail.com","amany123");
        System.out.println("Logged In Successfully" );
        homePage.Open_breakfast();
        breakfast=new BreakfastPage(driver);
        breakfast.Open_cinnamon_page();
        breakfast.increment_Btn();
        breakfast.Like_Btn();
        System.out.println("Add to Fav Successfully" );


    }

}
