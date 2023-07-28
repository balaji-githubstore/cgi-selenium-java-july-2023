package com.cgi.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//https://collabedit.com/pperw
public class Demo4DBFree {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.db4free.net/phpMyAdmin/");

		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_password")).sendKeys("admin123");
		driver.findElement(By.id("input_go")).click();
		
		//get the error message displayed and print it
		String actualError=driver.findElement(By.id("pma_errors")).getText();
		System.out.println(actualError);
	}

}
