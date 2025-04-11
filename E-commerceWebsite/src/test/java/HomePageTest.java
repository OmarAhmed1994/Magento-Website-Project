import org.example.HomePage;
import org.example.PageBase;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
    HomePage homePage;
    PageBase pageBase;

    @Test
    public void HomePageTest ()
{
      homePage = new HomePage(driver);
      pageBase = new PageBase(driver);
      driver.get("https://magento.softwaretestingboard.com/");
      homePage.clickOnCreateAccount();

}
}
