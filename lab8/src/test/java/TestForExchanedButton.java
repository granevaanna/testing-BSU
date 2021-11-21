import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import javax.lang.model.element.Element;

public class TestForExchanedButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.skyscanner.ru");

        WebElement originSearch = driver.findElement(By.id("fsc-origin-search"));
        originSearch.sendKeys("Минкс(Любой)");

        WebElement destinationSearch = driver.findElement(By.id("fsc-destination-search"));
        destinationSearch.sendKeys("Киев(Любой)");

        WebElement exchangedButton = driver.findElement(By.xpath("//*[@id='flights-search-controls-root']"));
        exchangedButton.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
