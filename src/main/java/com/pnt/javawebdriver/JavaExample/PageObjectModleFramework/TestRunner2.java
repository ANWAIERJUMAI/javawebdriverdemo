package com.pnt.javawebdriver.JavaExample.PageObjectModleFramework;

import com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable;
import com.pnt.javawebdriver.JavaExample.Util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestRunner2 {

    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(HelperVariable.timeout, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://sandbox.clinicWise.net");
    }
    @DataProvider
    public Object [][] getLoginData(){
        Object data [][]= TestUtil.getTestData("Login");
        return data;

    }
    @Test(dataProvider = "getLoginData")
    public void LoginTest(String Username, String Password){
        driver.findElement(By.id("username")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
        //LoginButton
        driver.findElement(By.id("signin_button")).click();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
