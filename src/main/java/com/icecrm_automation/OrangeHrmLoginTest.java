package com.icecrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.list;

public class OrangeHrmLoginTest  {
	
	public static void main (String[]args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://opensorangehrmliveource-demo..com/web/index.php/auth/login");
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String dashboardText = driver.findElement(By.xpath("//div[@id=\"app\"]//h6")).getText();
		if (dashboardText.equals("Dashboard")){
	System.out.println("Successfully landed on the homepage of an application");
	
		}  else {
		  throw new Exception("failed to login of application");
		
  //   driver.findElement(By.xpath(""))	
		
		
		
		
		
}
	}
}
	


