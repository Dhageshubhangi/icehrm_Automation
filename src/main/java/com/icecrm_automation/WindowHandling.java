package com.icecrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class WindowHandling {
	
public static void main(String []args) throws InterruptedException {
	
	System.setProperty("webdriver.Chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
String parentWindowId = driver.getWindowHandle();
System.out.println("frist tab Id:"+parentWindowId);
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='navSwmHoliday']/a")).click();
Set<String> allIds=driver.getWindowHandles();
System.out.println("print all window ids");
for (String id: allIds){
if (!id.equals(parentWindowId)) {
	System.out.println("Second Tab Id:"+ id); 
	driver.switchTo().window(id);
	System.out.println("control switched from frist  tab to second tab");
	String SecondTabTitle=driver.getTitle();
	System.out.println("Second Tab Title:"+ SecondTabTitle);
	List<WebElement> alllinks=driver.findElements(By.tagName("a"));
	for (WebElement element: alllinks) {
		System.out.println(element.getAttribute("href"));
	driver.close();
}
}
driver.switchTo().window(parentWindowId);
String firstTabTitle=driver.getTitle();
System.out.println("control switched from Second to first tab");
System.out.println("First Tab Title:"+ firstTabTitle);
driver.close();
	
	
	
	
	
	/*driver.navigate().to("https://www.meesho.com/");
	System.out.println("Frist Tab Title:"+driver.getTitle());
	String parentWindowId =driver.getWindowHandle();
	System.out.println("First Tab Id:"+ parentWindowId);
	driver.findElement(By.xpath("//span[text()=\"Become a Supplier\"]")).click();
	Set<String> allIds=driver.getWindowHandles();
	System.out.println("print all window ids");
	Thread.sleep(4000);
	for (String id:allIds){
	if(!id.equals(parentWindowId )){
		System.out.println("Second Tab Id:"+id);
		driver.switchTo().window(id);
		System.out.println("control switched from frist  tab to second tab");
		String SecondTabTitle=driver.getTitle();
		System.out.println("Second Tab Title:"+ SecondTabTitle);
		driver.close();
		//List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		//for (WebElement element: alllinks) {
		//	System.out.println(element.getAttribute("href"));
		//driver.close();
		
		driver.switchTo().window(parentWindowId);
		String firstTabTitle=driver.getTitle();
		System.out.println("control switched from Second to first tab");
		System.out.println("First Tab Title:"+ firstTabTitle);
		driver.close();*/
		
	}
		
}
}
	
	
	


