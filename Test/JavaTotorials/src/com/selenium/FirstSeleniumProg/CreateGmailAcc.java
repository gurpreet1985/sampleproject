package com.selenium.FirstSeleniumProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateGmailAcc {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Gmail";
		
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Test pass");
		}
		else{
			System.out.println("Test fail");
			
		}
		driver.close();
		
		

	}

}
