package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void All_Data() throws IOException {
	File f=new File("C:\\jar files\\workspace\\Maven_project\\demo.xlsx");
	FileInputStream file=new FileInputStream(f);
	Workbook work=new XSSFWorkbook(file);
	Sheet s= work.getSheetAt(0);
	int rows=s.getPhysicalNumberOfRows();
	for (int i = 0; i <rows; i++) {
		Row r=s.getRow(i);
		int numberOfCells = r.getPhysicalNumberOfCells();
		for (int j = 0; j <numberOfCells; j++) {
			Cell c=r.getCell(j);
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
	public static void Particular_Cell() throws IOException {
	File f=new File("C:\\jar files\\workspace\\Maven_project\\demo.xlsx");
	FileInputStream file=new FileInputStream(f);
	Workbook work=new XSSFWorkbook(file);
	Sheet s= work.getSheetAt(0);
	Row r= s.getRow(4);
	Cell c=r.getCell(1);
	CellType type=c.getCellType();
	if (type.equals(CellType.STRING)) {
		String value = c.getStringCellValue();
		System.out.println(value);
		}
else if (type.equals(CellType.NUMERIC)) {
		double numericValue = c.getNumericCellValue();
		int i=(int) numericValue;
		System.out.println(i);
		}
	}
	public static void Particular_Row() throws IOException	{
		File f=new File("C:\\jar files\\workspace\\Maven_project\\demo.xlsx");
		FileInputStream file=new FileInputStream(f);
		Workbook work=new XSSFWorkbook(file);
		Sheet s= work.getSheetAt(0);
		Row r=s.getRow(2);
		int numberOfCells2 = r.getPhysicalNumberOfCells();
		for (int i = 0; i <numberOfCells2; i++) {
			Cell c=r.getCell(i);
		CellType type=c.getCellType();
			if (type.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
					System.out.print(value+" ");
					}
else if (type.equals(CellType.NUMERIC)) {
			double numericValue = c.getNumericCellValue();
					int valueOf = (int)numericValue;
					System.out.print(valueOf+" ");
				}
			}
			System.out.println();
		}
	public static void Particular_Column() throws IOException {
		File f=new File("C:\\jar files\\workspace\\Maven_project\\demo.xlsx");
		FileInputStream file=new FileInputStream(f);
		Workbook work=new XSSFWorkbook(file);
		Sheet s= work.getSheetAt(0);
		int numberOfCells2 = s.getPhysicalNumberOfRows();
		for (int i = 0; i <numberOfCells2; i++) {
			Row r=s.getRow(i);
			Cell c=r.getCell(1);
		CellType type=c.getCellType();
			if (type.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
					System.out.println(value);
					}
else if (type.equals(CellType.NUMERIC)) {
			double numericValue = c.getNumericCellValue();
					int valueOf = (int)numericValue;
					System.out.println(valueOf);
				}
		}
	}
public static void main(String[] args) throws IOException {
		Particular_Column();
	
}

}

