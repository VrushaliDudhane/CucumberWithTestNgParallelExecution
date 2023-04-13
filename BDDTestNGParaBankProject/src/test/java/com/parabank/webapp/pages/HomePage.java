package com.parabank.webapp.pages;


import com.parabank.webapp.parallel.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

	
	@FindBy(css = "div[id='topPanel']>a:nth-of-type(2)>img")
	private WebElement logo;
	
	@FindBy(css = "div[id='topPanel']>p")
	private WebElement caption;
		

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkLogoAvailability()
	{
		return logo.isDisplayed();
	}
	
	public String getCaption()
	{
		return caption.getText();
	}
	
	
}
