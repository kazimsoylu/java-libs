package com.kazimsoylu.fuzzy.utils;

import java.util.ArrayList;
import java.util.List;

import com.kazimsoylu.fuzzy.model.Data;

public class TermUtils 
{
	public static Integer findDifferenceBetweenTerms( Data term1, Data term2 )
	{
		return findDifferenceBetweenTerms(term1.getPrim(), term2.getPrim());
	}
	
	public static Integer findDifferenceBetweenTerms( Integer term1, Integer term2 )
	{
		return term2-term1;
	}
	
	public static Double findMeanValue( List<Integer> list )
	{
		double sum = 0.0;
		
		if(list.size()==0)
			return sum;
		
		for(Integer i : list)
			sum += i;
		
		return sum/list.size();
	}
	
	public static List<Integer> findPrimValues( List<Data> list )
	{
		List<Integer> values = new ArrayList<Integer>();
		
		for( Data d:list )
			values.add( d.getPrim() );
		
		return values;
	}
	
	public static Double findStandartDeviation( List<Integer> values )
	{
		double variance = 0.0;
		double mean = findMeanValue(values);
		
		for( Integer i : values )
			variance+= Math.pow(i - mean, 2 );
		
		variance = variance / values.size();
		
		return variance;
		
	}
	
}
