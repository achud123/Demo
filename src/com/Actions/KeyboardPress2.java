package com.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardPress2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Actions ac = new Actions(driver);
        Robot r = new Robot();
        
        WebElement findElement = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
        ac.contextClick(findElement).build().perform();
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        
        WebElement findElement3= driver.findElement(By.xpath("//a[text()='Best Sellers']"));
        ac.contextClick(findElement3).build().perform();
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        
        WebElement findElement4= driver.findElement(By.xpath("//a[text()='Mobiles']"));
        ac.contextClick(findElement4).build().perform();
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        
        WebElement findElement5= driver.findElement(By.xpath("//a[text()='Customer Service']"));
        ac.contextClick(findElement5).build().perform();
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        
        
        
                       //Windows Handling
        
                      //for get window Size
        int size = driver.getWindowHandles().size();
        System.out.println("WindowSize:"+size);
        
                   //Parent window id
        String pw = driver.getWindowHandle();
        String title2 = driver.switchTo().window(pw).getTitle();
        System.out.println(title2);
        System.out.println("**************************************************************");
        
                   //Get all window title
        Set<String> awt = driver.getWindowHandles();
        for (String cp: awt) {
        	String title = driver.switchTo().window(cp).getTitle();
        	System.out.println(title);
        	Thread.sleep(3000);
        }
        	//Particular window
        	String actual="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        	for (String cp1: awt) {
        		if (driver.switchTo().window(cp1).getTitle().equals(actual)) {
        		break;
					
			}
        	}
        		for (String cp2 : awt) {
        			if (!cp2.equals(pw)) {
        				driver.switchTo().window(cp2);
        				driver.close();
        				
        				
				}
					
				} 
				
			
			
		}
	}
        
        
        
        
	
	


