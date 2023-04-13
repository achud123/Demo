package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", 	"C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//simple alert
         WebElement findElement = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		   findElement.click();
		     Alert salert = driver.switchTo().alert();
		     salert.accept();              //ALERT
		     String text = findElement.getText();
		  System.out.println(text);
		   WebElement findElement2 =  driver.findElement(By.id("timerAlertButton"));
		    findElement2.click();
		    Thread.sleep(5000);
 		     Alert waitalert = driver.switchTo().alert();
 		    Thread.sleep(5000);
          waitalert.accept();
          
         //confirm alert
         
		    WebElement findElement3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		   findElement3.click();
		   Alert dalert = driver.switchTo().alert();
		    dalert.accept();
		               //prompt alert
		    WebElement findElement4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		    findElement4.click();
		    Alert venalert = driver.switchTo().alert();
		    venalert.sendKeys("ven");
		   
         
	
	
	
	
	}

}
