package com.icecrm_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonoperation { 
	
	public static void main(String[]args) throws InterruptedException {
	
		System.setProperty("webdriver.ie.driver","chromedriver.exe");
		
		//create instance of internet explorer class to launch the browser
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
		
	Thread.sleep(5000);
		WebElement searchDropDown= driver.findElement(By.id("searchDropdownBox"));
		
        Select select = new Select(searchDropDown);
        
    /*  //  select.selectByVisibleText("computer and accessories");
        
      //  select.selectByValue("search-alias=computers");
        
        select.selectByIndex(14);
        
         select.selectByValue("search-alias=computers");*/
       
        select.selectByValue("search-alias=electronics");
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile") ;
     driver.findElement(By.id("nav-search-submit-button")).click();
     
     int totalResult;
     // get all the search result
     
     
     
     
     
}
}