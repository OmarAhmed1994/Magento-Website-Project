import org.example.PageBase;
import org.example.SignInPage;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUPTest extends TestBase{

    SignInPage signInPage;
    PageBase pageBase;

    @Test
    public void signUpClicking () throws InterruptedException {
        signInPage = new SignInPage(driver);
        pageBase = new PageBase(driver);
       // driver.get("https://magento.softwaretestingboard.com/");
        signInPage.List();
        Thread.sleep(3000);
        signInPage.signout();
        signInPage.signUPButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        signInPage.loginValues("omarahmed018@gmail.com","12345Omar**");
        signInPage.clickLogin();
    }
}
