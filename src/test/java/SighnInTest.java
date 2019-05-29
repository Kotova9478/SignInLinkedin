import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SighnInTest extends BaseTest {

    private HomePage homePage;

    @Test



    public void testSighnIn(){
       homePage = new HomePage(driver);

       homePage.clickButton();
       SighnInPage sighnInPage = new SighnInPage(driver);

       sighnInPage.fillEmailField();
       sighnInPage.fillPasswordField();
       sighnInPage.clickSighnInField();

      VerifyPage verifyPage = new VerifyPage(driver);

    }

}
