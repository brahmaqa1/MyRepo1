package FilesandExcel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffWriterClass {

	public static void main(String[] args) throws IOException 
	{
		
		//BufferedWriter  bw=new BufferedWriter();//error should have arg
		
		FileWriter fw=new FileWriter("D://qtp practise//TestData//configwrite.txt");
		BufferedWriter  bw=new BufferedWriter(fw);//need writer class refe
		
		bw.write("line-1");//
		bw.write("line-2");// 
		
		bw.newLine();//enter a new line
		bw.write("line-3");
		bw.newLine();
		bw.write("line-4");
		
		// Always close files.
		bw.close();//if not ---????not writing data into txt????Care**********must write
				
		System.out.println("ends");	
	}
}
