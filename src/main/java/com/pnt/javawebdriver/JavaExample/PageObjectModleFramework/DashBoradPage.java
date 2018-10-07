package com.pnt.javawebdriver.JavaExample.PageObjectModleFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoradPage {
    WebDriver driver;
    @FindBy(css = "span[class='user-info']")
    WebElement userNavigationLink;
    @FindBy(id = "nav_stock")
    WebElement stockLink;
    @FindBy(id = "menu_products_link")
    WebElement productLink;
    com.pnt.javawebdriver.JavaExample.TestAutomation1.CommonFunctions commonFunctions;
    public DashBoradPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        commonFunctions=new com.pnt.javawebdriver.JavaExample.TestAutomation1.CommonFunctions(driver);
    }

    public void clickOnStockLink()
    {
        commonFunctions.waitForElementVisible(stockLink, com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable.timeout);
        stockLink.click();
    }

    public void clickOnProductsLink()
    {
        commonFunctions.waitForElementVisible(productLink, com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable.timeout);
        productLink.click();
    }
}
