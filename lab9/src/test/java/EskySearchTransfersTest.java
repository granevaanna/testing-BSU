import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EskySearchTransfersTest {
    private WebDriver driver;

    @BeforeTest (alwaysRun = true)
    public void browserSetup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test
    public void searchTransfersTest() throws InterruptedException {
        EskyTransfersHomePage homePage = new EskyTransfersHomePage(driver);
        homePage.openHomePage();
        homePage.inputFirst("London, UK");
        homePage.inputSecond("Newark, UK");
        homePage.clickOnSearchButton();

        EskyTransfersResultPage hotelPage = new EskyTransfersResultPage(driver);
        hotelPage.openHotelPage();

        Assert.assertEquals(homePage.getCurrentUrl(), hotelPage.getCurrentUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
