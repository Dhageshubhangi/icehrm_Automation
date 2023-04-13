package com.icecrm_automation;
import java.time.LocalTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample2 {
	
	public static WebDriver driver;

	public static void selectDayFromCalender(int futureDay) {
	driver.findElement(By.id("onward_cal")).click();
	/*List<WebElement> days=driver.findElement(By.xpath(""));
		
		int currentDay =LocalTime.now().getDayOfMonth();
		int dayToSelect =currentDay+futureDay;
		for(WebElement element:days){
		  String day=element.getText();
		  String today=String.valueOf(dayToSelect);
		  if (day.equals(today)){
		  element.click();
		  break;
		
		}
		}*/
	}	
		
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromrdriver.exe");
		WebDriver driver =new ChromeDriver();
		 driver.navigate().to("https://www.redbus.in/");
		 Thread.sleep(2000);
		 selectDayFromCalender(4);
		
		
		
		
	}
}		
	
