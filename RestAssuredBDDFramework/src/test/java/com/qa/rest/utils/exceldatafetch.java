package com.qa.rest.utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldatafetch {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public  exceldatafetch(String excelpath,String sheetname) {
		
		
		 try {
			workbook=new XSSFWorkbook(excelpath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sheet= workbook.getSheetAt(0);
	}
	public static void getcellData(int rownum,int colname) {
		
				
			DataFormatter formatter=new DataFormatter();
			Object value=formatter.formatCellValue(sheet.getRow(rownum).getCell(colname));
			int rowcount=sheet.getPhysicalNumberOfRows();
			                                //String cellvalue=sheet.getRow(1).getCell(0).getStringCellValue();
			//System.out.println("total rows  "+ rowcount);
			System.out.println("The cellvalue-  "+ value );
			
	
	}

	}
	
	


