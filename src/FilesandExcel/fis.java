package FilesandExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fis {


	public static void main(String[] args) throws IOException 
	{
		String filename="D://qtp practise//TestData//config.txt";
		try {
			FileInputStream fisref=new FileInputStream(filename);
		/*	int i=fisref.read();
			System.out.println("i="+i);//83???
*/			
			while(fisref.read()!=-1)
			{
				//System.out.println("read="+fisref.read());//Care :: not expected val coming 83,48,46...???
				System.out.println("read="+(char)fisref.read());//retunr int .so use char
			}
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
