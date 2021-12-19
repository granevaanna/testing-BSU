package Page.EskySearchTransfers;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EskyTransfersResultPage extends AbstractPage {
    private static final String RESULTPAGE_URL = "https://esky.mozio.com/en-us/search?start_name=London%2C%20UK&end_name=Newark%2C%20UK&start_address=London%2C%20UK&end_address=Newark%2C%20UK&pickup_datetime=12%2F13%2F2021%2001%3A00%20PM&mode=one_way&num_passengers=1&currency=USD&return_pickup_datetime=12%2F20%2F2021%2001%3A00%20PM&ref=esky";

    public EskyTransfersResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public EskyTransfersResultPage openPage()
    {
        driver.navigate().to(RESULTPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
