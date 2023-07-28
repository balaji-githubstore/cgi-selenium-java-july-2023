package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Not part of the framework - will be deleted
 */
public class ZDemo1Test {

	@DataProvider
	public Object[][] validData() {
		Object[][] data = new Object[3][2];
		// i-->number of testcase
		// j-->number of parameters

		data[0][0] = "john";
		data[0][1] = "john122";

		data[1][0] = "peter";
		data[1][1] = "peter123";

		data[2][0] = "henry";
		data[2][1] = "henry122";

		return data;
	}

	@Test(dataProvider = "validData")
	public void validLogin(String username, String password) {
		System.out.println("login" + username + password);
	}

}
