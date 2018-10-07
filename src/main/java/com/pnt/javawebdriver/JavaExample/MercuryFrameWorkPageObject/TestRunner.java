package com.pnt.javawebdriver.JavaExample.MercuryFrameWorkPageObject;

import com.pnt.javawebdriver.JavaExample.TestAutomation1.HelperVariable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class TestRunner  {
    WebDriver driver;
    SigninPage signinPage;
    SelectFlight selectFlight;
    FlightFinder flightFinder;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(HelperVariable.timeout, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://newtours.demoaut.com/index.php");
        signinPage =new SigninPage(driver);
        signinPage.SigninToPage("Mercury","mercury");


    }
    @BeforeTest
    public void beforeTestInfo()
    {
        System.out.println("Test started .....");
    }
    @Test
    public void BoockingTicket(){
        flightFinder= new FlightFinder(driver);
        flightFinder.ClickContinueButton();
        selectFlight=new SelectFlight(driver);
        selectFlight.ClickRadioButton();
        selectFlight.ClickContinueButton();
        Summery summery=new Summery(driver);
        summery.setFirstName();
        summery.setLastName();
        summery.setCeditNumber();
        summery.SecurePruchase();
        SignOutPage signOutPage=new SignOutPage(driver);
        signOutPage.setLogout();
    }
    @AfterTest
    public void afterTestInfo()

    {
        driver.close();
        driver.quit();

        System.out.println("Test ended .....");
    }


}
