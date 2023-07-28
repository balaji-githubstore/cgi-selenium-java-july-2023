package com.cgi.base;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;

public class AutomationWrapper {
	
	public WebDriver driver;
//	public int num=10;

	@After
	public void endScenario()
	{
		driver.quit();
	}
	
}
