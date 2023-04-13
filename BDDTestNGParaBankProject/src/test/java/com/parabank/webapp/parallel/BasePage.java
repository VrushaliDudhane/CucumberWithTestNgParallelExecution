package com.parabank.webapp.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(WebElement element) {
		return element.getText();
	}

	@Override
	public void waitForVisibilityOfWebelement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	@Override
	public void waitForPageTitle(String title) {
		wait.until(ExpectedConditions.titleContains(title));
		
	}

}
