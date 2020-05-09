package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class HomePOJOClass extends LibGlobal {

	public HomePOJOClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "accountLink")
	private WebElement signInIcon;

	@FindBy(className = "babyPrimaryWrapper")
	private WebElement signInButton;
	
	@FindBy(id="closeButton")
	private WebElement closeButton;
	
	@FindBy(xpath="//button[@onclick='javascript:contShop();']")
	private WebElement continueShopping;
	
	
	

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getSignInIcon() {
		return signInIcon;
	}

}
