import org.example.CreateAnAccountPage;
import org.example.HomePage;
import org.example.PageBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CreateAnAccountTest extends TestBase {
PageBase pageBase;
CreateAnAccountPage createAnAccountPage;
HomePage homePage;
SoftAssert softAssert;

@Test
    public void createNewAccount ()
{
    pageBase = new PageBase(driver);
    createAnAccountPage = new CreateAnAccountPage(driver);
    homePage = new HomePage(driver);
    softAssert =new SoftAssert();
    driver.get("https://magento.softwaretestingboard.com/");
    homePage.clickOnCreateAccount();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    createAnAccountPage.sendValues("Omar","Abdelbakiy","omarahmed018@gmail.com", "12345Omar**","12345Omar**");
    String text = createAnAccountPage.successMess();
    softAssert.assertEquals("text","Thank you for registering with Main Website Store.");
    System.out.println("Success Message :- " + text);

}

}
