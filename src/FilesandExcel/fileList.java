package FilesandExcel;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fileList {

	
	public static void main(String[] args)  throws IOException 
	{
		// TODO Auto-generated method stub
		
		//  D:\qtp practise
		
		//File fref=new File("D:\\qtp practise\\webapps");
		
		int count=0;
		Pattern p=Pattern.compile("[a-zA-Z0-9-$.]+[.]txt");
		File f=new File("D:\\qtp practise\\webapps");
		String[] s=f.list();
		for(String s1:s)
		{
			Matcher m=p.matcher(s1);
			if(m.find()&&m.group().equals(s1))
			{
				count++;
				System.out.println(s1);
			}
		}
		System.out.println(count);
	}
}
