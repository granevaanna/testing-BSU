package Page.ChangeLanguage;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChangeLanguageResultPage extends AbstractPage {
    private String RESULTPAGE_URL = "https://esky.mozio.com/de-de/";

    public ChangeLanguageResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ChangeLanguageResultPage openPage()
    {
        driver.navigate().to(RESULTPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
