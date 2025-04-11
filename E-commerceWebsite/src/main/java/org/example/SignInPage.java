package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageBase {
    public SignInPage (WebDriver driver)
    {
        super (driver);
    }
    @FindBy (xpath = "(//*[@class=\"action switch\"]) [1]")
    public WebElement ListElement;
    public void List ()
    {
        clicking(ListElement);
    }
    @FindBy (xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
    public WebElement SignoutElement;
    public void signout ()
    {
        clicking(SignoutElement);
    }

    @FindBy (xpath = "(//*[@class='authorization-link']) [1]")
    public WebElement signUPElement;
    public void signUPButton ()
    {
        clicking(signUPElement);
    }
    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailElement;
    @FindBy (xpath = "//*[@id='pass']")
    public WebElement passwordElement;

    public void loginValues (String mail, String pass)
    {
        sendText(emailElement,mail);
        sendText(passwordElement,pass);

    }
    @FindBy (xpath = "(//*[@name='send']) [1]")
    public WebElement signupElement;
    public void clickLogin ()
    {
        clicking(signupElement);
    }

}
