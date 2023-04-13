package com.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	     r.keyPress(KeyEvent.VK_PAGE_DOWN);
	     
	     r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	     
	     Thread.sleep(2000);
	     
	     r.keyPress(KeyEvent.VK_PAGE_UP);
	     
	     r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

