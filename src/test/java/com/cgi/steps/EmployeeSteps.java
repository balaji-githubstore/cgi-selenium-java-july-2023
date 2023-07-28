package com.cgi.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.cgi.base.AutomationWrapper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {

	private AutomationWrapper wrapper;

	public EmployeeSteps(AutomationWrapper wrapper) {
		this.wrapper = wrapper;
//		System.out.println(wrapper.num);
	}

	@When("I click on PIM menu")
	public void i_click_on_pim_menu() {
		this.wrapper.driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
	}

	@When("I click on Add Employee menu")
	public void i_click_on_add_employee_menu() {
		wrapper.driver.findElement(By.linkText("Add Employee")).click();
	}

	@When("I fill the new employee form")
	public void i_fill_the_new_employee_form(DataTable dataTable) {
		System.out.println(dataTable);

		List<Map<String, String>> list = dataTable.asMaps();

		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(0).get("firstname"));
		System.out.println(list.get(0).get("middlename"));
		System.out.println(list.get(0).get("lastname"));

		wrapper.driver.findElement(By.name("firstName")).sendKeys(list.get(0).get("firstname"));
		wrapper.driver.findElement(By.name("middleName")).sendKeys(list.get(0).get("middlename"));
		wrapper.driver.findElement(By.name("lastName")).sendKeys(list.get(0).get("lastname"));
	}

	@When("I click on save")
	public void i_click_on_save() {

	}

	@Then("I should see the profile name as {string}")
	public void i_should_see_the_profile_name_as(String string) {

	}

	@Then("I should verify the textbox firstname is {string}")
	public void i_should_verify_the_textbox_firstname_is(String string) {

	}

}
