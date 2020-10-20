package builders;

import org.openqa.selenium.Cookie;
import java.util.Date;

public class CookieBuilder {

    private final String name;
    private final String value;
    private final String dom;
    private final String p;

    public CookieBuilder(String name, String value, String dom, String p) {
        this.name = name;
        this.value = value;
        this. dom = dom;
        this.p = p;
    }

    public Cookie cookieBuild(){
        return new Cookie.Builder(this.name, this.value)
                .domain(this.dom)
                .path(this.p)
                .expiresOn(new Date(2021,4,28)).build();
    }
}
