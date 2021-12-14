package Page.ChangeLanguage;

import Page.EskyStaysButton.EskyHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class ChangeLanguageHomePage {
    private WebDriver driver;
    private String STARTPAGE_URL = "https://esky.mozio.com/en-us/";

    @FindBy(xpath = "//*[@id='container']/div[1]/div/div[1]/div[1]/div/div[2]/header/nav/div/div/div/div/ul/ul[2]/div[1]/div/div/div/li/a")
    private WebElement languageButton;


    @FindBy(xpath = "//*[@id='container']/div[1]/div/div[1]/div[1]/div/div[2]/header/nav/div/div/div/div/ul/ul[2]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div")
    private WebElement selectLanguageButton;

    public ChangeLanguageHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ChangeLanguageHomePage openHomePage() {
        driver.get(STARTPAGE_URL);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        return this;
    }

    public ChangeLanguageHomePage clickOnLanguageButton() {
        languageButton.click();
        return this;
    }

    public ChangeLanguageHomePage selectLanguageButton() {
        selectLanguageButton.click();
        return this;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
