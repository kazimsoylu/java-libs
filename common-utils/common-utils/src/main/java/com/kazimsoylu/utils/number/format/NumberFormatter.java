package com.kazimsoylu.utils.number.format;

/**
 * 
 * @author Kazim Soylu
 *
 * @param <T>
 */
public interface NumberFormatter<T extends Number> 
{
	public T parse( String str );
	
	public String format( T number );
}
