package com.pnt.javawebdriver.JavaExample.CucumberFramework;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefination {
    WebDriver driver;
    @Given("^User is already on log in page$")
    public void user_already_On_login_Page()  {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.freecrm.com");
    }

    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_Free_CRM()  {
        // Write code here that turns the phrase above into concrete actions
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("#1 Free CRM software in the cloud for sales and service",title);
    }

    @Then("^user enters username and  password$")
    public void user_enters_username_and_password()  {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("username")).sendKeys("Enver123");
        driver.findElement(By.name("password")).sendKeys("Enver123");

    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button()  {
        // Write code here that turns the phrase above into concrete actions
        WebElement loginBtn=driver.findElement(By.xpath("//input[type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0],click()",loginBtn);
    }


   @Then("^user is on home page$")
    public void user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        String title=driver.getTitle();
        System.out.println("Home page title is " + title);
        Assert.assertEquals("CRMPRO",title);
    }
}
