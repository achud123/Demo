package com.Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Column {
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
	        driver.manage().window().maximize();
	        
	        List<WebElement> ad = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
	        List<WebElement> ad1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
	        for (WebElement data : ad) {
	        	System.out.println(data.getText());
				
			}
	        for (WebElement data : ad1) {
	        	System.out.println(data.getText());
				
			}
		}

}
