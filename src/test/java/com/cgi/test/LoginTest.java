package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.utilities.DataUtils;

/**
 * Test Class for testing the login functionalities
 */
public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class,groups = {"smoke","login"})
	public void validLoginTest(String username,String password,String expectedValue) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String actualValue = driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class,groups = {"login"})
	public void invalidLoginTest(String username, String password, String expectedError) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String actualError = driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
		Assert.assertEquals(actualError, expectedError);
	}
	
}
