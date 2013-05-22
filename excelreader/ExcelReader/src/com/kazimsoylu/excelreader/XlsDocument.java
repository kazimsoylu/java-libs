package com.kazimsoylu.excelreader;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XlsDocument<T> 
{
	private T workbook;
	private FileInputStream fileInputStream;
	
	public T getWorkbook() {
		return workbook;
	}
	public void setWorkbook(T workbook) {
		this.workbook = workbook;
	}
	public FileInputStream getFileInputStream() {
		return fileInputStream;
	}
	public void setFileInputStream(FileInputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}
	
	
}
