package com.selenium.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationExp {

	public WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.ebay.com");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void verifyHomePage(){
		
		String actualTitle = driver.getTitle();
		String expectedTitle =  "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	@Test
	public void register(){
		driver.findElement(By.xpath(".//*[@id='gh-ug-flex']/a")).click();
		String actualRegTitle = driver.getTitle();
		String expectedRegTitle = "Sign in or Register | eBay";
		Assert.assertEquals(actualRegTitle, expectedRegTitle);
		}
	@AfterMethod
	public void homePage(){
		driver.navigate().back();
		String homePageTitle = driver.getTitle();
		System.out.println(homePageTitle);
	}
	@AfterTest
	public void terminateBrowser(){
		driver.close();
	} 

}

