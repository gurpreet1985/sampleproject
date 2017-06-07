package com.selenium.FirstSeleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPageDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement returnpolicyText = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[4]/ul/li[8]/a"));
		int x = returnpolicyText.getLocation().getX();
		
		int y = returnpolicyText.getLocation().getY();
		System.out.println(" x-coordionate ="+x+"y-coordinate ="+y);
		Actions act = new Actions(driver);
		
		act.moveToElement(returnpolicyText, x, y).click().build().perform();
		
	}

}
