package functionality;

import builders.CookieBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModels.HomePage;
import pageObjectModels.LogInPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FunctionalityHub {

    public static void waitingTime(int timeToWait, WebDriver driver){
        driver.manage().timeouts().implicitlyWait(timeToWait, TimeUnit.SECONDS);
    }
    public static void sendKeys(String text, WebElement element) {
        element.sendKeys("text");
    }
    public static void logInPlayer(WebDriver driver) {

        HomePage home = new HomePage();
        LogInPage logIn = new LogInPage();
        driver.get(home.getUrl());

        Cookie gad = new CookieBuilder("GAD","KlQrd8VG8UOVGGsGG8Y8kI8gWKsfn-6BMaQGmSXb-mAsEax1GGMS",".tvn.adocean.pl","/").cookieBuild();
        driver.manage().addCookie(gad);
        Cookie rodo = new CookieBuilder("rodoWindowPolicy","true",".player.pl","/").cookieBuild();
        driver.manage().addCookie(rodo);
        Cookie playerIpressoId = new CookieBuilder("player_ipresso_id","8439830","player.pl","/").cookieBuild();
        driver.manage().addCookie(playerIpressoId);
        Cookie uiProfileManagerLastDisplayed = new CookieBuilder("ui-profile-manager-last-displayed","1602682053900","player.pl","/").cookieBuild();
        driver.manage().addCookie(uiProfileManagerLastDisplayed);
        Cookie ide = new CookieBuilder("IDE","AHWqTUkeMTJqO9fuXnHgDiKOibnB42vHh4JDfOKA-gO4z4rir4lEpVnoxou8z8z0",".doubleclick.net","/").cookieBuild();
        driver.manage().addCookie(ide);
        Cookie phpsessid = new CookieBuilder("PHPSESSID","3fpekd5b7sp2agohv8cnt46bo0","tvn-media.ipresso.pl","/").cookieBuild();
        driver.manage().addCookie(phpsessid);
        Cookie playerCache = new CookieBuilder("player_cache_bookmark_favourite","288344cdf249e6b474723f26f2c34d94--111742033","player.pl","/").cookieBuild();
        driver.manage().addCookie(playerCache);
        Cookie accChoos = new CookieBuilder("account_chooser","a9ffc45cafca93398cb6c0028aea745dba83353aec1349c32df1215a5e77543556d24a93f2115ef866f436aab73446c0a4d3df6f8f33b45602a1d375c78ab05ce444ac2f568fe0b434cbeac6834a4d15ac7def6d8d8e86e55b0f20b446689c8a6f98e005cb6d567694f82f4022841d645c10d37c6d69d469a9b8a2d65582f555ba75b05f3b0b2b2df928cd4b6469aed5%7C1d8637e40c8cc0d416ea5b4c2389b599",".tvn.pl","/").cookieBuild();
        driver.manage().addCookie(accChoos);
        Cookie sso = new CookieBuilder("sso_session_is_logged","c5c75409ad6961bd031db9f4db119b51%3Dr%3D1602682052",".tvn.pl","/").cookieBuild();
        driver.manage().addCookie(sso);
        Cookie ssooauthcookie = new CookieBuilder("sso_oauth_cookie","session_id%3Df690b56a47c1b41839149622c4d8bf2c9486930c1c58c5557855770feb3a5efb%26hash%3D85b5d7d0a12d4c7545df2d3a701b71661542ea63",".tvn.pl","/").cookieBuild();
        driver.manage().addCookie(ssooauthcookie);
//        Cookie sESSION = new CookieBuilder("SESSION","0db50e66-02cb-4602-ba50-16b073bfbe0b","sklep.player.pl","/").cookieBuild();
//        driver.manage().addCookie(sESSION);
        Cookie bookmark = new CookieBuilder("player_cache_bookmark_watched","288344cdf249e6b474723f26f2c34d94--111742033","player.pl","/").cookieBuild();
        driver.manage().addCookie(bookmark);
        Cookie contac = new CookieBuilder("_contact%2BD6nSPwdWbR%2FGkA71OJ2lQyk9AlpbDepNVFVLIGWv0w%3D","ZrN9krCcNjRauQioFWp8Ttotj-DILMQIdyebkZzRvCA.",".ipresso.pl","/").cookieBuild();
        driver.manage().addCookie(contac);
        Cookie uiprof = new CookieBuilder("ui-profile-manager-displayed","1","player.pl","/").cookieBuild();
        driver.manage().addCookie(uiprof);
        Cookie tvnse = new CookieBuilder("tvn.se","7b6e56be081ed8cb3346","rts.ipsos.pl","/").cookieBuild();
        driver.manage().addCookie(tvnse);
        Cookie shared = new CookieBuilder("uid-shared","2bd2fa10f1b74d8ab4deeb2c6c037668",".player.pl","/").cookieBuild();
        driver.manage().addCookie(shared);
        Cookie profileuid = new CookieBuilder("profile_uid","288344cdf249e6b474723f26f2c34d94",".player.pl","/").cookieBuild();
        driver.manage().addCookie(profileuid);
        Cookie jessonid = new CookieBuilder("JSESSIONID","2e9339b4bcf07318",".nr-data.net","/").cookieBuild();
        driver.manage().addCookie(jessonid);
        Cookie samuid = new CookieBuilder("samuid","288344cdf249e6b474723f26f2c34d94",".player.pl","/").cookieBuild();
        driver.manage().addCookie(samuid);
        Cookie kontotvn = new CookieBuilder("konto_tvn_at","b069a27d-72b3-4282-ae0d-c336847bf59b",".player.pl","/").cookieBuild();
        driver.manage().addCookie(kontotvn);
        Cookie ipc = new CookieBuilder("_ipc_%2BD6nSPwdWbR%2FGkA71OJ2lQyk9AlpbDepNVFVLIGWv0w%3D","ZrN9krCcNjRauQioFWp8Ttotj-DILMQIdyebkZzRvCA.",".ipresso.pl","/").cookieBuild();
        driver.manage().addCookie(ipc);
        Cookie subsrciber = new CookieBuilder("subscriber_hash","268a07432ee52a90248930a541e6b3a8b417ccfc0f8714ac0dce95a82766d72ed57d33188bea9a4da517bb0569a4129d",".player.pl","/").cookieBuild();
        driver.manage().addCookie(subsrciber);
        Cookie sesislog = new CookieBuilder("sso_session_is_logged","c5c75409ad6961bd031db9f4db119b51%3Dr%3D1602682052",".player.pl","/").cookieBuild();
        driver.manage().addCookie(sesislog);
        Cookie sescookie = new CookieBuilder("sso_session_cookie","user_id%3D12579341%26session_id%3Df690b56a47c1b41839149622c4d8bf2c9486930c1c58c5557855770feb3a5efb%26hash%3D8e2265340952828a499639e79ddf345c00da8b1f%26remember%3D09febee3df0ec974bfb47fabba4314cc",".tvn.pl","/").cookieBuild();
        driver.manage().addCookie(sescookie);

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.navigate().refresh();

//        ((JavascriptExecutor)driver).executeScript("location.href = '/seriale-online/moda-na-sukces-odcinki,2775/odcinek-7561,S16E7561,183528'");

//        driver.get("https://player.pl/seriale-online/moda-na-sukces-odcinki,2775/odcinek-7352,S14E7352,170091");

//        WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("close")));
//        closeBtn.click();
//        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-login")));
//        loginBtn.click();
//        WebElement loginByMail = wait.until(ExpectedConditions.elementToBeClickable(By.id("login_by_email")));
//        loginByMail.click();
//        WebElement sendingMail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div/div/div[1]/div/div/form/div[1]/div/input")));
//        sendingMail.sendKeys("mateusz_narozny@tvn.pl");
//        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
//        password.sendKeys("Javatozlo123");
//        WebElement btngoin = driver.findElement(By.id("sign_in"));
//        btngoin.click();
    }
}
