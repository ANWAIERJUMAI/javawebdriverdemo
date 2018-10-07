package com.pnt.javawebdriver.JavaExample.MercuryFrameWorkPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
    WebDriver driver;
    @FindBy(css="input[value='Blue Skies Airlines$360$270$5:03']")
    WebElement RadioButton;
    @FindBy(css="input[name='reserveFlights']")
    WebElement ContinueButton;
    public SelectFlight(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickRadioButton(){
        RadioButton.click();
    }
    public void ClickContinueButton(){
        ContinueButton.click();
    }

}
