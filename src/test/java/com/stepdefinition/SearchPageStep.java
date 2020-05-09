package com.stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.pages.SearchPOJOClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPageStep {
	
	SearchPOJOClass search = new SearchPOJOClass();
	
	@Given("^User is on the welcome page$")
	public void user_is_on_the_welcome_page() throws Throwable {
	    System.out.println("User is on Welcome Page in SearchPageStep");
	}

	@When("^User types stroller in Search box$")
	public void user_types_stroller_in_Search_box() throws Throwable {
		search.getSearchbox().sendKeys("Stroller");
	}
	
	@When("^User presses enter$")
	public void user_presses_enter() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("^User navigates to Search page$")
	public void user_navigates_to_Search_page() throws Throwable {
	  System.out.println("Search result is displayed");
	}

	@Then("^User clicks on Umbrella Stroller$")
	public void user_clicks_on_Umbrella_Stroller() throws Throwable {
	    search.getUmbrellaStrollerCategory().click();
	}
	
	@Then("^User selects an item and then clicks$")
	public void user_selects_an_item_and_then_clicks() throws Throwable {
		search.getItem().click();
	}

	@Then("^User selects color and clicks on Ship It button$")
	public void user_selects_color_and_clicks_on_Ship_It_button() throws Throwable {
	    search.getColor().click();
	    search.getShipIt().click();
	}
	
	@Then("^User clicks on View Cart and Checkout Button$")
	public void user_clicks_on_View_Cart_and_Checkout_Button() throws Throwable {
	    search.getViewCartAndCheckOut().click();
	}

	@Then("^User navigates to Order Summary page$")
	public void user_navigates_to_Order_Summary_page() throws Throwable {
	    System.out.println("User is on Order Summary Page");
	}


}
