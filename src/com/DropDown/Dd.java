package com.DropDown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yugan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement drop = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        
        Select s=new Select(drop);
        Robot r = new Robot();
           //Index
        s.selectByIndex(4);
        Thread.sleep(3000);
      s.selectByValue("search-alias=amazon-devices");
      Thread.sleep(3000);
        s.selectByVisibleText("Electronics");
        
        WebElement findElement1 = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
        findElement1.click();
        
        WebElement findElement2 = driver.findElement(By.xpath("//i[@class='a-icon a-icon-radio']"));
        findElement2.click();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        driver.quit();
        
        
        
        
        
        
        
        
        
	}
	

}
