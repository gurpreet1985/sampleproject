package com.selenium.FirstSeleniumProg;



//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpSelenium {
	 
	
	

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver = new FirefoxDriver();  
		driver.get("http://www.facebook.com");
		
		
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("u_0_1"));
		firstName.sendKeys("Gurpreet");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Kaur");
		
		WebElement mobileNumber = driver.findElement(By.id("u_0_6"));
		mobileNumber.sendKeys("7148127781");
		
		WebElement password = driver.findElement(By.xpath(".//*[@id='u_0_d']"));
		password.sendKeys("Harman@123");
		
		WebElement monthDropDown = driver.findElement(By.xpath(".//*[@id='month']"));
		Select select = new Select(monthDropDown);
		select.selectByValue("2");
		
		WebElement dayDropDown = driver.findElement(By.xpath(".//*[@id='day']"));
		dayDropDown.sendKeys("10");
		
		WebElement yearDropDown = driver.findElement(By.xpath(".//*[@id='year']"));
        yearDropDown.sendKeys("2013");
		
       	
		WebElement radiobutton = driver.findElement(By.xpath(".//*[@id='u_0_g']"));
		radiobutton.click();
		
		WebElement signUpBtn = driver.findElement(By.xpath(".//*[@id='u_0_l']"));
		signUpBtn.click();

		Thread.sleep(4000);
		
		
		
		WebElement errMsg = driver.findElement(By.xpath(".//*[@id='reg_error_inner']"));
		String actualText = errMsg.getText();
		
		String expectedText = "It looks like you entered the wrong info. Please be sure to use your real birthday.";
		
		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("Test Pass");
		}
			
			else{
				System.out.println("Test Fail");
			}
		driver.close();
		}
		
		
	
	}

