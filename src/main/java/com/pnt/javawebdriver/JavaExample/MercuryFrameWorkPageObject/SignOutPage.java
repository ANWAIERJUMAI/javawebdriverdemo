package com.pnt.javawebdriver.JavaExample.MercuryFrameWorkPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage {
    WebDriver driver;
    @FindBy(css="img[height='23']")
    WebElement Logout;
    public SignOutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void setLogout(){
        Logout.click();

    }
}
