package com.pnt.javawebdriver.JavaExample.MercuryFrameWorkPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summery {
    WebDriver driver;
    @FindBy(name="passFirst0")
    WebElement FirstName;
    @FindBy(name="passLast0")
    WebElement LastName;
    @FindBy(name="creditnumber")
    WebElement CeditNumber;
    @FindBy(css="input[type='image']")
    WebElement SecurePruchase;
    public Summery(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public void setFirstName(){
        FirstName.sendKeys("Enver");
    }
    public  void setLastName(){
        LastName.sendKeys("Jume");
    }
    public  void setCeditNumber()
    {
        CeditNumber.sendKeys("12345678");
    }
    public void SecurePruchase()
    {
        SecurePruchase.click();
    }
}
