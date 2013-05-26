package com.kazimsoylu.fuzzy.utils.sort.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.SortOrder;

import com.kazimsoylu.fuzzy.model.Data;
import com.kazimsoylu.fuzzy.utils.sort.DataSorter;
import com.kazimsoylu.fuzzy.utils.sort.SortDirection;

public class DataPrimSorter implements DataSorter
{
	@Override
	public List<Data> sort(List<Data> list, SortDirection sortDirection) 
	{
		if( sortDirection == SortDirection.ASCENDING )
			Collections.sort( list, new PrimAscendingComparator());
		else
			Collections.sort( list, new PrimDescendingComparator());
		
		return list;
	}
	
}

class PrimAscendingComparator implements Comparator<Data>
{
	@Override
	public int compare(Data data1, Data data2) 
	{
		return data1.getPrim()-data2.getPrim();
	}	
	
}

class PrimDescendingComparator implements Comparator<Data>
{
	@Override
	public int compare(Data data1, Data data2) 
	{
		return data2.getPrim()-data1.getPrim();
	}	
	
}
