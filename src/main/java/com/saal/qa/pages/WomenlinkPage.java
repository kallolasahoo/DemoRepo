package com.saal.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saal.qa.bases.TestBase;

public class WomenlinkPage extends TestBase {
	@FindBy(xpath = "//a[contains(text(),'Women']")
	WebElement womensLabel;

	// initializing of page objects
	public WomenlinkPage() {
		PageFactory.initElements(driver, this);

	}
public boolean verifywomenLabel()
{
	return womensLabel.isDisplayed();
}
public void checkCatagoriesByid()
{
	driver.findElement(By.id("layered_category_4")).click();
}
}
