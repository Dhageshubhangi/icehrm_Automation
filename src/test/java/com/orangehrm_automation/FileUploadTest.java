package com.orangehrm_automation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseCLass;

import com.icehrm_automation.utility.PropertyHandling;
import com.orangehrm_automation.pages.MyInfoPage;
import com.orangehrm_automation.pages.OrangeHrmLoginPage;

public class FileUploadTest  extends BaseCLass{

	
	OrangeHrmLoginPage orangehrmloginpage;
	MyInfoPage myinfopage;
	PropertyHandling property;

	
	@BeforeClass
	public void beforeclass() throws InterruptedException {
		
		orangehrmloginpage= new OrangeHrmLoginPage();
		myinfopage = new MyInfoPage();
		property= new PropertyHandling();
		String username=property.getProperty("orangeHrmUsername");
		String password=property.getProperty("orangeHrmPassword");
		String browser=property.getProperty("browser");
		String url =property.getProperty("OrangeHrmUrl");
		launchBrowser(browser);
		driver.get(url);
		Thread.sleep(2000);
		orangehrmloginpage.login(username,password);
		
	}
	@Test
	public void fileUpload() {
	click(myinfopage.MyInfoMenu);
	click(myinfopage.ProfileImg);
	click(myinfopage.AddImg);
	try{
		Thread.sleep(10000);
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Documents\\orangehrmFileUpload.exe C:\\Users\\DELL\\Downloads\\beautiful_Flower.jpg");
	}catch(Exception e){
		
	}
	
	
	}
	
	
	
}
