import Page.EskySearchTransfers.EskyTransfersHomePage;
import Page.EskySearchTransfers.EskyTransfersResultPage;
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
    public void searchTransfersTest(){
        EskyTransfersHomePage homePage = new EskyTransfersHomePage(driver);
        homePage.openPage();
        homePage.inputStartAddress("London, UK");
        homePage.inputEndAddress("Newark, UK");
        homePage.searchTransfers();

        EskyTransfersResultPage transfersPage = new EskyTransfersResultPage(driver);
        transfersPage.openPage();

        Assert.assertEquals(homePage.getCurrentUrl(), transfersPage.getCurrentUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
