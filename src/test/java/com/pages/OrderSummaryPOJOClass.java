package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class OrderSummaryPOJOClass extends LibGlobal{
	
	public OrderSummaryPOJOClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[text()='Checkout'])[1]")
	private WebElement checkOut;

	public WebElement getCheckOut() {
		return checkOut;
	}
	
	
}

