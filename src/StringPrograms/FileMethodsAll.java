package StringPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileMethodsAll {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		// creating
				/*File f = new File("D:\\qtp practise\\TestData\\temp.txt");	
			f.createNewFile();
			//note: again if run code, it overrides 

			Boolean fexists=f.exists();//true
			System.out.println("fexists="+fexists);

			File absolfile=f.getAbsoluteFile();//absolfile=D:\qtp practise\TestData\temp.txt
			System.out.println("absolfile="+absolfile);

			String absolpath=f.getAbsolutePath();// absolpath=D:\qtp practise\TestData\temp.txt
			System.out.println("absolpath="+absolpath);

			long getFreeSpace=f.getFreeSpace();
			System.out.println("getFreeSpace="+getFreeSpace);// getFreeSpace=3359825920
			//System.out.println("getFreeSpace="+getFreeSpace/(1024*1024*1024));//

			String getName=f.getName();
			System.out.println("getName="+getName);//getName=temp.txt

			String getPath=f.getPath();
			System.out.println("getPath="+getPath);//getPath=D:\qtp practise\TestData\temp.txt

			long getTotalSpace=f.getTotalSpace();
			System.out.println("getTotalSpace="+getTotalSpace);//getTotalSpace=104855834624

			long getUsableSpace=f.getUsableSpace();
			System.out.println("getUsableSpace="+getUsableSpace);//getUsableSpace=3359772672


			Boolean isDirectory=f.isDirectory();
			System.out.println("isDirectory="+isDirectory);// false

			Boolean  isFile=f.isFile();
			System.out.println("isFile="+isFile);// true

			Boolean isHidden=f.isHidden();// false
			System.out.println("isHidden="+isHidden);//

			Boolean isAbsolute=f.isAbsolute();
			System.out.println("isAbsolute="+isAbsolute);// true
				 */

				//f.delete();

				//	Boolean fexists=f.exists();
				//	System.out.println("fexists="+fexists);



				//	// writing
//				FileWriter w = new FileWriter("D:\\qtp practise\\TestData\\temp.txt");
//				BufferedWriter out = new BufferedWriter(w);


				//	out.write("hello we are writing in a file.");
				//	out.newLine();
				//	
				//	out.write("This is a new line-1.");	
				//	out.newLine();
				//	
				//	out.write("This is a new line-2.");
				//	out.write("This is a new line-3.");

				//	//how can we append data to file....??????
				//	 out.append("apppend1");// overwriting but not appending????
				//	 out.append("hi");	 
				//	
				// out.flush();// Note: if we dont write, writeing data is not flushed into file or writing operation not done into file

				//********************************************

				//	//reading
					FileReader r = new FileReader("D:\\qtp practise\\TestData\\temp.txt");
					BufferedReader bfr = new BufferedReader(r);	
					String x ="";
					
//			System.out.println("br1="+bfr.readLine());//line1
//			System.out.println("br2="+bfr.readLine()); //line2
//				System.out.println(bfr.readLine());//line3
//					//note: if file does not have data line1, it show display null value
				
				//*******
				System.out.println("br1="+bfr.readLine());//line1
				bfr.skip(2);// skip 2 charcers in new line

		System.out.println("br2="+bfr.readLine()); //  ne2  care: skip charcters
			System.out.println(bfr.readLine());//line3

				System.out.println("****************");
//					while(  (x = bfr.readLine()) != null)				
//					{
//						System.out.println(x);				
//						
//					}
						
					//ex:
//						while(  ( bfr.readLine()) != null)
//						{
//							
//								System.out.println(bfr.readLine());
////								line
////								null --??????? why null should come out of loop				
//						}
//						
						//
						int read=bfr.read();
						System.out.println("read="+read); // -1

	}

}
