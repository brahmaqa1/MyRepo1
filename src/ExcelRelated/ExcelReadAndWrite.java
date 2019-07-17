package ExcelRelated;

import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReadAndWrite {

	//POI
	public static void main(String[] args) 
	{
		String filename="D://qtp practise//TestData//logindata.xls";
		HSSFWorkbook  wb=new HSSFWorkbook();
		HSSFSheet wsh =wb.getSheet("Sheet1");
		Iterator rows=wsh.rowIterator();
		//Iterator cols=wsh.cellIterator();//?????
		
	
		
		

	}

}
