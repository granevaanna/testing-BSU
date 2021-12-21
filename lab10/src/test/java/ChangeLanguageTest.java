import Page.ChangeLanguage.ChangeLanguageHomePage;
import Page.ChangeLanguage.ChangeLanguageResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageTest extends CommonConditions {
    @Test
    public void changeLanguageTest(){
        ChangeLanguageHomePage homePage = new ChangeLanguageHomePage(driver);
        homePage.openPage();
        homePage.clickOnLanguageButton();
        homePage.selectLanguageButton();

        ChangeLanguageResultPage resultPage = new ChangeLanguageResultPage(driver);
        resultPage.openPage();

        Assert.assertEquals(homePage.getCurrentUrl(), resultPage.getCurrentUrl());
    }
}
