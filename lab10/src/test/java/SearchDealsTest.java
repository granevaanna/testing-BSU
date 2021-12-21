import Page.SearchDeals.DealsHomePage;
import Page.SearchDeals.DealsResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchDealsTest extends CommonConditions{
    @Test
    public void searchDeals(){
        DealsHomePage homePage = new DealsHomePage(driver);
        homePage.openPage();
        homePage.clickOnInputDeparturePlace();
        homePage.selectDepartureCheckbox();
        homePage.clickOnOkDepartureButton();
        homePage.clickOnInputArrivalPlace();
        homePage.selectArrivalCheckbox();
        homePage.clickOnOkArrivalButton();
        homePage.searchDeals();


        DealsResultPage resultPage = new DealsResultPage(driver);
        resultPage.openPage();

        Assert.assertEquals(homePage.getCurrentUrl(), resultPage.getCurrentUrl());
    }
}