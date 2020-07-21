package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("srinidi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123654");
		driver.findElement(By.id("loginbtn")).click();
	}

}
