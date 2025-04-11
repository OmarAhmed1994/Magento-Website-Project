package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage extends PageBase {
public CreateAnAccountPage (WebDriver driver)
{
super(driver);
}
    @FindBy (xpath = "//*[@id='firstname']")
    public WebElement fNameElement;
    @FindBy (xpath = "//*[@id='lastname']")
    public WebElement lNameElement;
    @FindBy (xpath = "//*[@id='email_address']")
    public WebElement emailElement;
    @FindBy (xpath = "//*[@id='password']")
    public WebElement passElement;
    @FindBy(xpath = "//*[@id='password-confirmation']")
    public WebElement confirmPassElement;
    @FindBy (xpath = "//*[@class='action submit primary']")
    public WebElement createAccButtonEle;

    public void sendValues (String fName, String lName, String email, String pass, String confirmPass)
    {
        sendText(fNameElement,fName);
        sendText(lNameElement,lName);
        sendText(emailElement,email);
        sendText(passElement,pass);
        sendText(confirmPassElement,confirmPass);
        clicking(createAccButtonEle);
    }
      @FindBy (xpath = "//*[@class='message-success success message']")
      public WebElement successMessElement;
      public String successMess ()
      {
       return getText(successMessElement);
      }

}


