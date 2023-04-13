package com.parabank.webapp.parallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	protected WebDriver driver;
	protected WebDriverWait wait;
	public Page(WebDriver driver) {
		super();
		this.driver = driver;
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(WebElement element);
	
	public abstract void waitForVisibilityOfWebelement(WebElement element);
	
	public abstract void waitForPageTitle(String title);
	

}
