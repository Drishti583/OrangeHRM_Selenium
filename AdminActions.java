package HRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AdminActions extends Base
{

	@Test
    public void navigateToAdmin() throws InterruptedException {
        WebDriver driver = getDriver();

        // Wait for the Admin button to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement adminButton = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Admin_Button));

        // Click on the Admin button
        adminButton.click();
        Thread.sleep(3000);
        // Wait or perform any additional actions if required
       

        WebElement adminaddButton = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Admin_Add_Button));

        // Click on the Admin button
        adminaddButton.click(); 
        
        Thread.sleep(3000);
        
       WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")));
        dropdown.click();
        
        Thread.sleep(7000);
       // WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[1]")));
    //   dropdown.click();
       

    //   WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Admin']")));
    //   option.click();      
     
       List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
       System.out.println("Number of options:" +options.size());
       
       for(WebElement op:options)
       {
    	   System.out.println(op.getText());
       }
        
        Thread.sleep(3000);
       // subUnit.click();
       // Select sel=new Select(subUnit);
		//sel.selectByVisibleText("Admin");
     /*   WebElement dropdown = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[1]"));
        dropdown.click();

        // Wait for the dynamic options to load
       
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[1]/div[@class='oxd-select-text-input']")));

        // Select an option
        List<WebElement> options = driver.findElements(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[1]/div[@class='oxd-select-text-input']"));
        for (WebElement option : options) {
            if (option.getText().equals("Admin")) {
                option.click();
                break;
                
            }
            Thread.sleep(5000);
        }*/
    }
}
