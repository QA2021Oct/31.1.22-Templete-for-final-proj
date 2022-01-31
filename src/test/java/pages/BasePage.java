package pages;
import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BasePage {

    public WebDriver driver;
    private String baseUrl;
    public HomePage homePage;
    public SearchPageResult searchPage;
    public Utilities utilities;

    @BeforeTest
    public void setUp(){
        baseUrl = "https://www.timeanddate.com/weather/";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\einat\\Selenium\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        searchPage = new SearchPageResult(driver);
        utilities = new Utilities(driver);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("It will be executed first");
    }

    @AfterTest
    public void tearDown() throws IOException {
        driver.quit();
    }
}
