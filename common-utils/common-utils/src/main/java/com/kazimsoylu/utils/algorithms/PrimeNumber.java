package com.kazimsoylu.utils.algorithms;

public class PrimeNumber 
{
	public static boolean isPrime(Integer number)
	{		
		if( number == 2 )
			return true;
		
		for( int i=2;i<number-1; i++)
		{
			if( number % i == 0 )
				return false;
		}
		
		return true;
	}
}
