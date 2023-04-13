package com.orangehrm_automation.pages;

import org.openqa.selenium.By;

import com.icehrm_automation.utility.BaseCLass;


public class OrangeHrmLoginPage extends BaseCLass {
	//declare all the locators
		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//button[text(),'Log in')]");
		
		By resetpasswordlink =By.xpath("//a[contains(text(),'Reset Password')]");
		
		public By errormsg= By.xpath("//div[contains(@class,'alert-danger')]");
		
		 public void login(String username,String password) {
			 enterText(this.username,username);
			 enterText(this.password,password);
			 click(loginButton);
		 }

		
			 
			//Reusable methods for login module 
			 
		 }

