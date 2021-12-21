package Page.SearchDeals;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsHomePage extends AbstractPage {
    private String HOMEPAGE_URL = "https://www.esky.com/deals";

    @FindBy(xpath = "//div[contains(@data-type,'departure')]//input[contains(@class, 'input filter-input')]")
    private WebElement departureInput;

    @FindBy(xpath = "//div[contains(@data-code,'ALB')]")
    private WebElement departureCheckbox;

    @FindBy(xpath = "//div[contains(@data-type,'departure')]//button[text() = 'Ok']")
    private WebElement departureOkButton;

    @FindBy(xpath = "//div[contains(@data-type,'arrival')]//input[contains(@class, 'input filter-input')]")
    private WebElement arrivalInput;

    @FindBy(xpath = "//div[@class='expandable-list expanded']//div[contains(@data-code,'PGD')]")
    private WebElement arrivalCheckbox;

    @FindBy(xpath = "//div[contains(@data-type,'arrival')]//button[text() = 'Ok']")
    private WebElement arrivalOkButton;


    @FindBy(xpath = "//button[text() = 'Search deals']")
    private WebElement searchButton;

    public DealsHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public DealsHomePage openPage()
    {
        driver.navigate().to(HOMEPAGE_URL);
        return this;
    }

    public DealsHomePage clickOnInputDeparturePlace() {
        departureInput.click();
        return this;
    }

    public DealsHomePage selectDepartureCheckbox() {
        departureCheckbox.click();
        return this;
    }

    public DealsHomePage clickOnOkDepartureButton() {
        departureOkButton.click();
        return this;
    }

    public DealsHomePage clickOnInputArrivalPlace() {
        arrivalInput.click();
        return this;
    }

    public DealsHomePage selectArrivalCheckbox() {
        arrivalCheckbox.click();
        return this;
    }

    public DealsHomePage clickOnOkArrivalButton() {
        arrivalOkButton.click();
        return this;
    }

    public DealsHomePage searchDeals() {
        searchButton.click();
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
