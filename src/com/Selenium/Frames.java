package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yugan\\eclipse-workspace\\SeleniumAutomation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("꧁KOBRA༆࿐ACHU꧂");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		WebElement nestedframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		 nestedframe.click();
		
		WebElement findElement3 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(findElement3);
		
		WebElement nestedframe1  = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(nestedframe1);
		
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("꧁KOBRA༆࿐ACHU꧂");
		
		
		
		
		
	}

}
