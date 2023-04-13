package com.parabank.webapp.parallel;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/parallel"},
					glue= {"com/parabank/webapp/parallel"},
					//tags= "@regression",
					plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"timeline:test-output-thread/",
							"json:test-output/JsonReport/report.json",
							"junit:test-output/JunitReport/report.xml"},
					monochrome=true)


public class RunnerClassTestNg extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

 
}
