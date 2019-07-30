package com.saal.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saal.qa.bases.TestBase;

public class LoginPage extends TestBase {

	// PageFactory =OR;

	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInLink;
	
	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "passwd")
	WebElement password;

	@FindBy(id = "SubmitLogin")
	WebElement submitloginBtn;

	@FindBy(xpath = "//*[@id='header_logo']/a/img")
	WebElement logoimg;

	// initializing of page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// Actions
	public String ValidateloginpageTitle() {
		return driver.getTitle();
	}

	public boolean validateImage() {
		return logoimg.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		signInLink.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitloginBtn.click();
		return new HomePage();

	}
}
