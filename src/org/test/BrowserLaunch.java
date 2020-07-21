package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://purple.com/");
		
		WebElement bed = driver.findElement(By.xpath("(//a[@class='component-btn green m-b-4'])[2]"));
		bed.click();
		Thread.sleep(3000);
		
		WebElement bed1 = driver.findElement(By.xpath("(//a[@class='component-btn green'])[3]"));
		bed1.click();
		Thread.sleep(3000);
		
		WebElement bed2 = driver.findElement(By.xpath("//span[text()='Add 1 Item To Cart']"));
		bed2.click();
		Thread.sleep(3000);
		
		
		
		
	
		
		
	}
	}


