package com.selenium.FirstSeleniumProg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement electronicTab = driver.findElement(By.xpath(".//*[@id='w0-container']/li[6]/a"));
		
		Actions act = new Actions(driver);
		act.moveToElement(electronicTab).build().perform();
		
		List<WebElement> mylist = driver.findElements(By.xpath(".//*[@id='w0-container']/li[6]/div[2]/div[1]/div[2]/ul/li/a"));
		
		mylist.size();
		System.out.println("no. of elements in list = "+mylist.size());
	
		for(WebElement listtext: mylist){
			
			System.out.println(listtext.getAttribute("innerText"));
			//String link = listtext.getAttribute("innerText");
			//System.out.println(listtext.getTagName()+"="+link);
		}
		driver.close();
	}

}
