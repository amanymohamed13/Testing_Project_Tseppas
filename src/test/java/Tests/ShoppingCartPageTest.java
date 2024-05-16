package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class ShoppingCartPageTest extends TestBase{
    HomePage homePage;
    LoginPage loginPage;
    CheckOutPage checkout;
    BreakfastPage breakfast;
    ShoppingCartPage shoppingcart;

    @Test
    public void shpppindcartInfo()
    {
        homePage=new HomePage(driver);
        homePage.Open_login_CreateAccPage();
        loginPage=new LoginPage(driver);
        loginPage.LogIn("alaayousef777.lolo@gmail.com","baba123");
        System.out.println("Logged In Successfully" );
        homePage.Open_breakfast();
        breakfast=new BreakfastPage(driver);
        breakfast.Open_cinnamon_page();
        System.out.println("Add to Fav Successfully" );

        breakfast.buyNowClick();
        System.out.println("Add to Cart" );
        driver.navigate().back();
        System.out.println("Bake to Home" );

        breakfast.Open_Petit_page();
        System.out.println("Add to Fav Successfully" );
        driver.navigate().back();
        System.out.println("Bake to Home" );


        breakfast.open_CartIcon();
        shoppingcart=new ShoppingCartPage(driver);
        shoppingcart.increment_item1_Btn();
       shoppingcart.increment_item1_Btn();
        shoppingcart.increment_item2_Btn();
        shoppingcart.increment_item2_Btn();
        shoppingcart.decrement_item1_Btn();
        shoppingcart.decrement_item2_Btn();
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
