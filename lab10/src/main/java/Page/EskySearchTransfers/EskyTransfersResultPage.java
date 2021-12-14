package Page.EskySearchTransfers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EskyTransfersResultPage {
    private WebDriver driver;
    private String RESULTPAGE_URL = "https://esky.mozio.com/en-us/search?start_name=London%2C%20UK&end_name=Newark%2C%20UK&start_address=London%2C%20UK&end_address=Newark%2C%20UK&pickup_datetime=12%2F13%2F2021%2001%3A00%20PM&mode=one_way&num_passengers=1&currency=USD&return_pickup_datetime=12%2F20%2F2021%2001%3A00%20PM&ref=esky";

    public EskyTransfersResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public EskyTransfersResultPage openHotelPage() {
        driver.get(RESULTPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
