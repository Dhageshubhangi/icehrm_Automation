package com.icecrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample {
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	/*driver.navigate().to("https://icehrm.com/app/cybersuccess/login.php");
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("admin");
	WebElement password=driver.findElement(By.id("password"));
	 password.sendKeys("2zuzfakn");
	 Actions actions= new Actions(driver);
	 actions.moveToElement(driver.findElement(By.xpath("//form[@id='loginForm']//button"))).click().build().perform();*/
	
	 driver.get("https://my.agilecrm.com/enter-domain?to=login");
	 driver.findElement(By.id("subdomain")).sendKeys("keyboard");
	 driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();
	 driver.findElement(By.name("email")).sendKeys("computer@yopmail.com");
	 driver.findElement(By.name("password")).sendKeys("test123");
     driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();
     driver.findElement(By.id("dealsmenu")).click();
     WebElement src= driver.findElement(By.xpath("//a[contains(text(),'testing')]"));
     WebElement dst= driver.findElement(By.id("deals-by-paging-relax-model-list"));
     Actions action=new Actions(driver);
     Thread.sleep(2000);
    // action.dragAndDrop(src,dst).build().perform();
     action.clickAndHold(src).release(dst).build().perform();
     
    // driver.close();
     
}
}