package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddDependency extends CommonMethods{
	
	
	@And ("Admin navigates to Personal Details Page")
	public void admin_navigates_to_personal_details_page() {
		click(dashboard.PIM);
		click(dashboard.employeeListLink);
		sendText(employeeList.searchBox, "1007");
		
		click(employeeList.searchIcon);
		click(employeeList.employeeIMG);
	}
	@When("User clicks more")
	public void user_clicks_more() {
	    
		
		click(personalDetails.more);
		
		
		wait(3);
		
	}
	@When("User Selects Dependents from drop down options")
	public void user_selects_dependents_from_drop_down_options() {
		click(personalDetails.dependents);
	   
	}
	@Then("user should see Assigned Dependents page")
	public void user_should_see_assigned_dependents_page() {
		
		String expected= "Assigned Dependents";
		String actual= addDependents.assignedDependents.getText();
		
		Assert.assertEquals("The name does not match",expected, actual);
	      System.out.println("actual name is" + actual);
	}
	
	@Given("Navigate ADD DEPENDENT Frame")
	public void navigate_add_dependent_frame() {
	   
	}
	@When("user enter name {string}")
	public void user_enter_name(String string) {
	    
	}
	@When("user selects {string}")
	public void user_selects(String string) {
	    
	}
	@When("user selects {string} from dropdown")
	public void user_selects_from_dropdown(String string) {
	    
	}
	@When("user clicks save button")
	public void user_clicks_save_button() {
	    
	}
	@Then("I am able to see {string} message")
	public void i_am_able_to_see_message(String string) {
	    
	}


	

}
