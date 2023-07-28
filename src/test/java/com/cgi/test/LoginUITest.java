package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.cgi.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {
	
	@Test(groups = {"UI","smoke"})
	public void TitleTest() {
		String actualTitle = driver.getTitle();
		test.log(Status.INFO, "Actual title is "+actualTitle);
		Assert.assertEquals(actualTitle, "OrangeHRM");
		test.log(Status.INFO, "Assertion Successful");
	}

	@Test(groups = {"UI"})
	public void headerTest() {
		String actualHeader = driver.findElement(By.tagName("h5")).getText();
		Assert.assertEquals(actualHeader, "Login");
	}
}
