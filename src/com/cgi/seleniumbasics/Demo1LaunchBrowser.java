package com.cgi.seleniumbasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver obj1=new EdgeDriver(); //runtime polymorphism
		
//		ChromeDriver obj2=new ChromeDriver();
//		EdgeDriver obj3=new EdgeDriver();
		
//		obj1=new EdgeDriver();
		
//		obj3.get("https://facebook.com");
		obj1.get("https://github.com/");
//		obj2.get("https://google.com/");
		

	}

}
