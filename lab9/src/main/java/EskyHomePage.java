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
    private String HOMEPAGE_URL = "https://esky.mozio.com/en-us/";

    @FindBy(xpath = "//*[@id='start_address']")
    private WebElement firstInput;

    @FindBy(xpath = "//*[@id='end_address']")
    private WebElement secondInput;

    @FindBy(xpath = "//*[@id='container']")
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

    public EskyHomePage inputFirst(String placeOfDeparture) {
        firstInput.sendKeys(placeOfDeparture);
        return this;
    }

    public EskyHomePage inputSecond(String placeOfDeparture) {
        secondInput.sendKeys(placeOfDeparture);
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
