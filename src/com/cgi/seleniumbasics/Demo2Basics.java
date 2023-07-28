package com.cgi.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Basics {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

}
