package com.saal.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saal.qa.bases.TestBase;
import com.saal.qa.pages.HomePage;
import com.saal.qa.pages.LoginPage;
import com.saal.qa.pages.WomenlinkPage;

public class WomenPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	WomenlinkPage womenlinkpage;
	public WomenPageTest() {
		super();
	}
	@BeforeMethod

	public void setUp() {
		initializations();
		LoginPage loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		

	}
	@Test(priority=1)
	public void verifywomenLabelPage()
	{
		Assert.assertTrue(womenlinkpage.verifywomenLabel(),"Women Label is missing");
		
	}
	@Test
	public void checkCatagoriesByidcheckBox()
	{
		womenlinkpage.checkCatagoriesByid();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
