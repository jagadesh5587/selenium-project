package MavenDD.DD;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Base.Base;

public class WriteData extends Base{
public static void main(String[] args) throws Throwable {
	File f1 = new File("E:\\Java\\DataDriven\\Source\\Book1.xlsx");
	FileInputStream fi = new FileInputStream(f1);
	Workbook w = new XSSFWorkbook(fi);
	Sheet s = w.getSheet("Login1");
for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
	
	Row r = s.getRow(i);
	for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		Cell c = r.getCell(j);
		CellType c1 = c.getCellType();
		String value = null;
		switch (c1) {
		case NUMERIC:
			double d = c.getNumericCellValue();
			long l=(long)d;
			value =String.valueOf(l);
			System.out.println(value);
			break;

		case STRING:
			String sr = c.getStringCellValue();
			value = sr;
			System.out.println(value);
			break;
		}
		
	}
	
}	
	
}
}
