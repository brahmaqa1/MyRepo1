package FilesandExcel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class buffReader2 {

	public static void main(String[] args) throws IOException {
	 // The name of the file to open.
    String fileName = "D:\\qtp practise\\TestData\\config.txt";

    // This will reference one line at a time
    String line = null;
   
        // FileReader reads text files in the default encoding.
        FileReader fileReader =  new FileReader(fileName);

        // Always wrap FileReader in BufferedReader.
       BufferedReader bufferedReader = new BufferedReader(fileReader);

        while((line = bufferedReader.readLine() != null)) //??//error
        {
            System.out.println(line);
        }   

        // Always close files.
        bufferedReader.close();            
  
}
}

