package Tests;

import Pages.HomePage;
import Pages.AboutUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AboutUsTest extends TestBase {
    HomePage homePage;
    AboutUsPage aboutUsPage;

    @Test
    public void VerifyTagsValue() {

        this.homePage = new HomePage(driver);
        this.homePage.OpenAboutUs();
        this.aboutUsPage = new AboutUsPage(driver);
        Assert.assertEquals(aboutUsPage.paragraph1.getText(),"It all began in 1912 when Evanglos Tseppas");
        Assert.assertEquals(aboutUsPage.paragraph2.getText(),"a chef from Greece founded his first bakery under the name of his ancestors at Farouk St.");
        Assert.assertEquals(aboutUsPage.paragraph3.getText(),"(currently known as Elgeish St.) in Cairo");
        Assert.assertEquals(aboutUsPage.paragraph4.getText(),"serving the royal family and high-end customers. TSEPPAS excelled in French patisserie and boulangerie productions thus far. Taken over by MG group in the 50's");

        aboutUsPage.getViewLocation().click();
        System.out.println("Location page Opened Successfully");
    }
}

