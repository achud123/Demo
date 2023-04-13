package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F%3F");
		WebElement findElement = driver.findElement(By.id("login-username"));
		findElement.sendKeys("Venkatesh");
		WebElement findElement2 = driver.findElement(By.id("login-password"));
		findElement2.sendKeys("123456");
		WebElement findElement3 = driver.findElement(By.id("login-button"));
		findElement3.click();
		
	}

}
