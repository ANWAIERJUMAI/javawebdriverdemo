package com.pnt.javawebdriver.JavaExample.PageObjectModleFramework;

import com.pnt.javawebdriver.JavaExample.TestAutomation1.DashboardPage;
import com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable;
import com.pnt.javawebdriver.JavaExample.TestAutomation1.LoginPage;
import com.pnt.javawebdriver.JavaExample.TestAutomation1.LogoutPage;
import com.pnt.javawebdriver.JavaExample.TestAutomation1.NewProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestRunner {
    WebDriver driver;
    com.pnt.javawebdriver.JavaExample.TestAutomation1.LoginPage loginPage;
    DashboardPage DashboardPage;
    NewProductPage ProductPage;
    com.pnt.javawebdriver.JavaExample.TestAutomation1.LogoutPage logoutPage;
    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(HelperVariable.timeout, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://sandbox.clinicWise.net");
        loginPage=new com.pnt.javawebdriver.JavaExample.TestAutomation1.LoginPage(driver);
        loginPage.loginToSite("admin","test");
    }
    @BeforeTest
    public void beforeTestInfo()
    {
        System.out.println("Test started .....");
    }
    @Test
    public void testAddNewProduct()
    {
        DashboardPage=new DashboardPage(driver);DashboardPage.clickOnStockLink();
        DashboardPage.clickOnProductsLink();
        ProductPage=new NewProductPage(driver);
        Random random=new Random();
        int number=random.nextInt(1000)+100000;
        String productName="TestProduct"+number;
        ProductPage.createANewProduct("Acacia Ridge",productName,""+number,"20.00");
        Assert.assertTrue(ProductPage.verifyProductConfirmationText(productName));
    }
    @AfterTest
    public void afterTestInfo()
    {
        System.out.println("Test ended .....");
    }
    @AfterClass
    public void tearDown()
    {
        logoutPage=new LogoutPage(driver);
        logoutPage.logout();
        loginPage=new LoginPage(driver);
        loginPage.isSignInButtonDisplayed();
        logoutPage.closeBrowser();
    }

}
