import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EskyStaysPage {
    private WebDriver driver;
    private String STAYSPAGE_URL = "https://www.esky.com/stays/";

    public EskyStaysPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public EskyStaysPage openStaysPage() {
        driver.get(STAYSPAGE_URL);
        return this;
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
