package com.cgi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.cgi.javaconcepts.Employee;

public class Demo6Citi {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
		//select credit card 
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		
		driver.findElement(By.cssSelector("#citiCard1")).sendKeys("7888");
		driver.findElement(By.cssSelector("input[name='citiCard2']")).sendKeys("9888");
		//enter cvv as 788
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("787");
		
		//enter dob as 20/12/2000
		//approach 1 - not working
//		driver.findElement(By.id("bill-date-long")).sendKeys("20/12/2000");
		
		//approach 2 - working
//		driver.findElement(By.id("bill-date-long")).click();
//		
//		Select selectYear=new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
//		selectYear.selectByVisibleText("2000");
//		
//		Select selectMonth=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
//		selectMonth.selectByVisibleText("Dec");
//		
//		driver.findElement(By.linkText("20")).click();
//		
		
		
		//approach 3 - javascript
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("document.querySelector('#bill-date-long').value='20/12/2000'");
		
		
		//aproach 3 - javascript & WebElement
		
		WebElement ele1= driver.findElement(By.xpath("//input[@id='bill-date-long']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("document.querySelector('#bill-date-long').scrollIntoView()");
		
		js.executeScript("arguments[0].value='20/12/2000'",ele1);
	
		
		//page scroll
		js.executeScript("window.scrollBy(0,100)");
	}
}





