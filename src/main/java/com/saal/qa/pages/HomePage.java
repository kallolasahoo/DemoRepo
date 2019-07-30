package com.saal.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saal.qa.bases.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[contains(text(),'Contact us']")
	@CacheLookup
	WebElement contactUsLabel;

	
	@FindBy(xpath = "//a[contains(text(),'Women']")
	WebElement womenlink;

	@FindBy(xpath = "//a[contains(text(),'Dresses']")
	WebElement dresslink;

	@FindBy(xpath = "//a[contains(text(),'T-shirts']")
	WebElement tshirtslink;

	// initializing of page objects
	public HomePage() {
		PageFactory.initElements(driver, this);

	}
	public boolean verifycontactUsLabel() {
		return contactUsLabel.isDisplayed();
	}

	public String verifyPageTitle() {
		return driver.getTitle();
	}

	public WomenlinkPage clickonWomenlink() {
		womenlink.click();
		return new WomenlinkPage();
	}

	public DresslinkPage clickonDresslink() {
		dresslink.click();
		return new DresslinkPage();
	}
	public void clickonwomenlink()
	{
		Actions act=new Actions(driver);
		act.moveToElement(womenlink).build().perform();
		tshirtslink.click();
		
		
	}

}
