package com.cgi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cgi.base.AutomationWrapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private AutomationWrapper wrapper;
	
	public LoginSteps(AutomationWrapper wrapper)
	{
		this.wrapper=wrapper;
//		System.out.println(wrapper.num);
//		wrapper.num=78000;
	}


	@Given("I have browser with OrangeHRM application")
	public void i_have_browser_with_orange_hrm_application() {
		wrapper.driver = new ChromeDriver();
		this.wrapper.driver.manage().window().maximize();
		wrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wrapper.driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		wrapper.driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		wrapper.driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		wrapper.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("I should get access to the dashboard with {string} section")
	public void i_should_get_access_to_the_dashboard_with_section(String expectedValue) {
		String actualValue = wrapper.driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Then("I should not get access to portal with error as {string}")
	public void i_should_not_get_access_to_portal_with_error_as(String expectedError) {
		String actualError = wrapper.driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
		Assert.assertEquals(actualError, expectedError);
	}
}
