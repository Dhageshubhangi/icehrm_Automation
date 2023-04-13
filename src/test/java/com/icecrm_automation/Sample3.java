package com.icecrm_automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample3 {
  
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite from sample3 class");
		
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite from sample3 class");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("this is before test from sample3 class");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("this is after test from sample3 class");
	}

	@Test
  public void sample3Test1() {
  	System.out.println("this is test1 from sample3 class");
  }
	@Test
	  public void sample3Test2() {
	  	System.out.println("this is test1 from sample3 class");
	  }
	@Test
	  public void sample3Test3() {
	  	System.out.println("this is test1 from sample3 class");
	  }
	@Test
	  public void sample3Test4() {
	  	System.out.println("this is test1 from sample3 class");
	  }
	@Test
	  public void sample3Test5() {
	  	System.out.println("this is test1 from sample3 class");
	  }
	@BeforeMethod
	public void beforemethod() {
		System.out.println("this is before method from sample3 class");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("this is after method from sample3 class");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("this is before class from sample3 class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("this is after class from sample3 class");
	}

  }

