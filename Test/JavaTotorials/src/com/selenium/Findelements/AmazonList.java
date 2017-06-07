package com.selenium.Findelements;

import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AmazonList {
	
	public static void main(String[] args)  {
		
		WebDriver driver = new FirefoxDriver();
		
		
		
		
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		System.out.println(links.size());
		
		for (WebElement linktext: links) {
			System.out.println(linktext.getText());
		}
			//Thread.sleep(3000);
			
			

		driver.close();
		
		
		
		
	}
	
	

}
