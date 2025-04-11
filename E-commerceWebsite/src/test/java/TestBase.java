import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    public static WebDriver driver;

    @BeforeTest
    public void setUP ()
    {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      //driver.get("https://magento.softwaretestingboard.com/");
    }


    @AfterTest
    public void quite()
    {
          driver.quit();
    }
}
