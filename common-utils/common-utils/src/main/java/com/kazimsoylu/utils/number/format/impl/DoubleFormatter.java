package com.kazimsoylu.utils.number.format.impl;

import java.text.DecimalFormat;


public class DoubleFormatter
{
	private static DoubleFormatter instance = null;
	
	public static DoubleFormatter getInstance()
	{
		if( instance == null )
			instance = new DoubleFormatter();
		return instance;
	}
	
	public String format(Double number,String format) 
	{
		DecimalFormat df = new DecimalFormat(format);
		return df.format( number );		
	}
	
	public Integer getIntegerPart(Double number)
	{
		return number.intValue();
	}
	
	public Double getFractionalPart(Double number)
	{
		return number-getIntegerPart(number);		
	}

}
