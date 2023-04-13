package com.icecrm_automation;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class SeleniumWaitsExample {

	/*
	 * public void fluentWait(WebDriver driver,By by) {
	 * 
	 * Wait<WebDriver> Wait=new FluentWait<WebDriver>(driver)
	 * .withTimeout(Duration.ofSeconds(10)) .pollingEvery(Duration.ofSeconds(2))
	 * .ignoring(NoSuchElementException.class);
	 * 
	 * Wait.until((d)-> {
	 * System.out.println("verifying element to available for operation"); return
	 * d.findElement(by); }); }
	 */

	private static Function d;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "chromedriver.exe");

		// create instance of internet explorer class to launch the browser
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		// SeleniumWaitsExample obj=new SeleniumWaitsExample();
		// obj.fluentWait(driver, By.id("searchDropdownBox"));
		/*
		 * Function<WebDriver, WebElement> function = new Function<>() { public
		 * WebElement apply(WebDriver WebDriver) {
		 * System.out.println("verifying element to available for operation"); return
		 * webDriver.findElement(By.id("searchDropdownBox")); } };
		 */
		// alternative of above implememt
		/*
		 * Wait.until((d) {
		 * System.out.println("verifying element to avaible for operation");
		 * 
		 * return d.findElement(by);
		 * 
		 * }
		 * 
		 * });
		 */

	}
}
