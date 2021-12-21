import Page.EskyStaysButton.EskyHomePage;
import Page.EskyStaysButton.EskyStaysPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EskyStaysButtonTest extends CommonConditions{
    @Test
    public void goToTheStaysPage() throws InterruptedException {
        EskyHomePage homePage = new EskyHomePage(driver);
        homePage.openPage();
        homePage.openStaysPage();

        EskyStaysPage staysPage = new EskyStaysPage(driver);
        staysPage.openPage();

        Assert.assertEquals(homePage.getCurrentUrl(), staysPage.getCurrentUrl());
    }
}
