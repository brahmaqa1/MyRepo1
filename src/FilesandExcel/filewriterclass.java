package FilesandExcel;

import java.io.FileWriter;
import java.io.IOException;

public class filewriterclass {
	public static void main(String args[]){  
		  try{  

			  String filename="D://qtp practise//TestData//confignewcreate.txt";
		   //FileWriter fw=new FileWriter(filename); 
		   
		   FileWriter fw=new FileWriter(filename,true);//Care:::appending mode
		   //if file not -it create new file
		  // FileWriter fw=new FileWriter(filename); //care 
		   
		   fw.write("my name is sachin");
		  // System.out.println("\n");//in console it \n
		  
		   fw.write("line3\r\n");//Care******enter a new line
		   fw.write("appends3");
		   fw.write("\r");//Care:: wont work
		   fw.write("write");
		   fw.write("\t");//press tab
		   fw.write("press tab \t");
		   fw.write("press tab\t");
		   fw.write("press tab\t");  
		   fw.write("press tab");   
		   fw.close();  
	  }

		catch(Exception e){System.out.println(e);}  
		  System.out.println("success");  
		 }  
		}  