package com.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardClass1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
				
				Robot r = new Robot();
				
				r.keyPress(KeyEvent.VK_CONTROL);
				
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_2);
				
	}

}
