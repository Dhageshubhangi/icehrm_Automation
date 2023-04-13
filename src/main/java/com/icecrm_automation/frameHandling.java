package com.icecrm_automation;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {
	
public static void main(String []args) {
	
	System.setProperty("WebDriver.chrome.driver","ChromeDriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("http://omayo.blogspot.com/");
	String input="Selenium";
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='navbar-iframe']")));
 driver.findElement(By.id("b-query")).sendKeys(input);
 driver.findElement(By.id("b-query-icon")).click();
driver.switchTo().defaultContent();
String output= driver.findElement(By.xpath("//div[@class='status-msg-body']/b")).getText();
if (output.equals(input)) {
	System.out.println("successfully able to verify selenium text in the search result");
} else {
	System.out.println(" unable to verify selenium text in the search result");
}
}   
}
