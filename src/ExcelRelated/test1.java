package ExcelRelated;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;

public class test1 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String FilePath = "d://filepath.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		//Workbook wb = Workbook.getWorkbook(fs);
		
		
		
	}

}
