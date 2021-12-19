import Page.EskyStaysButton.EskyHomePage;
import Page.EskyStaysButton.EskyStaysPage;
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
    public void goToTheStaysPage(){
        EskyHomePage homePage = new EskyHomePage(driver);
        homePage.openPage();
        homePage.openStaysPage();

        EskyStaysPage staysPage = new EskyStaysPage(driver);
        staysPage.openPage();

        Assert.assertEquals(homePage.getCurrentUrl(), staysPage.getCurrentUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
