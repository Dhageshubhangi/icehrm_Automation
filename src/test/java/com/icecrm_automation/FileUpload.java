package com.icecrm_automation;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.pages.LoginPage;
import com.icehrm_automation.pages.ProfileAdd;
import com.icehrm_automation.utility.BaseCLass;

import com.icehrm_automation.utility.PropertyHandling;

public class FileUpload extends BaseCLass {

	LoginPage loginpage;
	ProfileAdd profileadd;
	PropertyHandling property;


	@BeforeClass
	public void beforeclass() throws InterruptedException  {

		loginpage = new LoginPage(driver);
		profileadd = new ProfileAdd();
		property = new PropertyHandling();
		String username = property.getProperty("icehrmUsername");
		String password = property.getProperty("icehrmPassword");
		String browser = property.getProperty("browser");
		String url = property.getProperty("icehrmUrl");
		launchBrowser(browser);
		driver.get(url);
		Thread.sleep(5000);
		loginpage.login(username, password);

	}



	@Test
	public void FileUpload() {

		click(profileadd.profileImg);

		click(profileadd.empprofile);

	}




}
