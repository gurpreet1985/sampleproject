package com.selenium.FirstSeleniumProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[4]/a")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		String frameText = driver.findElement(By.xpath("html/body/div/h1")).getText();
		System.out.println(frameText);
		
		List<WebElement> checkBoxList = driver.findElements(By.xpath("html/body/div/fieldset[2]/label"));
		for( WebElement checkBoxText: checkBoxList){
			System.out.println(checkBoxText.getText());
			
		}
		
		
		checkBoxList.get(0).click();
		List<WebElement> radioBoxList = driver.findElements(By.xpath("html/body/div/fieldset[1]/label"));
		System.out.println("no. of radiobuttons = "+radioBoxList.size());
		for(WebElement radioBoxText:  radioBoxList){
			System.out.println(radioBoxText.getText());
		}
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='menu-top']/li[1]/a")).click();
		driver.close();
		
		
		
		
	}

}
