package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss{

                               //click
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zee5.com/");
		
		Actions ac = new Actions(driver);
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Sports']"));
		ac.click(findElement).build().perform();
		
		
		
	
		
		
		
		
		
		
	}

}
