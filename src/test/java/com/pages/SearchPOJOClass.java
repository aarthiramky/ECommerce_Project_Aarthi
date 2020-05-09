package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchPOJOClass extends LibGlobal{
	
	public SearchPOJOClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="searchInput")
	private WebElement searchbox;
	
	@FindBy(xpath = "//p[text()='Umbrella Strollers']")
	private WebElement umbrellaStrollerCategory;
	
	@FindBy(xpath = "//a[contains(text(),'Kolcraft')]")
	private WebElement item;
	
	@FindBy(xpath = "//span[@class='MultiSKU_3Vhj16']")
	private WebElement color;
	
	@FindBy(xpath = "//button[text()='Ship It']")
	private WebElement ShipIt;
	
	@FindBy(xpath = "//a[text()='View Cart & Checkout']")
	private WebElement viewCartAndCheckOut;
	
	
	
	public WebElement getViewCartAndCheckOut() {
		return viewCartAndCheckOut;
	}



	public WebElement getShipIt() {
		return ShipIt;
	}



	public WebElement getColor() {
		return color;
	}



	public WebElement getItem() {
		return item;
	}



	public WebElement getUmbrellaStrollerCategory() {
		return umbrellaStrollerCategory;
	}



	public WebElement getSearchbox() {
		return searchbox;
	}
	
}
