package com.selenium.FirstSeleniumProg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gmail.com");
		
		
		
		//WebElement signInBtn = driver.findElement(By.xpath("html/body/nav/div/a[2]"));
		//signInBtn.click();
		
		WebElement emailId = driver.findElement(By.xpath(".//*[@id='identifierId']"));
		Thread.sleep(3000);
		emailId.sendKeys("gurpreetsaini3224");
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		WebElement nextBtn = driver.findElement(By.id("identifierNext"));
		Thread.sleep(3000);
		nextBtn.click();
		
		
		
		WebElement pass1 = driver.findElement(By.name("password"));
		Thread.sleep(3000);
		pass1.sendKeys("qualisraj26");
		
		WebElement nextBtn1 = driver.findElement(By.id("passwordNext"));
		nextBtn1.click();
		

	}

}