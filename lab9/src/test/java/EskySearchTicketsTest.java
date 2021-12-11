import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EskySearchTicketsTest {
    private WebDriver driver;

    @BeforeTest (alwaysRun = true)
    public void browserSetup(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
//        driver = new ChromeDriver(options);
        driver = new SafariDriver();
    }

    @Test
    public void searchTicketsTest() throws InterruptedException {
        EskyHomePage homePage = new EskyHomePage(driver);
        homePage.openHomePage();
        homePage.inputPlaceOfDeparture("London - All Airports, England, United Kingdom (LON)");
        homePage.inputPlaceOfArrival("New York - All Airports, New York, United States of America (NYC)");
        homePage.clickToInputDepartureDate();
//        homePage.selectDepartureDate();
        homePage.clickToInputrReturnDate();
//        homePage.selectReturnDate();
        homePage.clickOnSearchButton();

        EskyHotelPage hotelPage = new EskyHotelPage(driver);
        hotelPage.openHotelPage();

        Assert.assertEquals(homePage.getCurrentUrl(), hotelPage.getCurrentUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
