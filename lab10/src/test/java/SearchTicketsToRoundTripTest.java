import Page.SearchTicketsToOneway.SearchTicketsToOneWayHomePage;
import Page.SearchTicketsToOneway.SearchTicketsToOneWayResultPage;
import Page.SearchTicketsToRoundTrip.SearchTicketsToRoundtripHomePage;
import Page.SearchTicketsToRoundTrip.SearchTicketsToRoundtripResultPage;
import model.Location;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.LocationCreator;

public class SearchTicketsToRoundTripTest extends CommonConditions{
    @Test
    public void searchTicketsToRoundTrip(){
        Location location = LocationCreator.withLocationFromProperty();
        SearchTicketsToRoundtripHomePage homePage = new SearchTicketsToRoundtripHomePage(driver);
        homePage.openPage();
        homePage.inputDepartureRoundtrip(location.getStartAddress());
        homePage.inputArrivalRoundtrip(location.getEndAddress());
        homePage.clickOnDepartureCalendarButton();
        homePage.clickOnArrivalCalendarButton();
        homePage.clickOnSearchButton();

        SearchTicketsToRoundtripResultPage resultPage = new SearchTicketsToRoundtripResultPage(driver);
        resultPage.openPage();

        Assert.assertEquals(homePage.getCurrentUrl(), resultPage.getCurrentUrl());
    }
}
