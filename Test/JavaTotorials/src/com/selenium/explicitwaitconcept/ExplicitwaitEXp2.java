package com.selenium.explicitwaitconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitEXp2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='start']/button")).click();
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='finish']/h4"));
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));

		String text = driver.findElement(By.xpath(".//*[@id='finish']/h4")).getText();

		if (text.equals("Hello World!")) {
			
			System.out.println("Test pass");
		}
		else{
			System.out.println("Test fail");
			
		}

	}

}
