package com.selenium.FirstSeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
			driver.get("http://www.amazon.com");
			driver.manage().window().maximize();
			
			WebElement signInBtn = driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"));
					signInBtn.click();
					
				
					//WebElement emailId = driver.findElement(By.xpath(".//*[@id='ap_email']"));
					//emailId.sendKeys("gurpreetsaini3224@gmail.com");
					
					//WebElement passWord = driver.findElement(By.xpath(".//*[@id='ap_password']"));
					//passWord.sendKeys("qualis26");
					
					//WebElement signINBtn = driver.findElement(By.xpath(".//*[@id='signInSubmit']"));
					//signINBtn.click();
					
		

	}

}
