package com.stepdefinition;

import com.base.LibGlobal;
import com.pages.SignInPOJOClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInPageStep extends LibGlobal{
	
	SignInPOJOClass signIn = new SignInPOJOClass();
	
	@When("^User enters email and password$")
	public void user_enters_email_and_password() throws Throwable {
	    signIn.getEmail().sendKeys("aarthiramky@yahoo.com");
	    signIn.getPassword().sendKeys("Test@1234");
	    Thread.sleep(2500);
	    
	}

	@When("^User clicks on SignIn button$")
	public void user_clicks_on_SignIn_button() throws Throwable {
		signIn.getLoginButton().click();
	}

	@Then("^User navigates to the welcome page$")
	public void user_navigates_to_the_welcome_page() throws Throwable {
	   System.out.println("User is on Welcome Page");
	}

}
