package com.assignment.datetime.operations.test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.junit.Test;

import com.assignment.datetime.operations.DateTimeOperations;
import com.assignment.datetime.operations.DateTimeOperationsImpl;

public class DateTimeOperationsTest {

	static Properties properties = null;

	static {
		try {
			properties = DateTimeUtils.getFilePropertyValues();
		} catch (Exception e) {
			// should never happen
			e.printStackTrace();
			System.out.println("test generating...");
		}

	}

	//SalaryProcessor salaryProcessor = new SalaryProcessorImpl();
	DateTimeOperations dateTimeOperations = new DateTimeOperationsImpl();

	
	@Test
	public void testGetAllSaturdaysOfYear() {
		List allSaturdays = dateTimeOperations.getAllSaturdaysOfYear();
		String actualSaturdaysString = (String) properties.get("allsaturdays");
		String actualSaturdaysArray[] = actualSaturdaysString.split(",");
		List actualSaturdayList = new ArrayList();
		actualSaturdayList = Arrays.asList(actualSaturdaysArray);
		assertEquals(allSaturdays, actualSaturdayList);
	}

	@Test
	public void testCountAllSaturdaysOfYear() {
		int allSaturdaysCount = dateTimeOperations.getAllSaturdaysOfYear().toArray().length;
		String actualSaturdaysCount = (String) properties.get("countofallsaturdays");
		assertEquals(allSaturdaysCount, actualSaturdaysCount);
	}
	
	@Test
	public void testCountAllSaturdaysOnEvenDatesOfYear() {
		int allEvenSaturdaysCount = dateTimeOperations.getCountOfEvenDatedSaturdayOfYear();
		String actualEvenSaturdaysCount = (String) properties.get("countofevendatesaturday");
		assertEquals(allEvenSaturdaysCount, actualEvenSaturdaysCount);
	}
		
	
	
	
	
	
	

}
