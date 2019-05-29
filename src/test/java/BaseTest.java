import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/lesia/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com");
        String titleExpected = "Welcome to your professional community";
        String titleActual = driver.getTitle();
       // Assert.assertTrue(titleExpected.equals(titleActual));

        wait = new WebDriverWait(driver, 10);
    }
     //@After
    public void close(){
       // driver.quit();
     }

}
