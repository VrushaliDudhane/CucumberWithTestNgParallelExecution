package com.parabank.webapp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {
	
	public static String[] getExcelShee(String sheetName,int rowNumber)
	{
		FileInputStream ip;
		XSSFWorkbook workbook=null;
		try {
			ip=new FileInputStream(FileConfigurations.TEST_DATA_PATH);
			workbook=new XSSFWorkbook(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 XSSFSheet sheet=workbook.getSheet(sheetName);
		 XSSFRow row=sheet.getRow(rowNumber);
		 
		 String data[]=new String[row.getLastCellNum()];
		 for(int i=0;i<row.getLastCellNum();i++)
		 {
			 XSSFCell cell=row.getCell(i);
			 switch(cell.getCellType())
			 {
			 	case NUMERIC:
			 		data[i]=Double.valueOf(cell.getNumericCellValue()).toString();
			 		break;
			 	case STRING:
			 		data[i]=cell.getStringCellValue();
			 		break;
			default:
				break;
			 }
		 }
		 
		return data;
	}

}
