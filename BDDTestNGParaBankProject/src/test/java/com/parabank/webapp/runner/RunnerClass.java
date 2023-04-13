package com.parabank.webapp.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/FeatureFiles"},
					glue= {"com/parabank/webapp/stepDefination","com/parabank/webapp/base"},
					//tags= "@regression",
					plugin= {"pretty"},
					monochrome=true)
public class RunnerClass {

 
}
