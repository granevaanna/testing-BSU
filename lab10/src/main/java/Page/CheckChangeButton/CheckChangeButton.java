package Page.CheckChangeButton;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckChangeButton extends AbstractPage {
    private String HOMEPAGE_URL = "https://esky.mozio.com/en-us/";

    @FindBy(id = "start_address")
    private WebElement startAddressInput;

    @FindBy(id = "end_address")
    private WebElement endAddressInput;

    @FindBy(id = "Layer_4")
    private WebElement changeButton;

    public CheckChangeButton(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public CheckChangeButton openPage()
    {
        driver.navigate().to(HOMEPAGE_URL);
        return this;
    }

    public CheckChangeButton inputStartAddress(String startAddress) {
        startAddressInput.sendKeys(startAddress);
        return this;
    }

    public CheckChangeButton inputEndAddress(String endAddress) {
        endAddressInput.sendKeys(endAddress);
        return this;
    }

    public CheckChangeButton clickOnChangeButton() {
        changeButton.click();
        return this;
    }

    public String getTextFromStartAddressInput() {
        return startAddressInput.getText();
    }

    public String getTextFromEndAddressInput() {
        return endAddressInput.getText();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

}
