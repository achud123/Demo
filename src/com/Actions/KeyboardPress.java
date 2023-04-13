package com.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardPress {
	public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		Thread.sleep(2000);
		
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
        r.keyPress(KeyEvent.VK_CAPS_LOCK);
		
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		findElement.sendKeys("i phone 14 promax");
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@value='Go']"));
		findElement2.click();		
		//driver.quit();
		
		
		
}
}
