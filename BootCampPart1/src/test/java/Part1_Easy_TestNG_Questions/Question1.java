package Part1_Easy_TestNG_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Question1 {

    public class TestJetBlueTitle {
public WebDriver driver;
        @Test
        public void testJetBlueTitle() {
           driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Navigate to the JetBlue website
            driver.get("https://www.jetblue.com");


            String expectedTitle = "JetBlue - Flights, Airline Tickets, Travel Deals & More";
            String actualTitle = driver.getTitle();

            if (!actualTitle.equals(expectedTitle)) {
                throw new AssertionError("Expected title was '" + expectedTitle + "', but found '" + actualTitle + "'");
            }


            driver.quit();
        }
    }
}
