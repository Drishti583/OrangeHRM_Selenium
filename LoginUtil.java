package HRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/*
public class LoginUtil {

    public static void login(WebDriver driver) throws InterruptedException {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        // Set credentials for the test
        CredentialsUtil.setCredentials("Admin", "admin123");

        // Navigate to the login page
        driver.get(baseUrl);

        // Wait for elements to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement loginUsernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOGIN_USERNAME));
        WebElement loginPasswordField = driver.findElement(Locators.LOGIN_PASSWORD);
        WebElement loginButton = driver.findElement(Locators.LOGIN_BUTTON);

        // Fill out the form
        String username = CredentialsUtil.getUsername();
        String password = CredentialsUtil.getPassword();
        loginUsernameField.sendKeys(username);
        loginPasswordField.sendKeys(password);

        // Click the Login button
        loginButton.click();
        Thread.sleep(3000);  // Wait for login to complete

        // Wait for the dashboard to load (successful login)
        WebElement dashboardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")));

        // Assertion: Verify that the login was successful
        if (!dashboardElement.isDisplayed()) {
            throw new RuntimeException("Login failed. Dashboard is not visible.");
        }
    }
}
*/

public class LoginUtil {

    public static void login(WebDriver driver, String username, String password) throws InterruptedException {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        // Navigate to the login page
        driver.get(baseUrl);

        // Wait for elements to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement loginUsernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOGIN_USERNAME));
        WebElement loginPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOGIN_PASSWORD));
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOGIN_BUTTON));

        // Fill out the form with the provided credentials
        loginUsernameField.sendKeys(username);
        loginPasswordField.sendKeys(password);

        // Click the Login button
        loginButton.click();
       // Wait for login to complete

        // Wait for the dashboard to load (successful login)
        WebElement dashboardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Dashboard_Element));

        // Assertion: Verify that the login was successful
        if (!dashboardElement.isDisplayed()) {
            throw new RuntimeException("Login failed. Dashboard is not visible.");
        }
    }
}
