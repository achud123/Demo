package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yugan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.spotify.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl "+currentUrl);
		//navigate
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://in.search.yahoo.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.phonepe.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
