import helper.EmailPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SighnInTest extends BaseTest {

    private HomePage homePage;
    private SighnInPage sighnInPage;

    @Test



    public void testSighnIn(){
       homePage = new HomePage(driver);


        sighnInPage = homePage.clickButton();

      String randomEmail = EmailPage.createEmail();

        System.out.println(randomEmail);


       sighnInPage.fillEmailField(randomEmail);
       sighnInPage.fillPasswordField("3234565858");
       sighnInPage.clickSighnInField();

      VerifyPage verifyPage = new VerifyPage(driver);
        EmailPage emailPage = new EmailPage();


    }

}
