package com.pnt.javawebdriver.JavaExample.TestNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MaharaDemo {
    private WebDriver webDriver;
    private  String baseUrl;
    private String resetUrl;
    private int timeout=40;
    @BeforeClass(alwaysRun = true)
    public void setupBeforeSuit(ITestContext context) throws Exception{
        baseUrl="https://demo.mahara.org/";
        resetUrl="https://demo.mahara.org/reset";
        System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);
        webDriver.get(resetUrl);
        webDriver.navigate().to(baseUrl);
        Thread.sleep(3000);
    }
    @BeforeMethod
    public  void beforeTestInfo(){
        System.out.println("New Test Started");
    }
    @Test(dataProvider = "userinfo")
    public void LoginTest(String login_login_username, String login_login_password){
        System.out.println("login_login_username" + login_login_username + "Password" + login_login_password);
        waitForElementVisible(By.id("login_login_username") , timeout);
        WebElement usernameElement = webDriver.findElement(By.id("login_login_username"));
        usernameElement.sendKeys(login_login_username);
        waitForElementVisible(By.id("login_login_password"), timeout);
        WebElement passwordElement = webDriver.findElement(By.id("login_login_password"));
        passwordElement.sendKeys(login_login_password);
        waitForElementVisible(By.xpath("//div/input[@id=\"login_submit\"]"),timeout);
        WebElement LoginButton=webDriver.findElement(By.xpath("//div/input[@id=\"login_submit\"]"));
        LoginButton.click();
    }
  @AfterMethod
    public  void UserLogout() throws Exception{
        waitForElementVisible(By.cssSelector("span[class='icon icon-chevron-down collapsed']"),timeout);
        WebElement  UserMenuButton = webDriver.findElement(By.cssSelector("span[class='icon icon-chevron-down collapsed']"));
        UserMenuButton.click();
        Thread.sleep(2000);
      waitForElementVisible(By.cssSelector("span[class='icon icon-sign-out']"),timeout);
      WebElement LogoutButton=webDriver.findElement(By.cssSelector("span[class='icon icon-sign-out']"));
      LogoutButton.click();
       // webDriver.findElement(By.cssSelector("span[class='icon icon-sign-out']")).click();
        Thread.sleep(3000);
      waitForElementVisible(By.id("login_login_password"), timeout);
      System.out.println("--- Test Ended ------");

  }
  @AfterClass
    public void setupAfterSuit(){
        webDriver.close();
       // webDriver.quit();

    }
    @DataProvider
    public Object[][] userinfo(){
        return new Object[][]{{"admin", "MaharaDemo"},{"Student","MaharaDemo"},{"Learner","MaharaDemo"},{"Staff","MaharaDemo"}};
    }
    public  void waitForElementVisible(By by,int timeoutSeconds){
        try{
            WebDriverWait webDriverWait=new WebDriverWait(webDriver,timeoutSeconds);
        }catch (Exception e){
            System.out.println("Element " + by.toString() + "  is not found within " + timeoutSeconds + " seconds");

        }
    }
}
