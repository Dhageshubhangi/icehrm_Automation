package com.icecrm_automation;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseCLass;


public class Sample1 extends BaseCLass {
	
	@BeforeGroups(groups = {"sanity"})
	public void beforeGroups() {
		System.out.println("this is before group method");
	}
	
	@AfterGroups(groups = {"sanity"})
	public void afterGroups() {
		System.out.println("this is after group method");
	}
    @BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite from sample class");
		
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite from sample class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test from sample class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this is after test from sample class");
	}
	@Test(groups= {"sanity"})
  public void Sample1Test1()  throws AWTException {
		System.out.println("this is test1 from sample1 class");
		
		System.out.println(driver.getTitle());	
	}
	
@Test(groups = {"sanity"})
public void sample1Test2() {
	System.out.println("this is test2 from sample1 class");
	
	System.out.println(driver.getTitle());
}
@Test(groups = {"regression"})
public void sample1Test3() {
	System.out.println("this is test3 from sample1 class");
	System.out.println(driver.getTitle());
}
@Test(groups = {"regression"})
public void sample1Test4() {
	System.out.println("this is test4 from sample1 class");
	System.out.println(driver.getTitle());
}

@BeforeClass(groups = {"sanity"})
public void beforeclass() {
	System.out.println("this is before class from sample class");
	
	launchBrowser("edge");
	driver.get("http://google.com");
}
@AfterClass(groups= {"sanity"})
public void afterclass() {
	System.out.println("this is after class from sample class");
	driver.quit();
}

@BeforeMethod
public void beforeMethod() {
	System.out.println("this is before method from sample class");
}
@AfterMethod
public void afterMethod() {
	System.out.println("this is after method from sample class");
}

}


