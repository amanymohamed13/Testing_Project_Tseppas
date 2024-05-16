package Tests;

import Pages.BreakfastPage;
import Pages.CheckOutPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class CheckOutTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    CheckOutPage checkout;
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
        System.out.println("Add to Fav Successfully" );

        breakfast.buyNowClick();
        System.out.println("Add to Cart" );

        breakfast.open_CartIcon();
        checkout=new CheckOutPage(driver);
        checkout.clickCheckoutBtn();

        checkout.setCountry();
        checkout.setCity();
        checkout.setArea();
        checkout.setsub_area();
        checkout.address("flat15","flat14","12","3","123");

        checkout.saveBtnClick();
        checkout.nextBtnClick();
        System.out.println("Checkout Successfully" );
    }


}
