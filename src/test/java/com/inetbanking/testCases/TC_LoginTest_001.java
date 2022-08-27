package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.ManagerHomePage;

public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		
		Logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("Entered username");
		
		lp.setPassword(password);
		Logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
	
		} else {
			Assert.assertTrue(false);
			
		}
		
		ManagerHomePage managerPage = new ManagerHomePage(driver);
		Assert.assertEquals(managerPage.getManagerIdNumber(), "Manger Id : mngr432447");
		
		System.out.print("Ugur will be manager: " + managerPage.getManagerIdNumber());
		
			
	
	}
	
	
}
