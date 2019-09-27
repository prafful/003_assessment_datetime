package com.assignment.datetime.operations.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DateTimeUtils {
	
	public static String allvalues = "../datetime.properties";
    
	public static Properties getFilePropertyValues() throws Exception{
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(new File(allvalues));
        properties.load(fis);  
        fis.close();
        return properties;
    }
	


}
