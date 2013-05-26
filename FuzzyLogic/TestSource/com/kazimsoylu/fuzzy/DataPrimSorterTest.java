package com.kazimsoylu.fuzzy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.kazimsoylu.fuzzy.model.Data;
import com.kazimsoylu.fuzzy.utils.sort.SortDirection;
import com.kazimsoylu.fuzzy.utils.sort.impl.DataPrimSorter;

public class DataPrimSorterTest 
{
	private List<Data> list = new ArrayList<Data>();
	
	@Before
	public void setUp()
	{
		list.add( new Data( 1,20,30000, 2000 ) );
		list.add( new Data( 2,25,30000, 2100 ) );
		list.add( new Data( 3,30,10000, 2200 ) );
		list.add( new Data( 4,45,50000, 2500 ) );
		list.add( new Data( 5,50,30000, 2600 ) );
		list.add( new Data( 6,60,10000, 2700 ) );
		list.add( new Data( 7,80,30000, 3200 ) );
		list.add( new Data( 8,80,40000, 3300 ) );
		
	}
	
	@Test
	public void testAscendingOrder() throws Exception 
	{
		DataPrimSorter dSorter = new DataPrimSorter();
		dSorter.sort(list,SortDirection.ASCENDING);
		
		System.out.println("Ascending");
		for( Data d : list )
			System.out.println(d.getPrim());
		
		Assert.assertEquals( 3300 , list.get( list.size()-1 ).getPrim());
		Assert.assertEquals( 2000 , list.get( 0 ).getPrim());
		
	}
	
	@Test
	public void testDescendingOrder() throws Exception 
	{
		DataPrimSorter dSorter = new DataPrimSorter();
		dSorter.sort(list,SortDirection.DESCENDING);
		
		System.out.println("Descending");
		for( Data d : list )
			System.out.println(d.getPrim());
		
		Assert.assertEquals( 2000 , list.get( list.size()-1 ).getPrim());
		Assert.assertEquals( 3300 , list.get( 0 ).getPrim());	
	}
}
