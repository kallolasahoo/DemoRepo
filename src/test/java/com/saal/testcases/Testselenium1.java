package com.saal.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testselenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\kallola_saal\\saal\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		
//		
//		List<WebElement>l1=driver.findElements(By.xpath("//input[@type='text']"));
//		
//		
//		l1.get(1).click();
//		l1.size();
//		
//		List<WebElement>l2=driver.findElements(By.xpath("//input[@type='radio']"));
//		l2.get(2).click();
//		
		
		
		//**********************************
//		WebElement ele=driver.findElement(By.name(""));
//		Select sel=new Select(ele);
//		
//		
//		if(sel.isMultiple())
//		{
//			System.out.println("Is Multiple...");
//			//perform opersatiom
//			driver.findElement(By.name("")).click();
//			
//			
//		}else
//		{
//			System.out.println("single select drop down ....");
//		}
//		driver.close();
//		
//*********************************************************************
		
//		int vcnt=0;
//		int invcnt=0;
//		int sing=0;
//		int mul=0;
//		//
//		
//		List<WebElement>l1=driver.findElements(By.tagName("select"));
//		
//		for(int i=0;i<l1.size();i++)
//		{
//			if(l1.get(i).isDisplayed())
//			{
//				vcnt=vcnt+1;
//			}else
//			{
//				invcnt=invcnt+1;
//			}
//			
//			Select s=new Select(l1.get(i));
//			
//			if(s.isMultiple())
//			{
//				mul=mul+1;
//			}else
//			{
//				sing=sing+1;
//			}
//			
//		}
//		//****************************************************
		
		
		
		
		
	}

}
