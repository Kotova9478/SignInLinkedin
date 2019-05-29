import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);

    }


    @FindBy(css = "body > nav > a.nav__button-secondary")
                              //(css = ".nav__button-secondary")
    private WebElement sighnInClickButton;


    public SighnInPage clickButton() {
       // wait.until(ExpectedConditions.elementToBeClickable(sighnInClickButton));
        sighnInClickButton.click();
       // homePage.clickButton();

        return new SighnInPage(driver);

    }


}
