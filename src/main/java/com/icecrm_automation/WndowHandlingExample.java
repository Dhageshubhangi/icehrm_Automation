package com.icecrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandlingExample {

	public static void main (String[]args) {
		System. setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	   /*driver.navigate().to("https://www.google.com/");
	System.out.println("Frist Tab Title:" +driver.getTitle());
	
	String FirstTabId=driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.flipkart.com/");
	System.out.println("Second Tab Title:" +driver.getTitle());
	driver.close();
	driver.switchTo().window(FirstTabId);
	System.out.println("Switched control back to First Tab and Title"+driver.getTitle());
	driver.close(); */
		
		
		driver.navigate().to("https://www.google.com/");
		System.out.println("First Tab Title:"+driver.getTitle());
		String FirstTabId=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.redbus.com/");
		System.out.println("Second Tab Title:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(FirstTabId);
		System.out.println("switched control back to first Tab and Title"+driver.getTitle());
	driver.close();
}
}