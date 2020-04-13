package com.erp22_utilities;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelOperation {
public static String readData(String SheetName,int RowNum,int ColumnNum) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	String s = w1.getSheet(SheetName).getRow(RowNum).getCell(ColumnNum).getStringCellValue();
	return s;
}

public static void writeData(String SheetName,int RowNumber,int ColumnNumber,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
	Workbook w2 = WorkbookFactory.create(fis);
	w2.getSheet(SheetName).createRow(RowNumber).createCell(ColumnNumber).setCellValue(data);
	FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
	w2.write(fos);
}
}


