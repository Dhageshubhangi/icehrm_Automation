package com.icehrm_automation.loginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icehrm_automation.pages.LoginPage;
import com.icehrm_automation.utility.BaseCLass;

import com.icehrm_automation.utility.PropertyHandling;

import junit.framework.Assert;

public class LoginTest extends BaseCLass {

	PropertyHandling property;
	LoginPage loginpage;

	@BeforeClass
	public void start() {

		property = new PropertyHandling();
		launchBrowser(property.getProperty("browser"));
		driver.get(property.getProperty("icehrmurl"));

		loginpage = new LoginPage(driver);
	}

	@Test(dataProvider = "getLoginData")

	public void verifylogin(String username, String password, String errormsg) {

		loginpage.login(username, password);
		if (!username.isEmpty() && !password.isEmpty()) {

			String errormessage = driver.findElement(loginpage.errorMsg).getText();

			Assert.assertEquals(errormessage, errormsg);
 

		}

	}

	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data = new Object[][] {

				{ "admin123", "admin", "Login failed" },

				{ "admin", "admin124", "Login failed" },

				{ "admin123", "2zuzfakn", "Login failed" },

				{ " ", " ", " " },

				{ "", "2zuzfakn", "" },

				{ "admin", "", "" }

		};

		return data;

	}

}