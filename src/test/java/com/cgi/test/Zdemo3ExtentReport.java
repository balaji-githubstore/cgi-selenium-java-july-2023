package com.cgi.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Zdemo3ExtentReport {

	public static void main(String[] args) {
		
		//run only once before starting the test execution //
//		@BeforeSuite
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		//before the test start - @BeforeMethod
		ExtentTest test= extent.createTest("MyFirstTest");
		
		//@Test
		
		//@AfterMethod
		test.log(Status.FAIL, "This is a logging event for MyFirstTest, and it passed!");
		
		//@AfterSuite
		//run at the end of all the test execution
		extent.flush();

		

	}

}
