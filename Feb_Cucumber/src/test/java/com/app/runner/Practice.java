package com.app.runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practice {

	@Given("Login to the URL {string}")
	public void login_to_the_url(String URL) {
		System.out.println(URL);
	  
	}
	@When("Enter the username {string}")
	public void enter_the_username(String username) {
		System.out.println(username);
	    
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pswd) {
		System.out.println(pswd);
	   
	}
	@When("Click the login button")
	public void click_the_login_button() {
	    
	}
	@Then("Validate the Home page")
	public void validate_the_home_page() {
	   
	}


}
