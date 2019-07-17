package AbstractClassProg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class testcProgran {


	public static void main(String[] args) throws IOException 
	{
		//  D:\Java Practise\TestData\SrcData
		//  D:\Java Practise\TestData\DestData		
	/*	File srcfile=new File("D:\\Java Practise\\TestData\\SrcData\\");//end \\*******
		File DestFile=new File("D:\\Java Practise\\TestData\\DestData\\");
		FileHandler.copy(srcfile, DestFile); //ok working
*/		
		//*************************
/*		File srcfile=new File("D:\\Java Practise\\TestData\\SrcData");//
		File DestFile=new File("D:\\Java Practise\\TestData\\DestData");
		FileHandler.copy(srcfile, DestFile);//ok 
		*/
		
	/*	//copy only specific file ***************************
		File srcfile=new File("D:\\Java Practise\\TestData\\SrcData\\sample.txt");//
		File DestFile=new File("D:\\Java Practise\\TestData\\DestData\\Samplenew.txt");
		FileHandler.copy(srcfile, DestFile);//ok
		*/
		
//ex:Copying files from the source to the 		destination directory based on filename suffix
		
		File srcfile=new File("D:\\Java Practise\\TestData\\SrcData");//
		File DestFile=new File("D:\\Java Practise\\TestData\\DestData");
		//FileHandler.copy(srcfile, DestFile, ".txt"); //ok
		
	/*	FileHandler.copy(srcfile, DestFile, ".xlsx");//ok
		//if already there it wont throw error
		FileHandler.copy(srcfile, DestFile, ".xls");
		FileHandler.copy(srcfile, DestFile, ".jpg");*/
		
		//new 
		FileHandler.copy(srcfile, DestFile, "1.txt"); //copy only test1.txt and test11.txt
		
		
	//ex3:Creating a directory	
		
	/*	File fldname=new File("D:\\Java Practise\\TestData\\DestData\\Folder1");
		FileHandler.createDir(fldname);//ok
		Boolean b=FileHandler.createDir(fldname);
		System.out.println("b="+b);//true if created
		//if already there , no error
*/		
	/*	File fldname=new File("D:\\Java Practise\\TestData\\DestData\\Folder2\\test.txt");//folder but not txt file
		FileHandler.createDir(fldname);//ok
		Boolean b=FileHandler.createDir(fldname);
		System.out.println("b="+b);*/
		
//Deleting a file or directory
		
	/*	boolean bf=FileHandler.delete(new File("D:\\Java Practise\\TestData\\DestData\\Folder2"));
		System.out.println("bf="+bf);//if not there no error		
		//return boolean
		
		//delete file 
		FileHandler.delete(new File("D:\\Java Practise\\TestData\\DestData\\Folder1\\test2.txt"));
		
		*/
		
		

	}

}
