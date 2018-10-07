package com.pnt.javawebdriver.JavaExample.PageObjectModleFramework;

import com.pnt.javawebdriver.JavaExample.TestAutomation1.CommonFunctions;
import com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;
    @FindBy(linkText = "New Product")
    WebElement newProductLink;
    @FindBy(css="input[class='select2-search__field']")
    WebElement clinicField;
    @FindBy(id="product_name")
    WebElement productNameTextField;
    @FindBy(id="product_code")
    WebElement productCodeTextField;
    @FindBy(id="product_price")
    WebElement productPriceTextField;
    @FindBy(css="input[value='Create Product']")
    WebElement createProductButton;
    @FindBy(xpath="//div[@id='flash_notice']")
    WebElement productConfirmationField;
    CommonFunctions commonFunctions;
    public ProductPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        commonFunctions=new CommonFunctions(driver);
    }

    public void clickOnNewProductLink()
    {
        commonFunctions.waitForElementVisible(newProductLink, HelperVariable.timeout);
        newProductLink.click();
    }
    public void enterAClinicName(String clinicName)
    {
        commonFunctions.waitForElementVisible(clinicField,HelperVariable.timeout);
        clinicField.sendKeys(clinicName+ Keys.ENTER);
    }
    public void enterProductName(String productName)
    {
        commonFunctions.waitForElementVisible(productNameTextField,HelperVariable.timeout);
        productNameTextField.sendKeys(productName);
    }
    public void enterProductCode(String productCode)
    {
        commonFunctions.waitForElementVisible(productCodeTextField,HelperVariable.timeout);
        productCodeTextField.sendKeys(productCode);
    }
    public void setProductPrice(String price)
    {
        commonFunctions.waitForElementVisible(productPriceTextField,HelperVariable.timeout);
        productPriceTextField.clear();
        productPriceTextField.sendKeys(price);
    }
    public void clickOnCreateProductButton()
    {
        commonFunctions.waitForElementVisible(createProductButton,HelperVariable.timeout);
        createProductButton.click();
    }

    public boolean verifyProductConfirmationText(String expectedText)
    {
        commonFunctions.waitForElementVisible(productConfirmationField,HelperVariable.timeout);
        String confirmationText=productConfirmationField.getText();
        if(confirmationText.contains(expectedText))
            return true;
        else
            return false;
    }

    public void createANewProduct(String clinicName,String productName,String productCode,String productPrice)
    {
        this.clickOnNewProductLink();
        this.enterAClinicName(clinicName);
        this.enterProductName(productName);
        this.enterProductCode(productCode);
        this.setProductPrice(productPrice);
        this.clickOnCreateProductButton();
    }
}
