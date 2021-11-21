import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkyscannerHotelPage {
    private WebDriver driver;
    private String HOTELPAGE = "https://www.skyscanner.ru/hotels";

    public SkyscannerHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SkyscannerHotelPage openHotelPage() {
        driver.get(HOTELPAGE);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
