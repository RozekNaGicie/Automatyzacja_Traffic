package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;

/** Webdriver temporarly unactive couse of this class is only for searching purpose. No need to create new driver.
//    private final String url = "https://player.pl/";
//    public SearchPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }
 */

    @FindBy(id = "search")
    private WebElement searchInput;



}
