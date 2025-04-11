package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingProcessFlow extends PageBase {

    public ShoppingProcessFlow(WebDriver driver)
    {
        super(driver);
    }

    @FindBy (xpath = "//*[@id='search']")
    public WebElement searchElement;
    @FindBy (xpath = "//*[@class='action search']")
    public WebElement searchTollElement;
    public void productSearch (String product)
    {
     sendText(searchElement,product);
     clicking(searchTollElement);
    }

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img")
    public WebElement selectProductElement;
    public void selectProduct ()
    {
        clicking(selectProductElement);
    }

    @FindBy (xpath = "//*[@id='option-label-size-143-item-167']")
    public WebElement sizeElement;
    @FindBy (xpath = "//*[@id='option-label-color-93-item-50']")
    public WebElement colorElement;

    public void selectSizeAndColor ()
    {
        clicking(sizeElement);
        clicking(colorElement);
    }

    @FindBy (xpath = "//*[@name='qty']")
    public WebElement QTYElement;
    public void quantityFunction (String QTY)
    {
        sendText(QTYElement,QTY);
    }

    @FindBy (xpath = "//*[@id='product-addtocart-button']")
    public WebElement addCardButton;
    public void addToCard ()
    {
        clicking(addCardButton);
    }

    @FindBy(xpath = "//*[@class='message-success success message']")
    public WebElement successMessageELe;
    public String confirmMessage ()
    {
        return getText(successMessageELe);
    }
    @FindBy (xpath = "(//a[@href='https://magento.softwaretestingboard.com/checkout/cart/']) [3]")
    public WebElement shoppingCart;
    public void shoppingCartFunctionality()
    {
        clicking(shoppingCart);
    }
    @FindBy (xpath = "(//*[@class='action primary checkout']) [2]")
    public WebElement proceedCheckoutElement;
    public void proceedToCheckout ()
    {
        clicking(proceedCheckoutElement);
    }

    /*@FindBy (xpath = "(//*[@id='customer-email']) [1]")
    public WebElement emailAddElement;*/
    @FindBy (xpath = "//*[@name=\"firstname\"]")
    public WebElement fristNameEle;
    @FindBy (xpath = "//*[@name='lastname']")
    public WebElement lastNameEle;
    @FindBy (xpath = "//*[@name='street[0]']")
    public WebElement streetEle;
    @FindBy (xpath = "//*[@name='city']")
    public WebElement cityElement;
    @FindBy (xpath = "//*[@name=\"region_id\"]/option [3]")
    public WebElement stateElement;
    @FindBy (xpath = "//*[@name=\"postcode\"]")
    public WebElement postalCodeEle;
    @FindBy (xpath = "//*[@name='telephone']")
    public WebElement teleElement;
    @FindBy (xpath = "(//*[@class='radio']) [2]")
    public WebElement selectIcon;
    @FindBy (xpath = "//*[@class='button action continue primary']")
    public WebElement nextButtonEle;
    public void shippingAddressDetails (String fName, String lName, String street, String city,String postalCode,String telephone)
    {
       // sendText(emailAddElement,mail);
        sendText(fristNameEle,fName);
        sendText(lastNameEle,lName);
        sendText(streetEle,street);
        clicking(stateElement);
        sendText(cityElement, city);
        sendText(postalCodeEle,postalCode);
        sendText(teleElement,telephone);
        clicking(selectIcon);
        clicking(nextButtonEle);
    }

    @FindBy (xpath = "//*[@class=\"action primary checkout\"]")
    public WebElement placeOrderElement;
    public void clickPlaceOrder()
    {
        clicking(placeOrderElement);
    }
    @FindBy (xpath = "//*[@class='page-title']")
    public WebElement purchaseMessEle;
    public String completePurchase ()
    {
        return getText(purchaseMessEle);
    }

    @FindBy (xpath = "//*[@class='message notice']")
    public WebElement noResultElement;
    public String errorMess ()
    {
        return getText(noResultElement);
    }

}
