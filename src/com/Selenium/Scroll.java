package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	WebElement findElement = driver.findElement(By.xpath("//a[text()='Hair Steamers']"));
	//	js.executeScript("arguments[0].scrollIntoView();", findElement);
		
		
		 js.executeScript("window.scrollBy(0,5000);");
		 Thread.sleep(1000);
		 
		 driver.navigate().to("https://www.amazon.in/?");
			Thread.sleep(1000);
			 js.executeScript("window.scrollBy(0,5000);");
			 driver.navigate().back();
				Thread.sleep(1000);
				 js.executeScript("window.scrollBy(0,5000);");
				 Thread.sleep(1000);
				 js.executeScript("window.scrollBy(0,-5000);");
				 Thread.sleep(1000);
				 driver.navigate().to("https://www.phonepe.com/");
				 js.executeScript("window.scrollBy(0,5000);");
					Thread.sleep(1000);
				 driver.quit();
				
		
		
		
		
	}

}
