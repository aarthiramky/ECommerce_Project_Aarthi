package com.stepdefinition;

import com.pages.OrderSummaryPOJOClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderSummaryStep {
	
	OrderSummaryPOJOClass order = new OrderSummaryPOJOClass();

	@Given("^User is on the Order Summary Page$")
	public void user_is_on_the_Order_Summary_Page() throws Throwable {
		System.out.println("User is on Order Summary Page in OrderSummaryStep");
	}
	
	@When("^User clicks on checkout button$")
	public void user_clicks_on_checkout_button() throws Throwable {
		order.getCheckOut().click();
	}
	
	@Then("^User navigates to Checkout$")
	public void user_navigates_to_Checkout() throws Throwable {
	    System.out.println("User navigates to Checkout");
	}

}
