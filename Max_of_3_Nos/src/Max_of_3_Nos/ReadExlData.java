package Max_of_3_Nos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExlData {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis =new FileInputStream("E:\\Manisha\\Demo.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getSheetName());
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getPhysicalNumberOfRows());
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getFirstRowNum());

	}

}
