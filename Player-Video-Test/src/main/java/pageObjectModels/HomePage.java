package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//    private WebDriver driver;
    private final String url = "https://player.pl/";

//    public HomePage() {
//        driver = new ChromeDriver();
//        PageFactory.initElements(driver,this);
//    }


    @FindBy(className = "btn-login")
    private WebElement logInButton;
    @FindBy(className = "icon-search")
    private WebElement searchIcon;
    @FindBy(className = "close")
    private WebElement closeCookieInfBtn;

    public WebElement getLogInButton() {
        return logInButton;
    }

    public WebElement getSearchIcon() {
        return searchIcon;
    }

    public WebElement getCloseCookieInfBtn() {
        return closeCookieInfBtn;
    }

    public String getUrl() {
        return url;
    }
}
