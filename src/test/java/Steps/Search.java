package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Objects;

public class Search {
    WebDriver driver=new ChromeDriver();
    @Given("I enter special characters into the search bar")
    public void iu()
    {
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();

    }
    @When("I click on the search icon or press enter")
    public void when_2() throws InterruptedException {
        driver.findElement(By.name("site-search")).sendKeys("---//**+-");
        driver.findElement(By.name("site-search")).sendKeys(Keys.ENTER);
    }
    @Then("I should see a message indicating that no products were found")
    public void then_2() throws InterruptedException {

        driver.navigate().to("https://www.noon.com/egypt-en/search/?q=---//**+-");
    }

    @Given("I am on the homepage")
    public void given()
    {
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
    }
    @And("I enter \"laptop\" in the search bar")
    public void and_1()
    {
        driver.findElement(By.name("site-search")).sendKeys("Laptop");

    }
    //*[@name="site-search"][1]
    @When("I press the Enter key on the keyboard")
    public void when()
    {
        driver.findElement(By.name("site-search")).sendKeys(Keys.ENTER);



    }
    @Then("I should see a list of search results related to \"laptop\"")
    public void then() {
        driver.navigate().to("https://www.noon.com/egypt-en/search/?q=laptop");
    }


}
