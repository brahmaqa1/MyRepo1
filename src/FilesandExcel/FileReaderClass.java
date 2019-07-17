package FilesandExcel;

import java.io.FileReader;

public class FileReaderClass {

	public static void main(String args[])throws Exception{  

		String filename="D://qtp practise//TestData//config.txt";
	      FileReader fr=new FileReader(filename);  
	      //if file not--error
	      
//	      System.out.print((char)fr.read());
//	      System.out.print((char)fr.read());
	      
	 /*     int i;  
	      
	      while((i=fr.read())!=-1)  
	      {	  
	      System.out.print((char)i);  //care :******returns a character in ASCII form. It returns -1 at the end of file.
	     }  
	      */
	      fr.close();
	    }  
}
