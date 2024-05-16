package Tests;

import Pages.AboutUsPage;
import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContacUsTest extends TestBase {
    HomePage homePage;
     ContactUsPage contactUsPage;

    @Test
    public void VerifyElementsContent() {

        this.homePage = new HomePage(driver);
        this.homePage.Open_contact_US_Page();
        this.contactUsPage = new ContactUsPage(driver);

        Assert.assertEquals(contactUsPage.element1.getText(),"Thank you for being interested in Tseppas!");

        Assert.assertEquals(contactUsPage.element2.getText(),"We look forward to hearing from you, and we are here to help you! Feel free to contact us.");

        Assert.assertEquals(contactUsPage.element3.getText(),"info@tseppas.com");


        contactUsPage.element3.click();

        System.out.println("Write Your Mail content");
    }
}

