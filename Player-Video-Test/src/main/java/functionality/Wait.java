package functionality;

import builders.CookieBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModels.Driver;
import pageObjectModels.HomePage;
import pageObjectModels.LogInPage;
import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = Driver.driver();
        driver.get("https://player.pl/seriale-online/moda-na-sukces-odcinki,2775/odcinek-7350,S14E7350,170089");

        Cookie gad = new CookieBuilder("GAD","KlQrd8VG8UOVGGsGG8Y8kI8gWKsfn-6BMaQGmSXb-mAsEax1GGMS",".tvn.adocean.pl","/").cookieBuild();
        driver.manage().addCookie(gad);
        Cookie rodo = new CookieBuilder("rodoWindowPolicy","true",".player.pl","/").cookieBuild();
        driver.manage().addCookie(rodo);

        driver.navigate().refresh();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-login")));
        loginBtn.click();
        WebElement loginByMail = wait.until(ExpectedConditions.elementToBeClickable(By.id("login_by_email")));
        loginByMail.click();
        WebElement sendingMail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div/div/div[1]/div/div/form/div[1]/div/input")));
        sendingMail.sendKeys("");
        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        password.sendKeys("");
        WebElement btngoin = driver.findElement(By.id("sign_in"));
        btngoin.click();
        WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.className("missing-avatar")));
        user.click();
        WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("close")));
        closeBtn.click();
        WebElement play = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btnaas")));
        play.click();
    }
}
