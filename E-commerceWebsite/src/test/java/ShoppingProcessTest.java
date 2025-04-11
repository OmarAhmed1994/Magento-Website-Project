import org.example.HomePage;
import org.example.PageBase;
import org.example.ShoppingProcessFlow;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ShoppingProcessTest extends TestBase {

    ShoppingProcessFlow shoppingProcessFlow;
    PageBase pageBase;
    HomePage homePage;
    JavascriptExecutor js;
    SoftAssert softAssert;

    @Test (priority = 1)
    public void productSearchFunctionality ()
    {
        shoppingProcessFlow = new ShoppingProcessFlow(driver);
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        driver.get("https://magento.softwaretestingboard.com/customer/account/");
        shoppingProcessFlow.productSearch("Radiant Tee");
    }

    @Test (priority = 2)
    public void addToCardFunctionality ()
    {
        shoppingProcessFlow = new ShoppingProcessFlow(driver);
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        softAssert =new SoftAssert();
       // driver.get("https://magento.softwaretestingboard.com/");
       shoppingProcessFlow.productSearch("Radiant Tee");
       js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,700)");
        shoppingProcessFlow.selectProduct();
        shoppingProcessFlow.selectSizeAndColor();
        shoppingProcessFlow.quantityFunction("1");
        shoppingProcessFlow.addToCard();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String text1 = shoppingProcessFlow.confirmMessage();
        softAssert.assertEquals(text1,"You added Radiant Tee to your shopping cart");
        System.out.println("Confirm Message :- " + text1);
    }
    @Test (priority = 3)
    public void completingPurchase () throws InterruptedException {
        shoppingProcessFlow = new ShoppingProcessFlow(driver);
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        softAssert =new SoftAssert();
        //driver.get("https://magento.softwaretestingboard.com");
        shoppingProcessFlow.productSearch("Radiant Tee");
        //js = (JavascriptExecutor) driver;
      //  js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(3000);
        shoppingProcessFlow.selectProduct();
        shoppingProcessFlow.selectSizeAndColor();
        shoppingProcessFlow.quantityFunction("4");
        shoppingProcessFlow.addToCard();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        shoppingProcessFlow.shoppingCartFunctionality();
        shoppingProcessFlow.proceedToCheckout();
        Thread.sleep(5000);
        shoppingProcessFlow.shippingAddressDetails("omar","ahmed", "2222 Wellington Ct Lisle", "NewYork","11511","0122365478");
        Thread.sleep(5000);
        shoppingProcessFlow.clickPlaceOrder();
        Thread.sleep(3000);
        String purMess = shoppingProcessFlow.completePurchase();
        softAssert.assertEquals(purMess,"Thank you for your purchase!");
        System.out.println("Confirmation Purchase :- " + purMess);

    }
    @Test (priority = 4)
    public void invalidProductSearch ()
    {
        shoppingProcessFlow = new ShoppingProcessFlow(driver);
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        //driver.get("https://magento.softwaretestingboard.com/");
        shoppingProcessFlow.productSearch("ww923621");
        String noResult = shoppingProcessFlow.errorMess();
        System.out.println("Error Message :- " + noResult);
    }


}
