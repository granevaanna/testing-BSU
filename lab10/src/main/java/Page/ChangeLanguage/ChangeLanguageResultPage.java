package Page.ChangeLanguage;

import Page.EskyStaysButton.EskyStaysPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChangeLanguageResultPage {
    private WebDriver driver;
    private String RESULTPAGE_URL = "https://esky.mozio.com/de-de/";

    public ChangeLanguageResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ChangeLanguageResultPage openNewLanguagePage() {
        driver.get(RESULTPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
