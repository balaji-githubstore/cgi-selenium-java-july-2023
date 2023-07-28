package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;
import com.cgi.utilities.DataUtils;

/**
 * Test Class for testing the login functionalities
 */
public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "commonDataProvider", dataProviderClass = DataUtils.class, groups = { "smoke", "login" })
	public void validLoginTest(String username, String password, String expectedValue) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		String actualValue = driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test(dataProvider = "commonDataProvider", dataProviderClass = DataUtils.class, groups = { "login" })
	public void invalidLoginTest(String username, String password, String expectedError) {

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		Assert.assertEquals(loginPage.getInvalidErrorMessage(), expectedError);
	}

}
