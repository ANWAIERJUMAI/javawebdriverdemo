package com.pnt.javawebdriver.JavaExample.TestNGFrameWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNGWebDriverDemo1 {
    private WebDriver webDriver;
       private String baseUrl;
     private String resetUrl;
       private int timeout = 30;

               @BeforeClass(alwaysRun = true)
       public void setupBeforeSuite(ITestContext context) {
                   baseUrl = "http://sandbox.clinicwise.net";
                   resetUrl = "http://sandbox.clinicwise.net/reset";
                   System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
                   webDriver = new ChromeDriver();
                   webDriver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
                   webDriver.manage().window().maximize();
                   webDriver.get(resetUrl);
                   webDriver.navigate().to(baseUrl);
               }

               @BeforeMethod
       public void beforeTestInfo() {
                   System.out.println(" ---- New Test Started ---");
               }

               @Test(dataProvider = "userinfo")
       public void loginTest(String sUsername, String sPassword) {
                  System.out.println("Username=" + sUsername + " Password=" + sPassword);
                   waitForElementVisible(By.id("username"), timeout);
                   WebElement usernameElement = webDriver.findElement(By.id("username"));
                   usernameElement.sendKeys(sUsername);
                   waitForElementVisible(By.id("password"), timeout);
                   WebElement passwordElement = webDriver.findElement(By.id("password"));
                   passwordElement.sendKeys(sPassword);
                   waitForElementVisible(By.xpath("//div/input[@id=\"signin_button\"]"), timeout);
                   WebElement loginButton = webDriver.findElement(By.xpath("//div/input[@id=\"signin_button\"]"));
                   loginButton.click();
                   waitForElementVisible(By.id("user_nav_link"), timeout);
                   WebElement usernavigationLink = webDriver.findElement(By.id("user_nav_link"));
                   Assert.assertTrue(usernavigationLink.isDisplayed());
               }

               @AfterMethod
       public void userLogout() {
                   waitForElementVisible(By.id("user_nav_link"), timeout);
                   webDriver.findElement(By.id("user_nav_link")).click();
                   waitForElementVisible(By.id("sign_out_link"), timeout);
                   webDriver.findElement(By.id("sign_out_link")).click();
                   waitForElementVisible(By.id("username"), timeout);
                   System.out.println("--- Test Ended ------");
               }

               @AfterClass
       public void setupAfterSuite() {
                   webDriver.close();
                   webDriver.quit();
               }

               @DataProvider
       public Object[][] userinfo() {
                   return new Object[][]{{"admin", "test"}, {"jackie", "test"}, {"natalie", "test"}, {"sharon", "test"}};
               }
       //wait for element visible on the page
               public void waitForElementVisible(By by, int timeoutSeconds) {
                   try {
                           WebDriverWait webDriverWait = new WebDriverWait(webDriver, timeoutSeconds);
                           //webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((by)));
                       } catch (Exception e) {
                           System.out.println("Element " + by.toString() + "  is not found within " + timeoutSeconds + " seconds");
                       }

               }
}
