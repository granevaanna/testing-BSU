package Page.SearchTicketsToOneway;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchTicketsToOneWayResultPage extends AbstractPage {
    private String RESULTPAGE_URL = "https://www.esky.com/flights/select/oneway/mp/lon/mp/nyc?departureDate=2021-12-23&pa=1&py=0&pc=0&pi=0&sc=economy";

    public SearchTicketsToOneWayResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public SearchTicketsToOneWayResultPage openPage()
    {
        driver.navigate().to(RESULTPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
