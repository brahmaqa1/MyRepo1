package StringPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class roughTxtFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("D:\\qtp practise\\TestData\\SamplecreatetxtFile1.txt");
		f.createNewFile();
		
//		File f2=new File("D:\\qtp practise\\TestData\\SamplecreateWord.docx");
//		f2.createNewFile();//ok
//		
//		File f3=new File("D:\\qtp practise\\TestData\\SamplecreateExcelFile1.xlsx");
//		f3.createNewFile();//ok
		
		
//	FileWriter fw=new FileWriter(f);
//	BufferedWriter bfw=new BufferedWriter(fw);
//	
//	bfw.write("line-1");
//	bfw.write("line-2");
//	bfw.newLine();
//	bfw.write("line-3");
//	
//	// date not entered
//	bfw.flush();
	
	//read
		
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
//		System.out.println("line1="+br.readLine());  //  line1 line-2
		//System.out.println("line2="+br.readLine()); // line-3
		
		while(br.readLine()!=null)
		{
			System.out.println("lines="+br.readLine());
			// lines=line-3???????
		}
		
		// how can we get all data from txt file at a time?
	
	}
}
