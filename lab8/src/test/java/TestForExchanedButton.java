import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestForExchanedButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.skyscanner.ru");
        Thread.sleep(2000);
        driver.quit();
    }
}
