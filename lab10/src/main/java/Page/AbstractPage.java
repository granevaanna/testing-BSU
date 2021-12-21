package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected abstract AbstractPage openPage();
    protected AbstractPage(WebDriver driver)
    {
        this.driver = driver;
    }
    protected List<WebElement> findAll(By locator) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
}
