import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class GoogleExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://player.pl/");

        Cookie gad = new CookieBuilder("GAD","KlQrd8VG8UOVGGsGG8Y8kI8gWKsfn-6BMaQGmSXb-mAsEax1GGMS",".tvn.adocean.pl","/").cookieBuild();
        driver.manage().addCookie(gad);
        Cookie rodo = new CookieBuilder("rodoWindowPolicy","true",".player.pl","/").cookieBuild();
        driver.manage().addCookie(rodo);

//        driver.get("https://tvn24.pl/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("console.log(ado)");
//        System.out.println(inf.toString());
//
//        WebElement inputForm = driver.findElement(By.name("q"));
//        inputForm.sendKeys("tvn");
//        inputForm.submit();
    }

}
