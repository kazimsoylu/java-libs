package com.kazimsoylu.utils.date;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.kazimsoylu.utils.exceptions.date.IllegalDateStringException;

public class DateConverterTests 
{
	@Test
	public void compatibleDateStringAndFormat() throws Exception 
	{
		Date date = DateConverter.toDate( "17-05-2013" , DateFormats.DD_MM_YYYY);
		Assert.assertNotNull( date );
	}
	
	@Test(expected=IllegalDateStringException.class)
	public void incompatibleDateStringAndFormat() throws Exception 
	{
		Date date = DateConverter.toDate( "17/05/2013" , DateFormats.DD_MM_YYYY);	
	}
}
