package HRM;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.support.ui.WebDriverWait;

/*public class PIM_AddEMployee extends Base{

	String uniqueUsername = generateUniqueUsername();
	  

	  @Test(priority = 1)
	public void navigateToPIM() throws InterruptedException {
		WebDriver driver = getDriver();
		System.out.println("Generated Unique Username: " + uniqueUsername);
		// Wait for the Admin button to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement PIMMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_Button));
		// Click on the PIM button
		PIMMenu.click();

		WebElement AddEmployee = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee));
		AddEmployee.click();

	//	WebElement PIM_AddEmp_photo = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmp_photo));
		//PIM_AddEmp_photo.sendKeys("C:\\Users\\pci49\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\pic");
		
		WebElement PIM_AddEmployee_FName = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_FName));
		PIM_AddEmployee_FName.sendKeys("Mahesh");

		WebElement PIM_AddEmployee_MName = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_MName));
		PIM_AddEmployee_MName.sendKeys("Kumar");

		WebElement PIM_AddEmployee_LName = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_LName));
		PIM_AddEmployee_LName.sendKeys("Sharma");
		
		WebElement PIM_AddEmployee_EmpId = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_EmpId));
		PIM_AddEmployee_EmpId.clear();
		PIM_AddEmployee_EmpId.sendKeys("12");
		
		WebElement PIM_AddEmployee_toggle = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_toggle));
		PIM_AddEmployee_toggle.click();;

		WebElement PIM_AddEmployee_unmae = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_unmae));
		PIM_AddEmployee_unmae.sendKeys(uniqueUsername);
		
		WebElement PIM_AddEmployee_password = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_password));
		PIM_AddEmployee_password.sendKeys("Test@123");
		
		WebElement PIM_AddEmployee_cpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_cpassword));
		PIM_AddEmployee_cpassword.sendKeys("Test@123");

		WebElement PIM_AddEmployee_Save = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_Save));
		PIM_AddEmployee_Save.click();
		
		 WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_ConfMsg));
	        String actualConfirmationMessage = confirmationMessage.getText();
	        String expectedConfirmationMessage = "Personal Details";
	        Assert.assertTrue(actualConfirmationMessage.contains(expectedConfirmationMessage), "Confirmation message not found!");
	        Thread.sleep(4000);
	}
	
	  @Test(priority = 2)
	public void Logout() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement usermenudropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.userdropdown));
		usermenudropdown.click();
		WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.logout));
		logout.click();
		Thread.sleep(4000);
		
	}
	
		private String generateUniqueUsername() {
		    // Generate a unique identifier based on current timestamp and random number
		   
		    int randomNumber = new Random().nextInt(1000); // Generate a random number between 0 and 999
		    return "User_" + randomNumber;
	}
}

*/

public class PIM_AddEMployee extends Base {

    String uniqueUsername = generateUniqueUsername();
    String uniquePassword = "Test@123";  // Use the same password for the new user

    @Test(priority = 1)
    public void navigateToPIM() throws InterruptedException {
        WebDriver driver = getDriver();
        System.out.println("Generated Unique Username: " + uniqueUsername);

        // Wait for the Admin button to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement PIMMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_Button));
        PIMMenu.click();

        WebElement AddEmployee = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee));
        AddEmployee.click();

        WebElement PIM_AddEmployee_FName = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_FName));
        PIM_AddEmployee_FName.sendKeys("Mahesh");

        WebElement PIM_AddEmployee_MName = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_MName));
        PIM_AddEmployee_MName.sendKeys("Kumar");

        WebElement PIM_AddEmployee_LName = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_LName));
        PIM_AddEmployee_LName.sendKeys("Sharma");

        WebElement PIM_AddEmployee_EmpId = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_EmpId));
        PIM_AddEmployee_EmpId.clear();
        PIM_AddEmployee_EmpId.sendKeys("12");

        WebElement PIM_AddEmployee_toggle = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_toggle));
        PIM_AddEmployee_toggle.click();

        WebElement PIM_AddEmployee_unmae = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_unmae));
        PIM_AddEmployee_unmae.sendKeys(uniqueUsername);

        WebElement PIM_AddEmployee_password = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_password));
        PIM_AddEmployee_password.sendKeys(uniquePassword);

        WebElement PIM_AddEmployee_cpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_cpassword));
        PIM_AddEmployee_cpassword.sendKeys(uniquePassword);

        WebElement PIM_AddEmployee_Save = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_AddEmployee_Save));
        PIM_AddEmployee_Save.click();

        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PIM_ConfMsg));
        String actualConfirmationMessage = confirmationMessage.getText();
        String expectedConfirmationMessage = "Personal Details";
        Assert.assertTrue(actualConfirmationMessage.contains(expectedConfirmationMessage), "Confirmation message not found!");

      
        Thread.sleep(4000);
    }

    @Test(priority = 2)
    public void Logout() throws InterruptedException {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement usermenudropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.userdropdown));
        usermenudropdown.click();

        WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(Locators.logout));
        logout.click();

       
    }

    @Test(priority = 3)
    public void LoginWithGeneratedCredentials() throws InterruptedException {
        // Reuse LoginUtil to log in with the generated username and password
        WebDriver driver = getDriver();

        // Call login with the generated credentials
        LoginUtil.login(driver, uniqueUsername, uniquePassword);

        // Optionally verify that login was successful by checking if the dashboard is displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement dashboardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Dashboard_Element));
        Assert.assertTrue(dashboardElement.isDisplayed(), "Login failed after logout!");
    }

    private String generateUniqueUsername() {
        // Generate a unique identifier based on current timestamp and random number
        int randomNumber = new Random().nextInt(1000); // Generate a random number between 0 and 999
        return "User_" + randomNumber;
    }
}

