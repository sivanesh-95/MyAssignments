/* Assignment 2:Edit Lead
		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Select State/Province as NewYork Using Visible Text
		  15. Click on Create Button
                  16. Click on edit button
                  17. Clear the Description Field using .clear()
		  18. Fill ImportantNote Field with Any text
		  19. Click on update button 
		  20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
 * */

package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
	
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivanesh");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Siva");
		
		driver.findElement(By.name("departmentName")).sendKeys("Cards Management");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("description")).sendKeys("Cards Management is based on the banking sytem");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shivom@gmail.com");
		
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select dd = new Select(ele);
		
		dd.selectByVisibleText("New York");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement ele1 = driver.findElement(By.name("description"));
		
		ele1.clear();
		
	    Thread.sleep(2000);
		
		ele1.sendKeys("Cards Management is based on the banking sytem that generates cards for the financial institutions");
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Senior test Engineer");
		
		 Thread.sleep(3000);
		
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 String s = driver.getTitle();
		 
		 System.out.println("Page title is : " +s);
		 
		 Thread.sleep(3000);
		 
		 driver.close();

	}

}
