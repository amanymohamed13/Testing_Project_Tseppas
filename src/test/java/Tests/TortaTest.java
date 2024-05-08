package Tests;

import Pages.HomePage;
import Pages.TortaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;

public class TortaTest extends TestBase {
    HomePage homePage;
    TortaPage tortaPage;

    @Test
    public void VerifyTagsValue() {

        this.homePage = new HomePage(driver);
        this.homePage.Open_tortasPage();
        this.tortaPage = new TortaPage(driver);
        Assert.assertEquals(tortaPage.buyNow.getText(),"Buy now");
        Assert.assertEquals(tortaPage.name.getText(),"White Bunny Easter Cake");

        tortaPage.buyNow.click();
    }
}

