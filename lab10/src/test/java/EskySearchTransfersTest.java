import Page.CheckChangeButton.CheckChangeButton;
import Page.EskySearchTransfers.EskyTransfersHomePage;
import Page.EskySearchTransfers.EskyTransfersResultPage;
import model.Location;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.LocationCreator;

public class EskySearchTransfersTest extends CommonConditions{
    @Test
    public void searchTransfersTest(){
        Location location = LocationCreator.withLocationFromProperty();
        EskyTransfersHomePage homePage = new EskyTransfersHomePage(driver);
        homePage.openPage();
        homePage.inputStartAddress(location.getStartAddress());
        homePage.inputEndAddress(location.getEndAddress());
        homePage.searchTransfers();

        EskyTransfersResultPage transfersPage = new EskyTransfersResultPage(driver);
        transfersPage.openPage();

        Assert.assertEquals(homePage.getCurrentUrl(), transfersPage.getCurrentUrl());
    }

    @Test
    public void checkChangeButtonTest() {
        Location location = LocationCreator.withLocationFromProperty();
        CheckChangeButton homePage = new CheckChangeButton(driver);
        homePage.openPage();
        homePage.inputStartAddress(location.getStartAddress());
        homePage.inputEndAddress(location.getEndAddress());
        String startText = homePage.getTextFromStartAddressInput();
        homePage.clickOnChangeButton();

        Assert.assertEquals(startText, homePage.getTextFromEndAddressInput());
    }
}
