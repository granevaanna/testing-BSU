import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.NoSuchElementException;


public class SkyscannerHomePage {
    private WebDriver driver;
    private String HOMEPAGE_URL = "https://www.skyscanner.ru";

    @FindBy(xpath = "//*[@id='skhot']")
    private WebElement hotelButton;

    public SkyscannerHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SkyscannerHomePage openHomePage() {
        driver.get(HOMEPAGE_URL);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        return this;
    }

    public SkyscannerHomePage openHotelPage(){
        hotelButton.click();
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}