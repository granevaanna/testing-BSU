import Page.ChangeLanguage.ChangeLanguageHomePage;
import Page.ChangeLanguage.ChangeLanguageResultPage;
import Page.EskySearchTransfers.EskyTransfersHomePage;
import Page.EskySearchTransfers.EskyTransfersResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChangeLanguageTest {
    private WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void browserSetup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test
    public void changeLanguageTest() throws InterruptedException {
        ChangeLanguageHomePage homePage = new ChangeLanguageHomePage(driver);
        homePage.openHomePage();
        homePage.clickOnLanguageButton();
        homePage.selectLanguageButton();

        ChangeLanguageResultPage resultPage = new ChangeLanguageResultPage(driver);
        resultPage.openNewLanguagePage();

        Assert.assertEquals(homePage.getCurrentUrl(), resultPage.getCurrentUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }
}
