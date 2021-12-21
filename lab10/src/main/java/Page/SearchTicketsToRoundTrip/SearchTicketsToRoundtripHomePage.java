package Page.SearchTicketsToRoundTrip;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTicketsToRoundtripHomePage extends AbstractPage {
    private String HOMEPAGE_URL = "https://www.esky.com/";

    @FindBy(id = "departureRoundtrip0")
    private WebElement departureRoundtripInput;

    @FindBy(id = "arrivalRoundtrip0")
    private WebElement arrivalRoundtripInput;

    @FindBy(id = "departureDateRoundtrip0")
    private WebElement departureCalendarButton;

    @FindBy(xpath = "//a[contains(@class,'ui-state-default') and text() = '23']")
    private WebElement departureDateButton;

    @FindBy(id = "departureDateRoundtrip1")
    private WebElement arrivalCalendarButton;

    @FindBy(xpath = "//a[contains(@class,'ui-state-default') and text() = '31']")
    private WebElement arrivalDateButton;

    @FindBy(xpath = "//button[contains(@class, 'btn transaction qsf-search')]")
    private WebElement searchButton;

    public SearchTicketsToRoundtripHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public SearchTicketsToRoundtripHomePage openPage()
    {
        driver.navigate().to(HOMEPAGE_URL);
        return this;
    }


    public SearchTicketsToRoundtripHomePage inputDepartureRoundtrip(String placeOfDeparture) {
        departureRoundtripInput.sendKeys(placeOfDeparture);
        return this;
    }

    public SearchTicketsToRoundtripHomePage inputArrivalRoundtrip(String placeOfArrival) {
        arrivalRoundtripInput.sendKeys(placeOfArrival);
        return this;
    }

    public SearchTicketsToRoundtripHomePage clickOnDepartureCalendarButton() {
        departureCalendarButton.click();
        return this;
    }

    public SearchTicketsToRoundtripHomePage clickOnArrivalCalendarButton() {
        arrivalCalendarButton.click();
        return this;
    }

    public SearchTicketsToRoundtripHomePage clickOnSearchButton() {
        searchButton.click();
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
