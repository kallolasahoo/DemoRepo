package com.saal.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saal.qa.bases.TestBase;
import com.saal.qa.pages.HomePage;
import com.saal.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();

	}

	@BeforeMethod

	public void setUp() {
		initializations();
		LoginPage loginpage = new LoginPage();

	}

	@Test(priority = 1)
	public void loginpageTitleTest() {
		String title = loginpage.ValidateloginpageTitle();
		Assert.assertEquals(title, "Login - My Store");
	}

	@Test(priority = 2)
	public void logoImageTest() {
		boolean flag = loginpage.validateImage();
		Assert.assertTrue(flag);

	}

	@Test(priority = 3)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
