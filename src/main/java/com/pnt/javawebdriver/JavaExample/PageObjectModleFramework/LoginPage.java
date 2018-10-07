package com.pnt.javawebdriver.JavaExample.PageObjectModleFramework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id="username")
    WebElement userNameTextField;
    @FindBy(id="password")
    WebElement passwordTextField;
    @FindBy(id="signin_button")
    WebElement signInButton;
    com.pnt.javawebdriver.JavaExample.TestAutomation1.CommonFunctions commonFunctions;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        //This initElements method will create all Web Elements defined above
        PageFactory.initElements(driver,this);
        commonFunctions=new com.pnt.javawebdriver.JavaExample.TestAutomation1.CommonFunctions(driver);
    }
    public void setUsername(String usernameString)
    {
        commonFunctions.waitForElementVisible(userNameTextField, com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable.timeout);
        userNameTextField.sendKeys(usernameString);
    }

    public void setUserPassword(String userPassword)
    {
        commonFunctions.waitForElementVisible(passwordTextField, com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable.timeout);
        passwordTextField.sendKeys(userPassword);
    }

    public void clickOnSignInButton()
    {
        commonFunctions.waitForElementVisible(signInButton, com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable.timeout);
        signInButton.click();
    }

    public void loginToSite(String userName,String userPassword)
    {
        this.setUsername(userName);
        this.setUserPassword(userPassword);
        this.clickOnSignInButton();
    }

    public boolean isSignInButtonDisplayed()
    {
        commonFunctions.waitForElementVisible(signInButton, com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable.timeout);
        return signInButton.isDisplayed();
    }


}
