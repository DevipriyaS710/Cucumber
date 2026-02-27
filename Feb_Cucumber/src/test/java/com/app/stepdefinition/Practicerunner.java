package com.app.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practicerunner {
	@Given("Enter the URL\\()")
	public void enter_the_url() {

	}
	@When("Enter the user name {string} And Enter the Password {string} And Click the login button")
	public void enter_the_user_name_and_enter_the_password_and_click_the_login_button(String username, String pswd) {
		System.out.println(username);
		System.out.println(pswd);
	}
	@Then("Validate the login page")
	public void validate_the_login_page() {

	}
	@Given("Enter the facebook URL\\({string})")
	public void enter_the_facebook_url(String urll) {
		System.out.println(urll);

	}
	@When("Enter the user name {string}")
	public void enter_the_user_name(String username) {
		System.out.println(username);
	   
	}
	@When("Enter the Password {string}")
	public void enter_the_password(String password) {
		System.out.println(password);
	    
	}
	@When("Click the login button")
	public void click_the_login_button() {
	   System.out.println("Clicked login btn");
	}




}
