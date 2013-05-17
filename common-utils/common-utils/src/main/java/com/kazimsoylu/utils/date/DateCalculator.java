package com.kazimsoylu.utils.date;

import java.util.Date;

import com.kazimsoylu.utils.exceptions.date.DateNullException;
import com.kazimsoylu.utils.exceptions.date.StartDateAfterEndDateException;

public class DateCalculator 
{
	/**
	 * Finds the number of days between start date and end date
	 * @param startDate Start date ( Smaller date )
	 * @param endDate End date ( Older date )
	 * @return Number of days between start and end date
	 */
	public static Long findDifferenceInDays( Date startDate, Date endDate )
	{
		if( startDate == null || endDate == null )
			throw new DateNullException("Dates cannot be null");
		
		if( startDate.after( endDate ) )
			throw new StartDateAfterEndDateException();
		
		long start = startDate.getTime();
		long end = endDate.getTime();
		
		long diff = end - start;
		long diffInDays = (diff / (1000 * 60 * 60 * 24));
		
		return diffInDays;
	}
	
	
}
