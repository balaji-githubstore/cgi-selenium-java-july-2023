package com.cgi.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * switch to frame using index
 */
public class Demo3Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("john123");
		//click on continue
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//come to the main html
		driver.switchTo().defaultContent();
	}

}
