package com.cgi.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6Salesforce {

	public static void main(String[] args) {
		
//		https://www.salesforce.com/in/form/signup/freetrial-sales/
//
//			1. Enter firstname as john
//			2. Enter lastname as wick
//			3. Select job title as IT Manager 
//			4. Select employee count - 101-200 employees
//			5. Select Country as united kingdom 
//			6. Check the term and condition
//			7. Click on start my trial

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("john");
		driver.findElement(By.xpath("//input[contains(@id,'UserLast')]")).sendKeys("wick");
		
		Select selectJobTitle=new Select(driver.findElement(By.name("UserTitle")));
		selectJobTitle.selectByVisibleText("IT Manager");
		
		Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByVisibleText("United Kingdom");
		
		//Select employee count - 101-200 employees
		Select selectEmpCount=new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmpCount.selectByValue("150");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		//click on start my trial
		driver.findElement(By.name("start my free trial")).click();
	}

}
