package Page.SearchTicketsToRoundTrip;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchTicketsToRoundtripResultPage extends AbstractPage {
    private String RESULTPAGE_URL = "https://www.esky.com/flights/select/roundtrip/mp/lon/mp/nyc?departureDate=2021-12-23&returnDate=2021-12-31&pa=1&py=0&pc=0&pi=0&sc=economy";

    public SearchTicketsToRoundtripResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public SearchTicketsToRoundtripResultPage openPage()
    {
        driver.navigate().to(RESULTPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
