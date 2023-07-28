package com.cgi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2DbFree {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");
		//click on phpMyAdmin »
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		//switch to 2nd tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());	
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_password")).sendKeys("admin123");
		driver.findElement(By.id("input_go")).click();
		
		String actualError=driver.findElement(By.id("pma_errors")).getText();
		System.out.println(actualError);
		
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		//get the title and print it 
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
