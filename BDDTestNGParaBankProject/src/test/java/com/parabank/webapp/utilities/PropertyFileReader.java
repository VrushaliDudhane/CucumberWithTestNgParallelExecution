/**
 * 
 */
package com.parabank.webapp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Vrushali
 *
 */
public class PropertyFileReader {


	
	public static Properties readConfigFile(String file)
	{
		Properties prop=new Properties();
		FileInputStream ip;
		try {
			ip=new FileInputStream(file);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
}
