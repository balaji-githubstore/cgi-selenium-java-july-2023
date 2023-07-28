package com.cgi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {

	@DataProvider
	public Object[][] invalidLoginData() {
		Object[][] data = new Object[2][3];

		data[0][0] = "saul";
		data[0][1] = "saul123";
		data[0][2] = "Invalid credentials";

		data[1][0] = "kim";
		data[1][1] = "kim123";
		data[1][2] = "Invalid credentials";

		return data;
	}

	/**
	 * This @DataProvider can be used for taking the data from excel. 
	 * Make sure the TestMethodName is given as sheetname
	 * @param mtd
	 * @return Object[][] 
	 * @throws IOException
	 */
	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException {
		// currentTestMethodName is the sheetname
		String currentTestMethodName = mtd.getName();
		Object[][] data = ExcelUtils.getSheetIntoTwoDimensionalArray("test_data/Orange_Data.xlsx",
				currentTestMethodName);
		return data;
	}
}
