package com.insightly.qa.utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.insightly.qa.base.SetProperty;

public class ExcelReader extends SetProperty {
	
	static Object[][] Obj;
	public java.lang.Object[][] getData() throws IOException {
		
		
		FileInputStream fi=new FileInputStream("D:\\Java programming Eclips\\Contacts.xlsx");
											   //"D:\\Java programming Eclips\\Interest caliculator.xlsx"
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int lastRow=sheet.getLastRowNum();
		int lastCell=sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows="+lastRow);
		System.out.println("number of cells="+lastCell);
		Obj=new Object[6][5];
		
		for(int i=0;i<=lastRow-1;i++) {
			
			XSSFRow curentRow=sheet.getRow(i+1);
			System.out.println("*****contact"+i+"******");
			
			for(int j=0; j<=lastCell-1; j++) {
			
			String cell=  curentRow.getCell(j).toString();	
			
			Obj[i][j]=cell;
			
//			if(isNumber(cell)) {
//				System.out.println("is Number");
//				int val=(int) curentRow.getCell(j).getNumericCellValue();
//				System.out.println(val);
//				Obj[i][j]=val;
//				System.out.println(Obj[i][j]);
//			}
//			else{
//				System.out.println("is String");
//				Obj[i][j]=curentRow.getCell(j).getStringCellValue();
//				System.out.println(Obj[i][j]);
//			}
			
//			Obj[i][0]=curentRow.getCell(0).getStringCellValue();
//			Obj[i][1]=curentRow.getCell(1).getStringCellValue();
//			Obj[i][2]=curentRow.getCell(2).getStringCellValue();
//			Obj[i][3]=curentRow.getCell(3).getStringCellValue();
//			Obj[i][4]=curentRow.getCell(0).getNumericCellValue();
			}
			}
		
			return Obj;
	}
	public static boolean isNumber(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
		public static void main(String[] args) throws IOException { 
			Object obn[][]=new ExcelReader().getData();
			
			for(int i=0;i<=5;i++) {
				for(int j=0; j<=4; j++) {				
				System.out.println("data is"+ obn[i][j]);
			}
}		
		}
		}



