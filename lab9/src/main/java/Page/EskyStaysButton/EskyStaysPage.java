package Page.EskyStaysButton;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EskyStaysPage extends AbstractPage {
    private static final String STAYSPAGE_URL = "https://www.esky.com/stays/";

    public EskyStaysPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public EskyStaysPage openPage()
    {
        driver.navigate().to(STAYSPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
