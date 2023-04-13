package com.parabank.webapp.parallel;

import org.junit.Assert;

import com.parabank.webapp.factory.WebDriverFactoryClass;
import com.parabank.webapp.pages.HomePage;
import com.parabank.webapp.utilities.FileConfigurations;
import com.parabank.webapp.utilities.PropertyFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDefination {

	private HomePage homePageObj=new HomePage(WebDriverFactoryClass.getWebDriver());
	
	@Given("user opened the browser")
	public void user_opened_the_browser() {
	   System.out.println(PropertyFileReader.readConfigFile(FileConfigurations.CONFIGURATION_FILE_PATH).getProperty("browser"));
	}

	@Given("entered the url")
	public void entered_the_url() {
		   System.out.println(PropertyFileReader.readConfigFile(FileConfigurations.CONFIGURATION_FILE_PATH).getProperty("url"));
	}

	@Then("company logo is diplayed")
	public void company_logo_is_diplayed() {
	  Assert.assertTrue(homePageObj.checkLogoAvailability());
	}

	@Then("caption displayed as {string}")
	public void caption_displayed_as(String caption) {
	  Assert.assertEquals(homePageObj.getCaption(),caption);
	}
}
