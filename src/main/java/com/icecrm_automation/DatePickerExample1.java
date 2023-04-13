package com.icecrm_automation;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






public class DatePickerExample1 {
	
	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://icehrm.com/app/cybersuccess/login.php");
	WebElement username =driver.findElement(By.id("username"));
	username.sendKeys("admin");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("2zuzfakn");
	WebElement loginButton=driver.findElement(By.xpath("//form[@id=\"loginForm\"]/div[4]/button"));
	 loginButton.click();

	 driver.findElement(By.xpath("//span[text()=\"Employees\"]")).click();
	 driver.findElement(By.xpath("//ul[@id=\"admin_Employees\"]/li[1]/a")).click();
	 driver.findElement(By.xpath("//span[text()=\" Add New\"]")).click();
	 
	 int currentDay=LocalDateTime.now().getDayOfMonth();
	 driver.findElement(By.id("birthday")).click();
	List<WebElement> days= (List<WebElement>) driver.findElement(By.xpath("//td[contains(@class,' ant-picker-cell-in-view ')]/div"));
	 for(WebElement element :days) {
	  String day=element.getText();
	 String today = String.valueOf(currentDay);
	 if(day.equals(today)) {
	 
	 element.click();
	 
	 
	 
	 
	 
	 
	 
	 }	 
	 
}
	}	
}