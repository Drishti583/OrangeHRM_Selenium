package HRM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

    protected WebDriver driver;
    protected String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; 

    @BeforeClass
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            // Load credentials from Excel file
            CredentialsUtil.loadCredentialsFromExcel("src/test/resources/OrangeHRM_Credentials.xlsx");

            // Perform login using the credentials loaded from the Excel file
            LoginUtil.login(driver, CredentialsUtil.getUsername(), CredentialsUtil.getPassword());
        } catch (IOException e) {
        	System.err.println("Failed to load credentials: " + e.getMessage());
            throw new RuntimeException("Failed to load credentials");
            //e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}

/*
public class Base {
	 protected WebDriver driver;
	    protected String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; 

	    @BeforeClass
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        // Login logic will be handled here, once for the whole suite
	        try {
	            LoginUtil.login(driver);  // This will be called once before the first test.
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    public WebDriver getDriver() {
	        return driver;
	    }

	    public String getBaseUrl() {
	        return baseUrl;
	    }
}
*/

/*

public class Base {
    protected WebDriver driver;
    protected String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; 

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Login logic will be handled here, once for the whole suite
        try {
            LoginUtil.login(driver, "Admin", "admin123");  // This will be called once before the first test.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
*/