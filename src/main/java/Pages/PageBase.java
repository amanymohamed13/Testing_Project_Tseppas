package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class PageBase {

        public WebDriver driver;
        private static final Logger LOGGER = Logger.getLogger(PageBase.class.getName());

        public PageBase(WebDriver driver)
        {
                PageFactory.initElements(driver,this);
        }

}
