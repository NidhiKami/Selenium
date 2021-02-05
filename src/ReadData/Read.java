package ReadData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read 
{
	public static void main (String[]args) throws Exception
	{
		String path ="‪.\\Selenium\\Login.xlsx";
		File fis = new File(path);
		
		//FileInputStream fis = new FileInputStream("‪E:/Login.xlsx");//path of excel file
	
		Workbook wb = WorkbookFactory.create(fis);//loaded sheet also
		Sheet sh = wb.getSheet("login");//how many row
		int rowcount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);
		for(int row = 0;row < rowcount;row++)
		{
			for(int col = 0;col < firstRow.getLastCellNum();row++)
			{
				Cell c1 = sh.getRow(row).getCell(col);
				System.out.println(c1);

			}
		}
	}
}
