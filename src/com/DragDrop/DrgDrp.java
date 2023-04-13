package com.DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrgDrp {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yugan\\eclipse-workspace\\com.Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		
		Actions ac = new Actions(driver);
		
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//div[text()='Drag me']"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		            //Drag And Drop
		//ac.dragAndDrop(drag,drop).build().perform();
		         //   Move To Element
		ac.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		
		
	}

}
