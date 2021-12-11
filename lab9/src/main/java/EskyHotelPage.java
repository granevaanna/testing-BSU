import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EskyHotelPage {
    private WebDriver driver;
    private String HOTELPAGE_URL = "https://www.esky.com/flights/select/roundtrip/mp/lon/mp/nyc?departureDate=2021-12-23&returnDate=2021-12-31&pa=1&py=0&pc=0&pi=0&sc=economy";

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
