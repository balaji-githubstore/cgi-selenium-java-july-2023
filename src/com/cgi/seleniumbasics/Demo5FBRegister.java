package com.cgi.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5FBRegister {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for the page load to complete 
		
		driver.findElement(By.linkText("Create new account")).click(); //check for presence of element in 0.5s
		
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
	}

}
