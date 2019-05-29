import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    public WebDriverWait wait;
    protected HomePage homePage;

    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}