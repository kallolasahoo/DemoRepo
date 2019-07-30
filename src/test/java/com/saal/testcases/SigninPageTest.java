package com.saal.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.saal.qa.bases.TestBase;
import com.saal.qa.pages.HomePage;
import com.saal.qa.pages.LoginPage;
import com.saal.qa.pages.SigninPage;
import com.saal.qa.utils.TestUtil;

public class SigninPageTest extends TestBase {

	SigninPage sininpageTest;
	TestUtil   testutil;

	String sheetName="SignInPage";
	public SigninPageTest() {
		super();

	}

	@BeforeMethod

	public void setUp() {
		initializations();
		SigninPage sininpageTest = new SigninPage();

	}
	@DataProvider
	public Object[][] getsaalTestData()
	{
		Object data[][]=testutil.getTestData(sheetName);
		return data;
	}

	@Test(priority = 1,dataProvider="getsaalTestData")
	public void signInpageRegistrationTest() {
		sininpageTest.personalInfomation("emailId"
, "firstName", "lastName", "passWord","companyName","addressOne","addressTwo","city","postalCode","additionalInfo","phoneNumber","futureAddress");
		sininpageTest.selectDays("");
		sininpageTest.selectMonths("");
		sininpageTest.selectYears("");
		sininpageTest.selectState("");
		sininpageTest.selectCountry("");
		

		// Assert.assertEquals(title, "Login - My Store");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
