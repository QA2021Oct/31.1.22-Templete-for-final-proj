package tests;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class FirstTest extends BasePage {

    @BeforeTest
    public void setUp(){
        super.setUp();
    }

    @Test (priority = 1)
    public void searchWhetherInTelAviv(){
        homePage.searchInput("Tel Aviv");
        assertNotNull(utilities.waitForElement(searchPage.searchFlagLogo(), 20));
    }

    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }
}
