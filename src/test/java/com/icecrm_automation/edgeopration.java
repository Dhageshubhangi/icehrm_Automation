package com.icecrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class edgeopration {
	
	public static void main(String[]args) {
	
	System.setProperty("webdriver.edge.driver","msedgedriver.exe");
	
	WebDriver driver= new EdgeDriver();
	driver.navigate().to("https://icehrm.com/app/cybersuccess/login.php");
	
	WebElement username=driver.findElement(By.id("username"));
	// username.sendKeys("admin");
	
	WebElement password =driver.findElement(By.id("password"));
	 // password.sendKeys ("2zuzfakn");

	WebElement  loginButton= driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	     //loginButton.click();
	  
	  String homeText = driver.findElement(By.xpath("//header[@id=\"delegationDiv\"]/a")).getText();
	   System.out.println(homeText);
	   
	   if (homeText.equals("home")) {
		   System.out.println("Test case is passed");
	   }else {
		   System.out.println("failed to login to application");
		   // throw new Exception("failed to login to application");
	   }
	   //verify login feature with invalid username and password 
	
	driver.findElement(By.xpath("//i[@class=\"caret\"]")).click();
	
	driver.findElement(By.xpath("//div[@class=\"pull-right]")).click();
	   
	   
	  // username.sendkeys ("admin");
	   
	  // password.sendkeys ("12t482384");
	   
	  // loginButton.click();
	
		   
	   }
 }
