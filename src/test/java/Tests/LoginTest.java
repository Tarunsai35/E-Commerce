// Tests/LoginTest.java
package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.LoginPage;

public class LoginTest {
    WebDriver driver;

    @Test
    public void testLogin() throws InterruptedException {
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("9666916895", "7997402963");
        Thread.sleep(5000);
        loginPage.clickLogin();

        // Assert page title or successful login indicator
        assert driver.getTitle().contains("Facebook – log in or sign up");
        driver.quit();
    }
}
