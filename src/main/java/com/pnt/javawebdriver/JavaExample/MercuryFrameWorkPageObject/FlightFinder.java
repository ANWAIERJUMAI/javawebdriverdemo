package com.pnt.javawebdriver.JavaExample.MercuryFrameWorkPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFinder {
    WebDriver driver;
    @FindBy(name="findFlights")
    WebElement ContinueButton;

    public FlightFinder(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void ClickContinueButton(){

        ContinueButton.click();
    }
}
