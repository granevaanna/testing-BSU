package Page.SearchDeals;

import Page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DealsResultPage extends AbstractPage {
    private String RESULTPAGE_URL = "https://www.esky.com/deals/110108/ALB-PGD-G4";

    public DealsResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public DealsResultPage openPage()
    {
        driver.navigate().to(RESULTPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
