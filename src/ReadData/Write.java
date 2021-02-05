package ReadData;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write {
	public static void main (String[]args) throws Exception
	{
		FileInputStream fis = new FileInputStream("‪‪‪‪‪.Data/Write.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("VaLIDLOGIN");
		Cell c1 = sh.createRow(0).createCell(0);
		c1.setCellValue("USERNAME");
		sh.getRow(0).createCell(1).setCellValue("PASSWORD");
		sh.getRow(1).createCell(0).setCellValue("Admin");
		sh.getRow(1).createCell(1).setCellValue("Manager");
		FileOutputStream fio = new FileOutputStream("‪‪‪‪‪.Data/Write.xlsx");
		wb.write(fio);
		System.out.println("done");
		wb.close();
		
	}	
}
