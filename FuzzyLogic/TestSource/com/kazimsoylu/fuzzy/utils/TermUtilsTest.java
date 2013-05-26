package com.kazimsoylu.fuzzy.utils;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TermUtilsTest 
{
	private List<Integer> list = new ArrayList<Integer>();
	
	@Before
	public void setUp()
	{
		/*
		list.add( 100 );
		list.add( 100 );
		list.add( 300 );
		list.add( 100 );
		list.add( 100 );
		list.add( 500 );
		list.add( 100 );
		*/
		
		list.add( 2000 );
		list.add( 2100 );
		list.add( 2200 );
		list.add( 2500 );
		list.add( 2600 );
		list.add( 2700 );
		list.add( 3200 );
		list.add( 3300 );

		
	}
	
	@Test
	public void varianceTest() throws Exception 
	{
		double d = TermUtils.findStandartDeviation(list);
		System.out.println(Math.sqrt(d));
		System.out.println(d);
	}
}
