package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {
    public WebDriver driver=new ChromeDriver();


    public void username(){
      driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    public void password(){
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    public void loginbutton(){
         driver.findElement(By.id("login-button")).click();
    }
}
