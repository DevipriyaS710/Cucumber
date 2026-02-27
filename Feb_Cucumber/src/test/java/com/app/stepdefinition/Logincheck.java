package com.app.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logincheck {
	@Given("Login to the URL {string}")
	public void login_to_the_url(String url) {
		System.out.println(url);
	    
	}
	@When("Enter the username {string}")
	public void enter_the_username(String name) {
		System.out.println(name);
	    
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pswd) {
		System.out.println(pswd);
	   
	}
	@Then("Validate the Home page")
	public void validate_the_home_page() {
	    
	}

	@When("Enter the pswdd {string}")
	public void enter_the_pswdd(String pswdd) {
		System.out.println(pswdd);
	}


}
