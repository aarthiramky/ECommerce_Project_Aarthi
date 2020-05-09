package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.base.LibGlobal;
import com.pages.HomePOJOClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStep extends LibGlobal{
	
	
	
	@Given("^User is on the BuyBuyBaby Page$")
	public void user_is_on_the_BuyBuyBaby_Page() throws Throwable {
		browserLaunch();
		maximize();
		loadURL("https://www.buybuybaby.com/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		maximize();
		Thread.sleep(15000);
		
		
	}

	@When("^User clicks on Sign In$")
	public void user_clicks_on_Sign_In() throws Throwable {
		System.out.println("======inside User clicks on Sign In=======");
		
		HomePOJOClass home = new HomePOJOClass();
		System.out.println("home========== "+home);
		
		for (String winhandle: driver.getWindowHandles()) {
		    driver.switchTo().window(winhandle);
		    System.out.println("Window Switch");        
		    Thread.sleep(2000);
		    home.getCloseButton().click();
		    
		}
		
		Thread.sleep(2000);
		
		System.out.println("home.getCloseButton().click();");
	    Actions a = new Actions(driver);
	    a.moveToElement(home.getSignInIcon()).perform();
	    Thread.sleep(3000);
	    home.getSignInButton().click();
	}
}
