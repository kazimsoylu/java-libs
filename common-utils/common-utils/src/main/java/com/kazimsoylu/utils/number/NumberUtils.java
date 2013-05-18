package com.kazimsoylu.utils.number;

import com.kazimsoylu.utils.algorithms.PrimeNumber;

public class NumberUtils 
{
	/**
	 * Determines whether given number is prime or not.
	 * @param number The number checked to see if it is prime
	 * @return true=prime, false=not prime
	 */
	public static boolean isPrimeNumber( Integer number )
	{
		return PrimeNumber.isPrime(number);
	}
}
