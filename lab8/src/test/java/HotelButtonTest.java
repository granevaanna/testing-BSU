import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;

public class HotelButtonTest {

    private WebDriver driver;
    private WebDriver flighPage;
    private WebDriver hotelPage;

    @BeforeTest (alwaysRun = true)
    public void browserSetup(){
        driver = new SafariDriver();
    }

    @Test
    public void goToTheHotelPage() throws InterruptedException {
        flighPage = driver;
        flighPage.get("https://www.skyscanner.ru");

        WebElement hotelButton =flighPage.findElement(By.xpath("//*[@id='skhot']/span"));
        hotelButton.click();

        hotelPage = driver;
        hotelPage.get("https://www.skyscanner.ru/hotels");

        Assert.assertEquals(flighPage.getCurrentUrl(), hotelPage.getCurrentUrl());
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown(){
        driver.quit();
        driver = null;
    }
}
