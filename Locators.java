package HRM;

import org.openqa.selenium.By;

public class Locators {

	// Login Page Locators
    public static final By LOGIN_USERNAME = By.xpath("//input[@placeholder='Username']");
    public static final By LOGIN_PASSWORD = By.xpath("//input[@placeholder='Password']");
    public static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");
    
    public static final By Dashboard_Element = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']");

    // Admin Menu Locators
    
    public static final By Admin_Button = By.xpath("//li[1]//a[1]//span[1]");
    public static final By Admin_Add_Button = By.xpath("//button[normalize-space()='Add']");
    
    //PIM Menu Locators
    public static final By PIM_Button = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
    public static final By PIM_AddEmployee = By.xpath("//a[normalize-space()='Add Employee']");
    
    public static final By PIM_AddEmp_photo = By.xpath("//img[@class='employee-image']");
     
    public static final By PIM_AddEmployee_FName = By.xpath("//input[@placeholder='First Name']");
    public static final By PIM_AddEmployee_MName = By.xpath("//input[@placeholder='Middle Name']");
    public static final By PIM_AddEmployee_LName = By.xpath("//input[@placeholder='Last Name']");
  public static final By PIM_AddEmployee_EmpId = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
   
    public static final By PIM_AddEmployee_toggle = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
    public static final By PIM_AddEmployee_unmae = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
    public static final By PIM_AddEmployee_password = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");
    public static final By PIM_AddEmployee_cpassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");
    public static final By PIM_AddEmployee_Save = By.xpath("//button[normalize-space()='Save']");
    
    public static final By PIM_ConfMsg = By.xpath("//h6[normalize-space()='Personal Details']");
    
    // Logout locator
    public static final By userdropdown = By.xpath("//p[@class='oxd-userdropdown-name']");
    public static final By logout = By.xpath("//a[normalize-space()='Logout']");
}
