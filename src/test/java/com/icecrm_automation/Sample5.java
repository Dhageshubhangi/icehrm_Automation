package com.icecrm_automation;

import org.testng.annotations.*;

public class Sample5 {
	
  @Parameters({"username","password"})
  @Test
  public void sample5Test1(@Optional String username,String password) {
		System.out.println("this is test1 from sample5 class");
		System.out.println("this is test1 from sample5 class and username is :"+username +"and the password is:"+password);
		
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeclass(@Optional String browser) {
		System.out.println("sample5 before class");
		System.out.println("this is sample5 class and browser value is :" +browser);
		
	}
	
	
	
}
