package com.icehrm_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before Test");
	}
	
	@AfterTest
	public void aftertest()  {
		System.out.println("This is after Test ");
	}
	
	@AfterSuite
	public void aftersuite()  {
		System.out.println("This is after suite");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("This is before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This is after class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is after method");
	}
	
 @Test
  public void test() {
	 System.out.println("This is test");
  }
}
