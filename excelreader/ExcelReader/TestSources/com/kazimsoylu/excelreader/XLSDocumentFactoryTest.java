package com.kazimsoylu.excelreader;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

public class XLSDocumentFactoryTest 
{
	
	@Test
	public void testOpenXLSXDocument() throws Exception 
	{
		XlsDocument<?> wb = XLSDocumentFactory.getInstance().openDocument( "D:\\deneme.xlsx" );	
		Assert.assertNotNull( wb );
		Assert.assertTrue( wb.getWorkbook() instanceof XSSFWorkbook  );
	}
	
	@Test
	public void testOpenXLSDocument() throws Exception 
	{
		XlsDocument<?> wb = XLSDocumentFactory.getInstance().openDocument( "D:\\dene.xls" );	
		Assert.assertNotNull( wb );
		Assert.assertTrue( wb.getWorkbook() instanceof HSSFWorkbook  );
	}
}
