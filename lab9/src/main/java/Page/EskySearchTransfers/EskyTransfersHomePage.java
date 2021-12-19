package Page.EskySearchTransfers;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EskyTransfersHomePage extends AbstractPage {
    private static final String TRANSFERSPAGE_URL = "https://esky.mozio.com/en-us/";

    @FindBy(xpath = "//input[@id='start_address']")
    private WebElement startAddressInput;

    @FindBy(xpath = "//input[@id='end_address']")
    private WebElement endAddressInput;

    @FindBy(xpath = "//*[@id='container']")
    private WebElement searchButton;

    public EskyTransfersHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public EskyTransfersHomePage openPage()
    {
        driver.navigate().to(TRANSFERSPAGE_URL);
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
