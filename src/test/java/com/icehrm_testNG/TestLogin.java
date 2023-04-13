package com.icehrm_testNG;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseCLass;

public class TestLogin extends BaseCLass {
	
	@BeforeClass
	public void beforeclass () {
		System.out.println("this is before class method");
	
	
	//launch the browser and navigate to icehrm application
	launchBrowser("edge");
	driver.get("https://icehrm.com/app/cybersuccess/login.php");
}	
@AfterClass
	public void afterclass() {
		System.out.println("this is after class method");
		
		//close the browser
		driver.close();
		
	}
 @Test
  public void verifyLoginWithValidCred() {
	 enterText(By.id("username"),"admin") ;  //enter the valid username
	 enterText(By.id("password"),"2zuzfakn") ; //enter valid password
	 click(By.xpath("//button[contains(text(),'Log in')]")); //click on login button
	 
  }


	
}

	


