package com.kazimsoylu.utils.date;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.kazimsoylu.utils.exceptions.date.DateNullException;
import com.kazimsoylu.utils.exceptions.date.StartDateAfterEndDateException;

public class DateUtilsDayDiffTest 
{
	@Test
	public void testDiffInDaysWithNormalParameters() throws Exception 
	{
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date start = df.parse( "15.05.2013" );
		Date end = df.parse( "21.05.2013" );
		
		Long expected = 6L;
		Long actual = DateCalculator.findDifferenceInDays(start, end);
			
		Assert.assertEquals( expected , actual );
	}
	
	@Test( expected=DateNullException.class )
	public void testDiffInDaysWithNullDates() throws Exception
	{
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date start = null;
		Date end = df.parse( "21.05.2013" );		
		Long diff = DateCalculator.findDifferenceInDays(start, end);		
	}
	
	@Test(expected=StartDateAfterEndDateException.class)
	public void testDiffInDaysStartDateAfterEndDateThrowsException() throws Exception
	{
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date startDate = df.parse( "21.05.2013 15:00:00" );
		Date endDate = df.parse( "21.05.2013 14:58:00" );
		
		Long diff = DateCalculator.findDifferenceInDays(startDate, endDate);
	}
}
