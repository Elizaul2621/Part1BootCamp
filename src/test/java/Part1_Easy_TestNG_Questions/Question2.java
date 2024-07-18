package Part1_Easy_TestNG_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Question2 {

    public WebDriver driver;

    @Test(enabled = true)

    public void loginIN() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");// What is the proof that this url is correct

        Assert.assertTrue(driver.findElement(By.xpath("/h2[contains(text(),'Returning Customer')]")).isDisplayed());

        driver.findElement(By.id("input-email")).sendKeys("Elizauldiaz@ymail.com");
        driver.findElement(By.id("input-password")).sendKeys("Elfuerte2621@");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();


    }
}
