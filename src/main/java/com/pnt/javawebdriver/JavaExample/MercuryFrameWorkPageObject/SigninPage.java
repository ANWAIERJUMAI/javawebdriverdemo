package com.pnt.javawebdriver.JavaExample.MercuryFrameWorkPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
    WebDriver driver;
    @FindBy(name = "userName")
    WebElement UsernameTextFile;
    @FindBy(name="password")
    WebElement PasswordTextFile;
    @FindBy(name="login")
    WebElement SigninButton;
    public SigninPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void setUsername(String username) {
        UsernameTextFile.sendKeys(username);
    }
    public void setUserPassword(String userPassword){
        PasswordTextFile.sendKeys(userPassword);

    }
    public void ClickonLoginButton(){
        SigninButton.click();
    }
    public void SigninToPage(String userName, String Password){
        this.setUsername(userName);
        this.setUserPassword(Password);
        this.ClickonLoginButton();

    }
    public boolean isLoginButtonDisplayed(){
        return  SigninButton.isDisplayed();
    }

}
