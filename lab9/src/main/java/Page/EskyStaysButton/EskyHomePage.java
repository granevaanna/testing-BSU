package Page.EskyStaysButton;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EskyHomePage extends AbstractPage {
    private static final String HOMEPAGE_URL = "https://www.esky.com";

    @FindBy(xpath = "//*[@id='multiQsf']//child::div[@class='mq-tab'][1]//child::a")
    private WebElement staysButton;

    public EskyHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public EskyHomePage openPage()
    {
        driver.navigate().to(HOMEPAGE_URL);
        return this;
    }

    public EskyHomePage openStaysPage(){
        staysButton.click();
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
