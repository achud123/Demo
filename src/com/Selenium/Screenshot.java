package com.Selenium;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {


	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
        File from  = ts.getScreenshotAs(OutputType.FILE);
        File to = new File ("C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\Screenshot\\venkat.png");
        FileUtils.copyFile(from,to);
        
        
	
 
		
	}

}
