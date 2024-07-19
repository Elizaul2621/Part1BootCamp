package Part1_Easy_TestNG_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Question3 {

        public WebDriver driver;
        @Test
        public void testLogin() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");


            WebElement usernameField = driver.findElement(By.id("input-email"));
            WebElement passwordField = driver.findElement(By.id("input-password"));


            usernameField.sendKeys("Elizaul@ymail.com");
            passwordField.sendKeys("Elfuerte2621@");


            driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

            // Verify successful login by checking the title of the page
            String expectedTitle = "My Account";
            String actualTitle = driver.getTitle();
            Assert.assertTrue(actualTitle.contains(expectedTitle));
           driver.quit();

            }

        }



