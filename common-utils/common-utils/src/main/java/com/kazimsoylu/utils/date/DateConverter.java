package com.kazimsoylu.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.kazimsoylu.utils.exceptions.date.IllegalDateStringException;

/**
 * 
 * @author Kazim SOYLU
 * @since 17.05.2013
 */
public class DateConverter 
{
	/**
	 * Converts given date string to the Date object. 
	 * @param dateString String representation of the date
	 * @param format Date format
	 * @return Date object
	 */
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
