package com.icehrm_automation.empPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.pages.EmployeePage;
import com.icehrm_automation.pages.LoginPage;
import com.icehrm_automation.utility.BaseCLass;

import com.icehrm_automation.utility.PropertyHandling;

import junit.framework.Assert;

public class EmployeeTest extends BaseCLass {
	
	
	private static final WebElement[] allEmpDetails = null;
	PropertyHandling property;
	LoginPage  loginpage;
	EmployeePage employeePage;
	
@BeforeClass
public void beforeClass() {
	
	property = new PropertyHandling();
	
	launchBrowser(property.getProperty("browser"));
	driver.get(property.getProperty("icehrmurl"));
	
	loginpage =new LoginPage(driver);
	employeePage = new EmployeePage();
	
	String username =property.getProperty("icehrmusername");
	String password=property.getProperty("icehrmpassword");
	loginpage.login(username, password);
}
@Test
public void verifySearchEmp() throws InterruptedException {
	
click (employeePage.employeeMenu);
click(employeePage.empSubMenu)	;
	
	click(employeePage.searchButton);
	 
	List<String>allEmpFNames =new ArrayList<>();
	Thread.sleep(5000);
	driver.findElements(employeePage.allEmpInfo);
	
	for (WebElement element : allEmpDetails ) {
	 String firstName =element.getText();
	   allEmpFNames.add(firstName);
	} 
  String lastEmpName= allEmpFNames.get( allEmpDetails.length - 1);
	 enterText(employeePage.searchBox,lastEmpName);
	click(employeePage.searchButton) ;
	Thread.sleep(5000);
	List<WebElement> searchEmpDetails = driver.findElements(employeePage.allEmpInfo);
	  for (WebElement element : searchEmpDetails) {
		  
		  String firstName =element.getText();
		  Assert.assertEquals(firstName,lastEmpName);
	  }
	 
	}
	
	@AfterClass
	public void afterclass() {
		driver.close();
	}
}


