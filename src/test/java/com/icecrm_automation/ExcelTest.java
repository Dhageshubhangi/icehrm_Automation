package com.icecrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseCLass;

import com.icehrm_automation.utility.EmpDetails;
import com.icehrm_automation.utility.ExcelUtil;

public class ExcelTest extends BaseCLass {

	private Object sheetName;
	private EmpDetails empDetails;

/*	@DataProvider
	public Object[][] getTestData() {
		ExcelUtil excelutil = new ExcelUtil();
		String filepath = ("C:/Users/DELL/Documents.Testdata.xlsx");
		String sheetName = "sheet1";

		return excelutil.getExcelData(filepath, sheetName);
		
		
	@Test(dataProvider = "getTestData")
	public void test(String username, String password) {
		System.out.println(username + " " + password);
	} */

	@DataProvider
	public Object[][] getEmpData() {
		ExcelUtil excelutil = new ExcelUtil();
		String filepath = "C:/Users/DELL/Documents/book1.xlsx";
		String sheetName = "sheet1";
		return excelutil.getEmpInfo(filepath, sheetName);
	}

 @BeforeClass
	public void beforeclass() {
		System.out.println("this is before class method");

	launchBrowser("edge");
       driver.navigate().to("https://icehrm.com/app/cybersuccess/login.php");


}

	@Test
	public void test1() {
		enterText(By.id("username"), "admin"); // enter the valid username
		enterText(By.id("password"), "2zuzfakn"); // enter valid password
		click(By.xpath("//button[contains(text(),'Log in')]"));
	}

/*	@Test(dataProvider = "getEmpData")
	public void empTest(EmpDetails empDetails) {
		
		System.out.println(empDetails.getId());
		System.out.println(empDetails.getFirstName());
		System.out.println(empDetails.getmiddleName());
		System.out.println(empDetails.getlastName());
		System.out.println(empDetails.getprofile());
		System.out.println(empDetails.getsalary());
		System.out.println(empDetails.getcity());
		System.out.println(empDetails.getcompany());
	}
}  */
	@Test(dataProvider ="getEmpData")	
	public void data() {
		  click(By.xpath("//div[@id='EmployeeProfileStatus']//span[text()=\"Employees\"]"));
		  click(By.xpath("//span[contains(text(),\"Add New\")]"));
		  enterText(By.id("employee_id"), String.valueOf(empDetails.getEmpNum()));
		  enterText(By.id("first_name"), empDetails.getFirstName());
		  enterText(By.id("middle_name"), empDetails.getMiddleName());
		  enterText(By.id("last_name"), empDetails.getLastName());
		 driver.findElement(By.xpath("//div[@class=\\\"ant-select-selector\\\"][1]")).sendKeys("indian");
		 empDetails.getNationality();
		 
		 

	}  

}
