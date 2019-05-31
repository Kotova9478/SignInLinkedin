import helper.EmailPage;
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


    @FindBy(css = "#username")
    private WebElement emailField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = ".btn__primary--large.from__button--floating")
    private  WebElement sighnInButton;



    public void fillEmailField(String email){
        //wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void fillPasswordField(String pasword){
       // wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(pasword);
    }

    public VerifyPage clickSighnInField(){
        //wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        sighnInButton.click();
        return new VerifyPage(driver);

    }

}
