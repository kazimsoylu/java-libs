package com.kazimsoylu.utils.exceptions.date;

public class StartDateAfterEndDateException extends RuntimeException 
{
	public StartDateAfterEndDateException()
	{
		
	}
	
	public StartDateAfterEndDateException(String msg)
	{
		super(msg);
	}
}
