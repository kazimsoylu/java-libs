package com.kazimsoylu.excelreader.utils;

public class FileUtils 
{
	public static String getFileExtensionFromPath(String path)
	{
		return path.substring( path.lastIndexOf( '.' )+1 );
	}
}
