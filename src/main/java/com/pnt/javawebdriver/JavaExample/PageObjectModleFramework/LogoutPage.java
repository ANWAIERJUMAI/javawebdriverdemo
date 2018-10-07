package com.pnt.javawebdriver.JavaExample.PageObjectModleFramework;

import com.pnt.javawebdriver.JavaExample.TestAutomation1.CommonFunctions;
import com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    WebDriver driver;
    @FindBy(css="span[class='user-info']")
    WebElement userTopMenu;
    @FindBy(id="sign_out_link")
    WebElement signOutLink;
    CommonFunctions commonFunctions;

    public LogoutPage(WebDriver driver)
    {
        this.driver=driver;
        //This initElements method will create all Web Elements defined above
        PageFactory.initElements(driver,this);
        commonFunctions=new CommonFunctions(driver);
    }

    public void logout()
    {
        commonFunctions.waitForElementVisible(userTopMenu, HelperVariable.timeout);
        userTopMenu.click();
        commonFunctions.waitForElementVisible(signOutLink,HelperVariable.timeout);
        signOutLink.click();
    }

    public void closeBrowser()
    {
        driver.close();
        driver.quit();
    }

}
