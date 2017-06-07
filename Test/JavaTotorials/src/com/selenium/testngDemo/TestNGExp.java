package com.selenium.testngDemo;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExp {
	
	
	@Test
	public void test1(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle =  "Electronics, Cars, Collectibles, Coupons and More | eBay";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
		
	}
	@Test
	public void test2(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
