package Page.ChangeLanguage;

import Page.AbstractPage;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

public class ChangeLanguageHomePage extends AbstractPage {

    private String HOMEPAGE_URL = "https://esky.mozio.com/en-us/";

    @FindBy(xpath = "//a[text()='English']")
    private WebElement languageButton;

    @FindBy(xpath = "//div[text()='Deutsch']")
    private WebElement selectLanguageButton;

    public ChangeLanguageHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ChangeLanguageHomePage openPage()
    {
        driver.navigate().to(HOMEPAGE_URL);
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
