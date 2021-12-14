import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EskyStaysButtonTest {
    private WebDriver driver;

    @BeforeTest (alwaysRun = true)
    public void browserSetup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test
    public void goToTheHotelPage() throws InterruptedException {
        EskyHomePage homePage = new EskyHomePage(driver);
        homePage.openHomePage();
        homePage.openStaysPage();

        EskyStaysPage hotelPage = new EskyStaysPage(driver);
        hotelPage.openHotelPage();

        Assert.assertEquals(homePage.getCurrentUrl(), hotelPage.getCurrentUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
