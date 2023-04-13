package com.parabank.webapp.parallel;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.parabank.webapp.factory.WebDriverFactoryClass;
import com.parabank.webapp.utilities.FileConfigurations;
import com.parabank.webapp.utilities.PropertyFileReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyHooks {

	private WebDriver driver;
	public Logger logger=Logger.getLogger(MyHooks.class.getName());
	@Before
	public void init()
	{
		//String browser=PropertyFileReader.readConfigFile(FileConfigurations.CONFIGURATION_FILE_PATH).getProperty("browser");
		String browser=System.getProperty("BrowserValue");
		driver=WebDriverFactoryClass.initWebDriver(browser);
		
		
		logger.trace("opened browser: "+browser);
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(PropertyFileReader.readConfigFile(FileConfigurations.CONFIGURATION_FILE_PATH).getProperty("url"));
		logger.trace("opened the URL :"+driver.getCurrentUrl());
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
