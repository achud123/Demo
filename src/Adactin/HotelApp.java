package Adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelApp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yugan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Robot r = new Robot();
		
		
		
		WebElement findElement = driver.findElement(By.xpath("//input[@name='username']"));
		findElement.sendKeys("Venkatesh1Rajini");
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@type='password']"));
		findElement2.sendKeys("Kobr@@chu");
		
		WebElement findElement3 = driver.findElement(By.xpath("//input[@name='login']"));
		findElement3.click();
		
		WebElement findElement4 = driver.findElement(By.xpath("//select[@name='location']"));
		findElement4.click();
		Select s=new Select(findElement4);
		s.selectByIndex(4);
		
		WebElement findElement5 = driver.findElement(By.xpath("//select[@name='hotels']"));
		findElement5.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement findElement6 = driver.findElement(By.xpath("//select[@name='room_type']"));
		findElement6.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement findElement7 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		findElement7.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		WebElement findElement8 = driver.findElement(By.xpath("//input[@name ='datepick_in']"));
		findElement8.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		findElement8.sendKeys("11/03/2023");
		
		WebElement findElement9 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		findElement9.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		findElement9.sendKeys("15/03/2023");
		Thread.sleep(3000);
		
		WebElement findElement10 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		findElement10.click();
		Select z=new Select(findElement10);
		z.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement findElement11 = driver.findElement(By.xpath("//select[@name='child_room']"));
		findElement11.click();
		Select y=new Select(findElement11);
		y.selectByIndex(3);
		
		WebElement findElement12 = driver.findElement(By.xpath("//input[@type='submit']"));
		findElement12.click();
		
		WebElement findElement13 = driver.findElement(By.xpath("//input[@type='radio']"));
		findElement13.click();
		
		WebElement findElement14 = driver.findElement(By.xpath("//input[@type='submit']"));
		findElement14.click();
		
		WebElement findElement15 = driver.findElement(By.xpath("//input[@name='first_name']"));
		findElement15.click();
		findElement15.sendKeys("KOBRA");
		
		WebElement findElement16 = driver.findElement(By.xpath("//input[@name='last_name']"));
		findElement16.click();
		findElement16.sendKeys("ACHU");
		
		WebElement findElement17 = driver.findElement(By.xpath("//textarea[@name='address']"));
		findElement17.click();
		findElement17.sendKeys("172,Periya saliya st,kathiramangalam,thiruvidaimaruthur tk,thanjavur district");
		
		WebElement findElement18 = driver.findElement(By.xpath("//input[@name='cc_num']"));
		findElement18.click();
		findElement18.sendKeys("123456789");
		
		WebElement findElement19 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		findElement19.click();
		Select x=new Select(findElement19);
		x.selectByIndex(3);
		
		WebElement findElement20 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		findElement20.click();
		Select w=new Select(findElement20);
		w.selectByIndex(7);
		
		WebElement findElement21 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		findElement21.click();
		Select v=new Select(findElement21);
		v.selectByIndex(7);
		
		WebElement findElement22 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		findElement22.click();
		findElement22.sendKeys("123");
		
		WebElement findElement23 = driver.findElement(By.xpath("//input[@name='cancel']"));
		findElement23.click();
		
		//driver.quit();
		
		
		
	}

}
