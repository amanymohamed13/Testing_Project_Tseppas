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
        homePage.Open_login_page();
        loginPage=new LoginPage(driver);

        loginPage.LogIn("alaayousef777.lolo@gmail.com","baba123");
        System.out.println("Logged In Successfully" );

        homePage.Open_breakfast();
        breakfast=new BreakfastPage(driver);

        breakfast.Open_cinnamon_page();
        System.out.println("Cinnamon Page Opened");

        breakfast.increment_Btn();
        System.out.println("Requested Quantity Increased ");

        breakfast.Like_Btn();
        System.out.println("Add to Fav Successfully" );
    }

}
