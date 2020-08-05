package com.functionalLibraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenClass {

	public  String [][] data(String path, String sheetname ) throws InvalidFormatException, IOException {
		FileInputStream fi = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet s = wb.getSheet(sheetname);
		int rowcount = s.getLastRowNum();
		int cellcount = s.getRow(0).getLastCellNum();
		String data[][]= new String[rowcount][cellcount];
		for (int i = 1; i <= rowcount; i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < cellcount; j++) {
				Cell cell = row.getCell(j);
				try {
					if(cell.getCellType() ==CellType.STRING) {
						data[i-1][j]=cell.getStringCellValue();
					}else {	
						data[i-1][j]= String.valueOf(cell.getNumericCellValue());
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			} 
		}
return data;
	}
}
