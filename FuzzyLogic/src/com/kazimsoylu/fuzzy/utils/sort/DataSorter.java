package com.kazimsoylu.fuzzy.utils.sort;

import java.util.List;

import com.kazimsoylu.fuzzy.model.Data;

public interface DataSorter 
{
	public List<Data> sort( List<Data> list, SortDirection sortDirection );
}
