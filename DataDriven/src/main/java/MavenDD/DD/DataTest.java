package MavenDD.DD;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTest {
public static void main(String[] args) throws Throwable {
	File f = new File("E:\\Java\\Maven\\TestCase\\Source\\Book1.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook w= new XSSFWorkbook(fi);
	Sheet s = w.getSheet("Login");
Row r = s.getRow(1);
Cell c = r.getCell(0);
//String x=c.getStringCellValue();
//double x = c.getNumericCellValue();
//long l = (long)x;
//System.out.println(l);
CellType cellType = c.getCellType();
String sal = null;
switch (cellType) {
case NUMERIC:
	double d = c.getNumericCellValue();
	long l=(long)d;
	System.out.println(l);
	break;

case STRING:
	String str = c.getStringCellValue();
	System.out.println(str);
	break;
}

}
}
