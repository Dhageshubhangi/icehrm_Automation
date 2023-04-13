package com.icecrm_automation;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browseroperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setup internet explorer file in system class
				System.setProperty("webdriver.ie.driver","/Users/DELL/Downloads/IEDriverServer_x64_4.8.0/IEDriverServer.exe");
						
						//create instance of internet explorer class to launch the browser
						WebDriver driver= new InternetExplorerDriver(); 
						
						//navigate to ice hem website
						driver.get("https://icehrm.com/app/cybersuccess/login.php");

					//locate username text box on the login screen
					WebElement username= driver.findElement(By.id("username"));
					
					//enter the text (admin) in the username field
					username.sendKeys("admin");
					
					//enter the text (2ZUZfakn) in the password feild
					WebElement password= driver.findElement(By.id("password"));
					password.sendKeys("2zuzfakn"); 
					
					//locate the login button and perform click operation
					 WebElement loginButton= driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
					loginButton.click();
					}
				}
					
					
					
					
					

	


