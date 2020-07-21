package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
		Thread.sleep(4000);
		List<WebElement> alliphone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		alliphone.get(0).click();
		alliphone.get(1).click();
		alliphone.get(2).click();
		Set<String> allwin = driver.getWindowHandles();
		List<String> li=new ArrayList<>();
		li.addAll(allwin);
		String pw = li.get(2);
		driver.switchTo().window(pw);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@class='imgSwatch'])[3]")).click();
		
		
		

		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("fgfgfbvbvb");
		driver.findElement(By.id("pass")).sendKeys("7895632");
		driver.findElement(By.id("loginbtn")).click();

	}

}
