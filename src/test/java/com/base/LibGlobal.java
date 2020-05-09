package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	
	public static void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseWorkspace\\ReusableSeleniumMethods\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		System.out.println("Browser Launched Successfully");
	}
	
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void currentURL()
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void getTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	public static void loadURL(String url)
	{
		driver.get(url);
	}
	
	public static void type(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
	
	public static void clear(WebElement element)
	{
		element.clear();
	}
	
	public static void quitBrowser()
	{
		driver.close();
	}
	
	public static void selectByVisibleText(WebElement element,String text)
	{
		new Select(element).selectByVisibleText(text);
	}
	
	public static void selectByValue(WebElement element,String value)
	{
		new Select(element).selectByValue(value);;
	}
	
	public static void selectByIndex(WebElement element,int index)
	{
		new Select(element).selectByIndex(index);
	}
	
	public static void deSelectByVisibleText(WebElement element,String text)
	{
		new Select(element).deselectByVisibleText(text);
	}
	
	public static void deSelectByValue(WebElement element,String value)
	{
		new Select(element).deselectByValue(value);
	}
	
	public static void deSelectByIndex(WebElement element,int index)
	{
		new Select(element).deselectByIndex(index);
	}
	
	public static List<WebElement> getOptions(WebElement element)
	{
		List<WebElement> li = new Select(element).getOptions();
		return li;
	}
	
	public static List<WebElement> getAllSelectedOptions(WebElement element)
	{
		List<WebElement> li = new Select(element).getAllSelectedOptions();
		return li;
	}
	
	public static WebElement getFirstSelectedOption(WebElement element)
	{
		WebElement firstOption = new Select(element).getFirstSelectedOption();
		return firstOption;
	}
	
	public static void deSelectAll(WebElement element)
	{
		new Select(element).deselectAll();
	}
	
	public static boolean checkMultiSelect(WebElement element)
	{
		boolean multiple = new Select(element).isMultiple();
		return multiple;
	}
	
	public static void typeJS(WebElement element,String name) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].setAttribute('value','"+name+"')", element);
	}
	
	public static void simpleAlert()
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public static void acceptConfirmAlert()
	{
		Alert a = driver.switchTo().alert();
		a.accept();		
	}
	
	public static void dismissConfirmAlert()
	{
		Alert a = driver.switchTo().alert();
		a.dismiss();	
	}
	
	public static String getTextAlert()
	{
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		return text;
	}
	
	public static void acceptPromptAlert(String value)
	{
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
		a.accept();	
	}
	
	public static void dismissPromptAlert(String value)
	{
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
		a.dismiss();
	}
	
	public static void switchToFrameUsingNameOrId(String value)
	{
		driver.switchTo().frame(value);
	}
	
	public static void switchToFrameUsingIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public static void switchToFrameUsingWebElement(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public static void switchToChildWindow()
	{
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowsID = driver.getWindowHandles();
		for (String eachWindow : allWindowsID) {
			if(!parentWindowId.equals(eachWindow))
			{
				driver.switchTo().window(eachWindow);
				System.out.println("Switched into Child Window");
			}
		}
 	}
	
	public static void downArrowUsingRobot() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void upArrowUsingRobot() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	
	public static void leftArrowUsingRobot() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
	}
	
	public static void rightArrowUsingRobot() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
	}
	
	public static void enterUsingRobot() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static String getWebElementText(WebElement element)
	{
		return element.getText();
	}
	
	public static String getWebElementTagName(WebElement element)
	{
		return element.getTagName();
	}
	
	public static boolean isWebElementSelected(WebElement element)
	{
		return element.isSelected();
	}
	
	public static boolean isWebElementDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	
	public static boolean isWebElementEnabled(WebElement element)
	{
		return element.isEnabled();
	}
	
	public static String getWebElementAttribute(WebElement element,String attrValue)
	{
		return element.getAttribute(attrValue);
	}
	
	public static void navigateDesiredURL(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void navigateToPreviousPage()
	{
		driver.navigate().back();
	}
	
	public static void navigateToPageJustVisited()
	{
		driver.navigate().forward();
	}
	
	public static void mouseOver(Actions a,WebElement element)
	{
		new Actions(driver).moveToElement(element).perform();
	}
	
	public static void dragAndDrop(Actions a,WebElement srcElement,WebElement destElement)
	{
		new Actions(driver).dragAndDrop(srcElement, destElement).perform();
	}
	
	public static void rightClick(WebElement element)
	{
		new Actions(driver).contextClick(element);
	}
	
	public static void doubleClick(WebElement element)
	{
		new Actions(driver).doubleClick(element);
	}
	
	public static void clickAndHold(WebElement element)
	{
		new Actions(driver).clickAndHold((element));
	}
	
	
	
}
