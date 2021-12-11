import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class EskyHomePage {
    private WebDriver driver;
    private String HOMEPAGE_URL = "https://www.esky.com";

    @FindBy(xpath = "//*[@id='departureRoundtrip0']")
    private WebElement DepartFromInput;

    @FindBy(xpath = "//*[@id='arrivalRoundtrip0']")
    private WebElement flyingToInput;

    @FindBy(xpath = "//*[@id='departureDateRoundtrip0']")
    private WebElement departureDateInput;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']")
    private WebElement departureDateButton;

    @FindBy(xpath = "//*[@id='departureDateRoundtrip1']")
    private WebElement returnDateInput;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]/a")
    private WebElement returnDateButton;

    @FindBy(xpath = "//*[@id='multiQsfFlights']/form/section[2]/div[2]/fieldset[2]/button")
    private WebElement searchButton;


    public EskyHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public EskyHomePage openHomePage() {
        driver.get(HOMEPAGE_URL);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        return this;
    }

//    public WebElement findByLocator(By locator) {
//        return new WebDriverWait(driver, 100).until(ExpectedConditions.presenceOfElementLocated(locator));
//    }

    public EskyHomePage inputPlaceOfDeparture(String placeOfDeparture) {
        DepartFromInput.sendKeys(placeOfDeparture);
        return this;
    }

    public EskyHomePage inputPlaceOfArrival(String placeOfArrival) {
        flyingToInput.sendKeys(placeOfArrival);
        return this;
    }

    public EskyHomePage clickToInputDepartureDate() {
        departureDateInput.click();
        return this;
    }

    public EskyHomePage selectDepartureDate() {
        departureDateButton.click();
        return this;
    }

    public EskyHomePage clickToInputrReturnDate() {
        returnDateInput.click();
        return this;
    }

    public EskyHomePage selectReturnDate() {
        returnDateButton.click();
        return this;
    }
    public EskyHomePage clickOnSearchButton() {
        searchButton.click();
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
