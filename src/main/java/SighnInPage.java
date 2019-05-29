import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SighnInPage extends BasePage{

    public SighnInPage(WebDriver driver){
        super(driver);
    }
     protected HomePage homePage;
    protected SighnInPage sighnInPage;
    public WebDriverWait wait;

    @FindBy(css = "#username")
    private WebElement emailField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = ".btn__primary--large.from__button--floating")
    private  WebElement sighnInButton;

    @FindBy (css = "#country-code-selector")
    private List<WebElement> codeSelector;

    @FindBy (css = "#phone-number")
    private WebElement phoneNumberField;

    @FindBy(css = ".primary-action")
    private WebElement submitButton;

    @FindBy(css = "#modalInputPassword")
    private WebElement additionalVindowPassword;

    @FindBy(css = ".modal-primary-action")
    private  WebElement additionalSubmit;

    @FindBy(css = "#pin")
    private WebElement inputCodeField;

    @FindBy(css = ".primary-action")
    private WebElement verify;

    public void fillEmailField(){
        //wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys("it9478@gmail.com");
    }
    public void fillPasswordField(){
       // wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys("12332423534");
    }
    public VerifyPage clickSighnInField(){
        //wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        sighnInButton.click();
        return new VerifyPage(driver);

    }

}
