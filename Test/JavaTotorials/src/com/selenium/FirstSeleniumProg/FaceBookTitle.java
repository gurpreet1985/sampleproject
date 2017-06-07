package com.selenium.FirstSeleniumProg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookTitle {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Facebook - Log In or Sign Up";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Pass");
			
		}
		else{
			System.out.println("Test Fail");
		}
		
		driver.close();
	}

}
