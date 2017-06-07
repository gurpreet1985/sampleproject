package com.selenium.FirstSeleniumProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverExp {

	public static void main(String[] args) {
 
        System.setProperty("webdriver.chrome.driver", "E:\\JavaExamplesSourceCode\\JavaTotorials\\src\\ChromeDriver\\chromedriver.exe");
	  
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		

	}

}
