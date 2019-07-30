package com.saal.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saal.qa.bases.TestBase;

public class CreateAccountPage extends TestBase {
	@FindBy(xpath = "//a[contains(text(),'Contact us']")
	WebElement contactUsLabel;

	
	@FindBy(xpath = "//a[contains(text(),'Women']")
	WebElement womenlink;

	@FindBy(xpath = "//a[contains(text(),'Dresses']")
	WebElement dresslink;

	@FindBy(xpath = "//a[contains(text(),'T-shirts']")
	WebElement tshirtslink;

	// initializing of page objects
	public CreateAccountPage() {
		PageFactory.initElements(driver, this);

	}

}
