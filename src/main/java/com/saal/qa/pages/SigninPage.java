package com.saal.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.saal.qa.bases.TestBase;

public class SigninPage extends TestBase {
	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signinLabel;

	@FindBy(id = "email_create")
	WebElement emailAddressTextfield;

	@FindBy(id = "SubmitCreate")
	WebElement clickOnCreateAccountBtn;

	@FindBy(id = "id_gender2")
	WebElement clickongenderBtn;

	@FindBy(id = "customer_firstname")
	WebElement enterFirstname;

	@FindBy(id = "customer_lastname")
	WebElement enterLastname;

	@FindBy(id = "passwd")
	WebElement enterPassword;

	@FindBy(id = "days")
	WebElement selectDays;

	@FindBy(id = "months")
	WebElement selectMonths;

	@FindBy(id = "years")
	WebElement selectYears;
	// YOUR 2ND ADDRESS
	@FindBy(id = "firstname")
	WebElement enterfirstName;
	@FindBy(id = "lastname")
	WebElement enterLstName;
	@FindBy(id = "company")
	WebElement entercompanyName;
	@FindBy(id = "address1")
	WebElement enteraddressOne;
	@FindBy(id = "address2")
	WebElement enterAddresstwo;

	@FindBy(id = "city")
	WebElement enterCity;

	@FindBy(id = "postcode")
	WebElement enterPostalCode;

	@FindBy(id = "other")
	WebElement enterAditionalInfo;
	@FindBy(id = "phone")
	WebElement enterPhonenumber;
	@FindBy(id = "alias")
	WebElement enterAddressForFuturereference;

	@FindBy(id = "submitAccount")
	WebElement clickonRegisterButton;

	// WebElement heading =
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));

	// assertEquals(heading.getText(), "MY ACCOUNT");
	// assertEquals(driver.findElement(By.className("account")).getText(), name
	// + " " + surname);
	// assertTrue(driver.findElement(By.className("info-account")).getText().contains("Welcome
	// to your account."));
	// assertTrue(driver.findElement(By.className("logout")).isDisplayed());
	// assertTrue(driver.getCurrentUrl().contains("controller=my-account"));

	public SigninPage() {
		PageFactory.initElements(driver, this);

	}

	public void personalInfomation(String emailId, String firstName, String lastName, String passWord,
			String companyName, String addressOne, String addressTwo, String city, String postalCode,
			String additionalInfo, String phoneNumber, String futureAddress) {
		emailAddressTextfield.sendKeys(emailId);
		clickOnCreateAccountBtn.click();
		clickongenderBtn.click();
		enterFirstname.sendKeys(firstName);
		enterLastname.sendKeys(lastName);
		enterPassword.sendKeys(passWord);
		entercompanyName.sendKeys(companyName);
		enteraddressOne.sendKeys(addressOne);
		enterAddresstwo.sendKeys(addressTwo);
		enterCity.sendKeys(city);
		enterPostalCode.sendKeys(postalCode);
		enterAditionalInfo.sendKeys(additionalInfo);
		enterPhonenumber.sendKeys(phoneNumber);
		enterAddressForFuturereference.sendKeys(futureAddress);
		clickonRegisterButton.click();

	}

	public void selectDays(String day) {
		Select sel = new Select(driver.findElement(By.id("days")));
		sel.selectByValue(day);
	}

	public void selectMonths(String month) {
		Select sel = new Select(driver.findElement(By.id("months")));
		sel.deselectByVisibleText(month);
	}

	public void selectYears(String year) {
		Select sel = new Select(driver.findElement(By.id("year")));
		sel.deselectByVisibleText(year);
	}

	public void selectState(String State) {
		Select sel = new Select(driver.findElement(By.id("id_state")));
		sel.deselectByVisibleText(State);
	}

	public void selectCountry(String country) {
		Select sel = new Select(driver.findElement(By.id("id_country")));
		sel.deselectByVisibleText(country);
	}

}