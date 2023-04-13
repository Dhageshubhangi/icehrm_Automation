package com.icehrm_automation.employee;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseCLass;

import com.icehrm_automation.utility.PropertyHandling;

public class EmpTest extends BaseCLass {
	
	PropertyHandling propertyHandling;
	
	@BeforeClass
	public void before() {
	propertyHandling = new PropertyHandling();

}
@Test
public void login() {
	String url=propertyHandling.getProperty("orangeHrmUrl");
	launchBrowser("firefox");
	driver.navigate().to(url);
	
	String username=propertyHandling.getProperty("orangeHrmUsername");
	enterText(By.name("username"),username);
	
String password=propertyHandling.getProperty("orangeHrmPassword");
	enterText(By.name("password"),password);
	
	click(By.xpath("//button[@type='submit']"));
	
}

	
  /*@Test
public void test() {
	
	String url =propertyHandling.getPrpperty()
	
}  */
	
	
	
	
	
	
	
	
	
	
}
