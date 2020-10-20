package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
    private final String url = "https://account.tvn.pl/auth/login/form?redirect_uri=https%3A%2F%2Fplayer.pl%2Fkonto-tvn%2Fauthorization%3Fxfo%3DPORTAL%26portalRedirect%3D%252Fseriale-online%252Fmoda-na-sukces-odcinki%252C2775&client_id=Web_PlayerFL_b3a76368bd59ce8bca521c90f5197ad6&response_type=code&scope=&state=107aa75e5b35ef0c48203a5c652a771179258349441a58afbd41907df6e9873c6b98ab0af028e991a020fe48115d51b02a90dd4718c6af6a9a658f98f55b58b1&service_id=24&version=2.2.0&device_id=abb4fa11c6874e6796054afa2f1c5122&config_hash=25d5d314-9cc7-4af9-96cd-f3dd5bde4682&open_view=login&action=login&oauth_params_hash=4e8cdf3ba08b4dba2973498e89e37540";

    @FindBy(id = "login_by_email")
    private WebElement logByEmailBtn;
    @FindBy(xpath= "//*[@id=\"root\"]/div/main/div/div/div[2]/div/div/div/div[1]/div/div/form/div[1]/div/input")
    private WebElement loginEmail;
    @FindBy(id= "password")
    private WebElement loginPass;
    @FindBy(id= "sign_in")
    private WebElement submit;

    public WebElement getLogByEmailBtn() {
        return logByEmailBtn;
    }

    public WebElement getLoginEmail() {
        return loginEmail;
    }

    public WebElement getLoginPass() {
        return loginPass;
    }

    public String getUrl() {
        return url;
    }

    public WebElement getSubmit() {
        return submit;
    }
}
