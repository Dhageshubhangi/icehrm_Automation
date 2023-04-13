package com.icehrm_testNG;

import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseCLass;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class NewTest extends BaseCLass {
 
	String firstName = "Cyber";
	String lastName = "Success";
	String empId = "001" ;
			
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is launch browser method from @beforemethod");
		launchBrowser("chrome");
		driver.navigate().to("https://icehrm.com/app/cybersuccess/login.php");
				enterText(By.id("Usermane"),"admin");
				enterText(By.id("Password"),"2zuzfakn");
				click(By.xpath("//button[contains(text(),'Log in')]"));
	click(By.xpath("//span[text()='Employees']"));
	click(By.xpath("//ul[@id='admin_Employees']/li[1]/a"));
		
       }
	
	@Test
	public void addemp() {
		System.out.println("This is createEmp method from @Test");
	
		click(By.xpath("//div[@id='EmployeeTable']/descendant::span[contains(text(),'Add New')]"));
		
		enterText(By.xpath("empnum"),empId);
		
		enterText(By.xpath("firstname"),firstName);
		
		enterText(By.xpath("lastName"),lastName);
		
	}
@Test
public void verifyEmp() {
 System.out.println("This is a verifyEmp method from @Test" );
	
}
	@AfterMethod
	public void tearDown() {
		 System.out.println("This is a tearDown method from @AfterMethod" );
	}
	
	
  
}