package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SignInPOJOClass extends LibGlobal{

	public SignInPOJOClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signin-email")
	private WebElement email;
	
	@FindBy(id="signin-password")
	private WebElement password;
	
	@FindBy(id="signin-submit")
	private WebElement loginButton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	

	
}
