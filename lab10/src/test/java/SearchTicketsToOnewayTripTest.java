import Page.SearchTicketsToOneway.SearchTicketsToOneWayHomePage;
import Page.SearchTicketsToOneway.SearchTicketsToOneWayResultPage;
import model.Location;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.LocationCreator;

public class SearchTicketsToOnewayTripTest extends CommonConditions{
    @Test
    public void searchTicketsToOneway(){
        Location location = LocationCreator.withLocationFromProperty();
        SearchTicketsToOneWayHomePage homePage = new SearchTicketsToOneWayHomePage(driver);
        homePage.openPage();
        homePage.clickOnToOneWayButton();
        homePage.inputDepartureRoundtrip(location.getStartAddress());
        homePage.inputArrivalRoundtrip(location.getEndAddress());
        homePage.clickOnDepartureCalendarButton();
        homePage.searchTicketsToOneWay();

        SearchTicketsToOneWayResultPage resultPage = new SearchTicketsToOneWayResultPage(driver);
        resultPage.openPage();

        Assert.assertEquals(homePage.getCurrentUrl(), resultPage.getCurrentUrl());
    }
}
