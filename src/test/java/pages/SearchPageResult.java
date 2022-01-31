package pages;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult {

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);

    @FindBy(xpath="//header/div[2]/div[1]/section[1]/img[1]")
    WebElement FlagElement;

    public SearchPageResult(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement searchFlagLogo(){
        return FlagElement;
    }

}
