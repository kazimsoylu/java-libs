package com.kazimsoylu.utils.algorithms;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeNumberTest 
{
	private boolean beklenenDeger;
	private Integer sayi;
	
	public PrimeNumberTest( int sayi, boolean beklenenDeger )
	{
		this.sayi = sayi;
		this.beklenenDeger = beklenenDeger;
	}
	
	@Test
	public void testPrime() 
	{
		Assert.assertEquals(beklenenDeger, PrimeNumber.isPrime(sayi));
	}
	
	@Parameters
	public static Collection parameters()
	{
		return Arrays.asList( new Object[][]{ { 2,true },{ 3,true },{ 9,false },{ 97,true } } );
	}
}
