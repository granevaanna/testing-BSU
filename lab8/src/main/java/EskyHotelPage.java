import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EskyHotelPage {
    private WebDriver driver;
    private String HOTELPAGE_URL = "https://www.esky.com/stays/";

    public EskyHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public EskyHotelPage openHotelPage() {
        driver.get(HOTELPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
