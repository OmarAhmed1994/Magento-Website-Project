package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

   public static void clicking (WebElement element)
   {
    element.click();
   }

   public static void sendText (WebElement element, String text)
   {
      element.sendKeys(text);
   }

  public static String getText(WebElement element)
  {
    return element.getText();
  }
}
