package com.icecrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main (String[] args) {
		
	//setup chromedriver file in system class
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	
	//create instance of chromedriver class to launch the browser
		WebDriver driver= new ChromeDriver();
		
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
	 
   /*       //navigate to amazon.in
	        driver.navigate().to("http://www.amazon.in/");
	        
	      //  click on best seller option
	       driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
	        
	        //refresh
	        driver.navigate().refresh();
	        
	        //back operation
	        driver.navigate().back();
	        
	        //forword
	        driver.navigate().forward();
	        
	        driver.close();   */
	  
	 
	}
	
}
	
	
	
	
	
