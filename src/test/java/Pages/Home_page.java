package Pages;

import org.openqa.selenium.WebDriver;

public class Home_page {
    private final String homeUrl="https://the-internet.herokuapp.com/";
    WebDriver driver=null;
    public Home_page(WebDriver d)
    {
        this.driver=d;
    }
}
