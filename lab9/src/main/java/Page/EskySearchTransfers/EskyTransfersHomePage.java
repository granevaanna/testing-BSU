package Page.EskySearchTransfers;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class EskyTransfersHomePage extends AbstractPage {
    private WebDriver driver;
    private static final String TRANSFERSPAGE_URL = "https://esky.mozio.com/en-us/";

    @FindBy(xpath = "//input[@id='start_address']")
    private WebElement startAddressInput;

    @FindBy(xpath = "//input[@id='end_address']")
    private WebElement endAddressInput;

    @FindBy(xpath = "//*[@id='container']")
    private WebElement searchButton;

    public EskyTransfersHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public EskyTransfersHomePage openTransfersHomePage() {
        driver.get(TRANSFERSPAGE_URL);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        return this;
    }

    public EskyTransfersHomePage inputStartAddress(String placeOfDeparture) {
        startAddressInput.sendKeys(placeOfDeparture);
        return this;
    }

    public EskyTransfersHomePage inputEndAddress(String placeOfDeparture) {
        endAddressInput.sendKeys(placeOfDeparture);
        return this;
    }

    public EskyTransfersHomePage searchTransfers() {
        searchButton.click();
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
