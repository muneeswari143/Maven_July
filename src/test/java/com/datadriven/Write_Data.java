package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
public static Logger log=Logger.getLogger(Write_Data.class);
	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
File f=new File("C:\\Users\\muthumunees\\OneDrive\\Desktop\\write.xlsx");
FileInputStream fis=new FileInputStream(f);
Workbook wb=new XSSFWorkbook(fis);
wb.createSheet("student_Data").createRow(0).createCell(0).setCellValue("Name");
wb.getSheet("student_Data").getRow(0).createCell(1).setCellValue("ID");
wb.getSheet("student_Data").createRow(1).createCell(0).setCellValue("Starc");
wb.getSheet("student_Data").getRow(1).createCell(1).setCellValue(17);
wb.getSheet("student_Data").createRow(2).createCell(0).setCellValue("Smith");
wb.getSheet("student_Data").getRow(2).createCell(1).setCellValue(10);
FileOutputStream fos=new FileOutputStream(f);
log.info("write successfully");
wb.write(fos);



	}

}
