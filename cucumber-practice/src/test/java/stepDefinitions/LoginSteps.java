package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.BaseTest;

public class LoginSteps extends BaseTest {

    @Given("user launch the browser")
    public void userlaunchbrowser()
    {
        setUp();
        
    }
    @Given("user is on login page")
    public void useronloginpage()
    {
        
        driver.get("https://www.saucedemo.com/");
    }
    @When("Enter username and password")
    public void useronentercredentials()
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }
    @Then("dashboard should be visible")
    public void usersubmitbutton(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Products");
        tearDown();
    }

}