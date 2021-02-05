package Demo.testng;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DemoReadDataPovider
{
	@DataProvider
	public static String[][] demo() throws Exception
	{
		String[][] str;
		FileInputStream fis = new FileInputStream("‪‪E:\\Login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("login");
		int rowcount = sh.getPhysicalNumberOfRows();
		Row firstRow = sh.getRow(0);
		str = new String[rowcount][firstRow.getLastCellNum()];
		for(int i=1;i<rowcount;i++)
		{
			for(int j = 0;j < firstRow.getLastCellNum();j++)
			{
				str[i-1][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		return str;

	}
	public void tc(String user,String pass)
	{
		Reporter.log(user + " " + pass ,true);
	}
}
