package Part1_Easy_TestNG_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Question3 {

    public class LoginTest {

        @Test
        public void testLogin() {

            System.setProperty("\"C:\\Users\\eliza\\Desktop\\WorkFolder\\SeleniumXpath\\chromedriver_win32 (7)");
            WebDriver driver = new ChromeDriver();


            driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");


            WebElement usernameField = driver.findElement(By.id("input-email"));
            WebElement passwordField = driver.findElement(By.id("input-password"));


            usernameField.sendKeys("Elizaul@ymail.com");
            passwordField.sendKeys("Elfuerte2621@");


            driver.findElement(By.xpath("//button[@type='submit']")).click();


            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(driver-> driver.getTitle().contains("My Account"));

            // Verify successful login by checking the title of the page
            String expectedTitle = "My Account";
            String actualTitle = driver.getTitle();

            if (!actualTitle.equals(expectedTitle)) {
                throw new AssertionError("Expected title was '" + expectedTitle + "', but found '" + actualTitle + "'");
            }

            driver.quit();
        }
    }
}
