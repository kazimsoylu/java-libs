package com.kazimsoylu.excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kazimsoylu.excelreader.utils.FileUtils;

public class XLSDocumentFactory
{
	public static XLSDocumentFactory instance = new XLSDocumentFactory();
	
	private XLSDocumentFactory()
	{
		
	}
	
	public static XLSDocumentFactory getInstance()
	{
		return instance;
	}
	
	public XlsDocument<?>   openDocument( String path ) throws IOException
	{
		FileInputStream fileInputStream = new FileInputStream( new File( path ));
		String fileExtension = FileUtils.getFileExtensionFromPath(path);
		
		if( fileExtension.contentEquals( Extensions.XLSX ) )
		{
			XlsDocument<XSSFWorkbook> document = new XlsDocument<XSSFWorkbook>();
			document.setWorkbook( new XSSFWorkbook( fileInputStream ) );
			document.setFileInputStream( fileInputStream );
			return document;
		}
		else if(  fileExtension.contentEquals( Extensions.XLS ) )
		{
			XlsDocument<HSSFWorkbook> document = new XlsDocument<HSSFWorkbook>();
			document.setWorkbook( new HSSFWorkbook( fileInputStream ) );
			document.setFileInputStream( fileInputStream );
			return document;
		}
		
		return null;
	}

}
