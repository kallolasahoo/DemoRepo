package com.saal.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saal.qa.bases.TestBase;
import com.saal.qa.pages.HomePage;
import com.saal.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public HomePageTest() {
		super();
	}
    //Test cases should be separated  -- independent with each Other
	
	//Before each test cases -- lunch the browser and login
	//@Test --  execute test cases
	//After each test cases -- close the browser
	
	@BeforeMethod

	public void setUp() {
		initializations();
		LoginPage loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 2)
	public void verifyContactUsLabelTest() {
		Assert.assertTrue(homepage.verifycontactUsLabel());
	}

	@Test(priority = 1)

	public void verifyHomePageTitleTest() {
		String hoempageTitle = homepage.verifyPageTitle();
		Assert.assertEquals(hoempageTitle, "Dresses - My Store", "Home page title not matched");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
