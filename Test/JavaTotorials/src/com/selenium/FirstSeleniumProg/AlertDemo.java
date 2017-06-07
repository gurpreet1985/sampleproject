package com.selenium.FirstSeleniumProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath(".//*[@id='content']/p[11]/button")).click();
		
		Alert popUp = driver.switchTo().alert();
		popUp.sendKeys("No");
		popUp.accept();
		
		driver.close();	
		

	}

}
