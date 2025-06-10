package Steps;

import Pages.Login_page;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;

public class checkout {

    Login_page loginPage=new Login_page();
    WebDriver driver=loginPage.driver;
    @Before
    public void w()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Given("I am logged in as a registered user")
    public void given_fun1() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        loginPage.username();

        loginPage.password();
        loginPage.loginbutton();

    }


    @Given("I have added an item to my cart")
    public void And_1() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();

        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]")).click();



    }
    @And("I Click on to checkout button")
    public void And_2(){
        driver.findElement(By.id("checkout")).click();
    }
    @And("I have entered my information")
    public void And_3() throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys("Taghreed");

        driver.findElement(By.id("last-name")).sendKeys("Saeed");

        driver.findElement(By.id("postal-code")).sendKeys("19999");


    }

    @And("I Click on to continue button")
    public void And_4() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input")).click();


    }
    @When("I Click on to finish button")
    public void when() throws InterruptedException {

        driver.findElement(By.id("finish")).click();

    }

    @Then("I should see a confirmation message")
    public void then() throws InterruptedException {

        String exp="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        String actual=driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText();
        Assert.assertTrue(Objects.equals(actual, exp));
    }
    @And("the item should be removed from my cart")
    public void And_then()
    {
        System.out.println("cart is empty");
    }


    @Given("I have added multiple items to my cart")
    public void given_fun2() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();


        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();


        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]")).click();

    }

    @After
    public void after()
    {
        driver.quit();
    }
}
