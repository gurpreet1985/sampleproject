package com.selenium.windowpopup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement searchwindow = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		searchwindow.sendKeys("Fossil watch");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		List<WebElement> productlist = driver.findElements(By.xpath("//*[starts-with(@id,'result_')]/div/div[3]/div[1]/a/h2"));
		System.out.println(productlist.size());
		for(WebElement productname: productlist){
			System.out.println(productname.getText());
			
		}
		productlist.get(0).click();
		String winTitle = driver.getTitle();
		System.out.println(winTitle);
		String price = driver.findElement(By.xpath(".//*[@id='priceblock_ourprice']")).getText();
		 System.out.println("price of product =" +price);
		 
		 driver.close();
		
		
		
	}

}
