package com.parabank.webapp.parallel;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.parabank.webapp.utilities.ExcelFileReader;

import io.cucumber.java.en.When;

public class RegistrationPageStepDefination {

	@When("user click on the registration")
	public void user_click_on_the_registration() {
	   System.out.println("user click on the registration");
	}

	@When("put the data from {string} with row number {int}")
	public void put_the_data_from_with_row_number(String sheetName, Integer rowNumber) {
	  String data[]=ExcelFileReader.getExcelShee(sheetName,rowNumber);
	  for(int i=0;i<data.length;i++)
	  {
		  System.out.println(data[i]);
	  }
	  
	}

	@When("click on send button")
	public void click_on_send_button() {
		System.out.println("click on send button");
	}
}
