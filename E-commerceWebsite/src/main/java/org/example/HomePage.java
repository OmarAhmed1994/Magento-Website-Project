package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
public HomePage (WebDriver driver)
{
    super(driver);
}


@FindBy(xpath = "(//a[@href=\"https://magento.softwaretestingboard.com/customer/account/create/\"]) [1]")
public WebElement createAccount;
public void clickOnCreateAccount ()
{
  clicking(createAccount);
}

}


