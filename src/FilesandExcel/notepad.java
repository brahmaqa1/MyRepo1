package FilesandExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class notepad {
	
	public static void main(String[] args) throws IOException
	{
		try {
			//FileOutputStream fos=new FileOutputStream("D://qtp practise//TestData//config.txt");
			//care ***********: 
			//if file not there, it creates file
			FileOutputStream fos=new FileOutputStream("D://qtp practise//TestData//config34.txt");
			  String s="Sachin Tendulkar"; 
			  byte [] b=s.getBytes();//converting string into byte array************
			  fos.write(b);//Care:::::::write() uses byte[]	  
			  fos.close();
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
