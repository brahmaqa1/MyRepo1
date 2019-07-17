package FilesandExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fiswrite {

	
	public static void main(String[] args) throws IOException {
		String filename="D://qtp practise//TestData//config.txt";
		String destfile="D://qtp practise//TestData//configwrite.txt";
		try {
			FileInputStream fisref=new FileInputStream(filename);
			
			FileOutputStream fosref=new FileOutputStream(destfile);//for wriring
			int i=0;
			while((i=fisref.read())!=-1)
			{  
				System.out.println((byte)i);
				fosref.write((byte)i);  
			}  
			fisref.close();  
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
