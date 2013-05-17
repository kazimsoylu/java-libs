package com.kazimsoylu.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.kazimsoylu.utils.exceptions.date.IllegalDateStringException;

public class DateConverter 
{
	public static Date toDate( String dateString, String format )
	{
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date date = null;
		try
		{
			date = df.parse( dateString );
		}
		catch( ParseException ex )
		{
			date = null;
			throw new IllegalDateStringException("Date string and format are incompatible ");
		}
		
		return date;
	}
}
