package com.icecrm_automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro {
  @Test
  public void test1() {
	  System.out.println("This is test1 method");
	  
	  Object[][] obj= new Object[][] {
		  {1,2},
		  {3,4}
		  
	  };
	  System.out.println(obj[0][0]);
	  System.out.println(obj[0][1]);
	  System.out.println(obj[1][0]);
	  System.out.println(obj[1][1]);
  }
  @Test(dataProvider ="provider") 
      public void test2(int a, int b) {
  System.out.println(a +" "+b);
  }
  
@DataProvider
public Object[][] provider() {
	return new Object[][] {
		{1,2},
		{3,4}
	};
}

@DataProvider
public Object[][] credentials() {
	return new Object[][] {
		
	};
}









  
  
  
  
}
