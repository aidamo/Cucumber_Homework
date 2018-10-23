package stepdefs;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    WebDriver webDriver;
    @Given("^I go on the petclinic site$")
    public void iGoOnThePetclinicSite() throws Throwable {
        webDriver= new ChromeDriver( );
        webDriver.get("http://bhdtest.endava.com/petclinic/pettypes");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^I click on the HomePage$")
    public void iClickOnTheHomePage() throws Throwable {
    webDriver.findElement(By.xpath("//a[@title='home page']")).click();
    }

    @Then("^I check for the image$")
    public void iCheckForTheImage() throws Throwable {
        Thread.sleep(1000);
        Assert.assertTrue(webDriver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed());
    }
}
