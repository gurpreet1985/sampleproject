package com.selenium.explicitwaitconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("cricket");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sbse2']/div[2]")));
		driver.findElement(By.xpath(".//*[@id='sbse2']/div[2]")).click();
	}

}
