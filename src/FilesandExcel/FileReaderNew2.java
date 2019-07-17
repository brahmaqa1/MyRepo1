package FilesandExcel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderNew2 {

	public static void main(String[] args) throws IOException {
		int ch;
		String FilePath="D:\\Selenium Softwares\\TestData.txt";
		
		FileReader fr= new FileReader(FilePath);
		
		while(fr.read())
		{
			
			System.out.println("Lines="+ (char) ch) ;
			
		}
		
		fr.close();
		

	}

}
