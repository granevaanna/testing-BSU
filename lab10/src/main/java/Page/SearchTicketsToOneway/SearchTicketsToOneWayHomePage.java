package Page.SearchTicketsToOneway;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTicketsToOneWayHomePage extends AbstractPage {
    private String HOMEPAGE_URL = "https://www.esky.com/";

    @FindBy(xpath = "//li[contains(@class,'type oneway')]")
    private WebElement toOneWayButton;

    @FindBy(id = "departureOneway")
    private WebElement departureOnewayInput;

    @FindBy(id = "arrivalOneway")
    private WebElement arrivalOnewayInput;

    @FindBy(id = "departureDateOneway")
    private WebElement departureCalendarButton;

    @FindBy(xpath = "//a[contains(@class,'ui-state-default') and text() = '23']")
    private WebElement departureDateButton;

    @FindBy(xpath = "//button[contains(@class, 'btn transaction qsf-search')]")
    private WebElement searchButton;

    public SearchTicketsToOneWayHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public SearchTicketsToOneWayHomePage openPage()
    {
        driver.navigate().to(HOMEPAGE_URL);
        return this;
    }

    public SearchTicketsToOneWayHomePage clickOnToOneWayButton() {
        toOneWayButton.click();
        return this;
    }

    public SearchTicketsToOneWayHomePage inputDepartureRoundtrip(String placeOfDeparture) {
        departureOnewayInput.sendKeys(placeOfDeparture);
        return this;
    }

    public SearchTicketsToOneWayHomePage inputArrivalRoundtrip(String placeOfArrival) {
        arrivalOnewayInput.sendKeys(placeOfArrival);
        return this;
    }

    public SearchTicketsToOneWayHomePage clickOnDepartureCalendarButton() {
        departureCalendarButton.click();
        return this;
    }

    public SearchTicketsToOneWayHomePage searchTicketsToOneWay() {
        searchButton.click();
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
