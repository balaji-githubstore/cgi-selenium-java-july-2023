package com.cgi.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3FBLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("demo12345@gmail.com");
		
//		By loc= By.id("email");
//		WebElement ele= driver.findElement(loc);
//		ele.sendKeys("demo12345@gmail.com");
		
//		WebElement ele= driver.findElement(By.id("email"));
//		ele.sendKeys("demo12345@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("demo12345@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		driver.findElement(By.name("login")).click();
		
		
	}

}
