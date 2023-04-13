package com.parabank.webapp.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactoryClass {
	static ThreadLocal<WebDriver> threadPool=new ThreadLocal<>();
	
	public static WebDriver initWebDriver(String browser)
	{
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			threadPool.set(new ChromeDriver(opt));
			
		}

		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			threadPool.set(new EdgeDriver());
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.edgedriver().setup();
			threadPool.set(new EdgeDriver());
		}
		return threadPool.get();
	}
	
	public static WebDriver getWebDriver() {
		return threadPool.get();
	}

}
