package pageObjectModels;

import builders.CookieBuilder;
import functionality.FunctionalityHub;
import functionality.Wait;
import org.openqa.selenium.*;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = Driver.driver();

        FunctionalityHub.logInPlayer(driver);


//        HomePage home = new HomePage();
//        LogInPage logIn = new LogInPage();
//        driver.get(home.getUrl());
//
//        Cookie gad = new CookieBuilder("GAD","KlQrd8VG8UOVGGsGG8Y8kI8gWKsfn-6BMaQGmSXb-mAsEax1GGMS",".tvn.adocean.pl","/").cookieBuild();
////        manage().addCookie(gad);
//        Cookie rodo = new CookieBuilder("rodoWindowPolicy","true",".player.pl","/").cookieBuild();
//        driver.manage().addCookie(rodo);
//        WebDriverWait wait = new WebDriverWait(driver,10);
//
//        driver.navigate().refresh();
//
//        FunctionalityHub.waitingTime(5, driver);
//        home.getCloseCookieInfBtn().click();
//        FunctionalityHub.waitingTime(5, driver);
//        home.getLogInButton().click();
//        FunctionalityHub.waitingTime(5, driver);
//        WebElement btn = driver.findElement(By.id("login_by_email"));
//        btn.click();
////        logIn.getLogByEmailBtn().click();
//
//        logIn.getLoginEmail().sendKeys("mateusz_narozny@tvn.pl");
//        logIn.getLoginPass().sendKeys("Javatozlo123");
//        logIn.getSubmit().click();
    }
}
