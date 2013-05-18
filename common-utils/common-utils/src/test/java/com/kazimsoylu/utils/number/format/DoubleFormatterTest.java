package com.kazimsoylu.utils.number.format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.junit.Assert;
import org.junit.Test;

import com.kazimsoylu.utils.number.format.impl.DoubleFormatter;

public class DoubleFormatterTest 
{
	/**
	 * Number : 12.345
	 * Format : #.00
	 * Result should be : 12.34
	 * @throws Exception
	 */
	@Test
	public void formatCase1Test() throws Exception 
	{
		Double number = 12.345;
		DoubleFormatter df = new DoubleFormatter();
		String actual = df.format(number, "#.00");
		
		char decimalSeperator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
		String expected = "12"+decimalSeperator+"34";
		
		Assert.assertEquals(expected, actual );
		
		System.out.println("Formatted number:"+actual);
		
	}
	
	/**
	 * Number : 12.34
	 * Format : #.000
	 * Result should be : 12.340
	 * @throws Exception
	 */
	@Test
	public void formatCase2Test() throws Exception 
	{
		Double number = 12.34;
		DoubleFormatter df = new DoubleFormatter();
		String actual = df.format(number, "#.000");
		
		char decimalSeperator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
		String expected = "12"+decimalSeperator+"340";
		
		Assert.assertEquals(expected, actual );
		
		System.out.println("Formatted number:"+actual);
		
	}
	
	/**
	 * Number : 12.34
	 * Format : #.###
	 * Result should be : 12.34
	 * @throws Exception
	 */
	@Test
	public void formatCase3Test() throws Exception 
	{
		Double number = 12.34;
		DoubleFormatter df = new DoubleFormatter();
		String actual = df.format(number, "#.###");
		
		char decimalSeperator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
		String expected = "12"+decimalSeperator+"34";
		
		Assert.assertEquals(expected, actual );
		
		System.out.println("Formatted number:"+actual);
		
	}
	
	@Test
	public void getFractionalPartTest()
	{
		double number = 12.345;
		double expected = 0.345;
		
		double actual = new DoubleFormatter().getFractionalPart(number);
		Assert.assertEquals(expected, actual, 0.001 );
	}
}
