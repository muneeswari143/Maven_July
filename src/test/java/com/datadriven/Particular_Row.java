package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Row {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\jar files\\workspace\\Maven_project\\demo.xlsx");
		FileInputStream file=new FileInputStream(f);
		Workbook work=new XSSFWorkbook(file);
		Sheet s= work.getSheetAt(0);
		Row r=s.getRow(2);
		int numberOfCells2 = r.getPhysicalNumberOfCells();
		for (int i = 0; i <6; i++) {
		
			int numberOfCells = r.getPhysicalNumberOfCells();
			for (int j = 0; j <numberOfCells; j++) {
				Cell c=r.getCell(3);
				CellType type=c.getCellType();
			if (type.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
					System.out.print(value+" ");
					
				}

				else if (type.equals(CellType.NUMERIC)) {
			double numericValue = c.getNumericCellValue();
					String valueOf = String.valueOf(numericValue);
					System.out.print(valueOf+" ");
				
				}
			
			}
			System.out.println();
		}
			
	}
}
		
	


