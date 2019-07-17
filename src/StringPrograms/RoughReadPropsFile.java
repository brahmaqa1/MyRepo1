package StringPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class RoughReadPropsFile {

	
	public static void main(String[] args) throws IOException {
		// D:\Selenium Softwares\ProjectsImp\JavaPrograms\customer.properties
//		
//		Properties props=new Properties();
//		
//		FileInputStream fis=new FileInputStream("D:\\Selenium Softwares\\ProjectsImp\\JavaPrograms\\customer.properties");
//		props.load(fis);
//		
//		System.out.println("custname="+props.getProperty("custname"));
//		System.out.println("city="+props.getProperty("city"));
//		System.out.println("state="+props.getProperty("state"));
//
//		custname=brahma
//				city=chennai
//				#comment
//				state=tn
		
		//*****************************************************
		//get directoty
		System.out.println("get proj directory="+System.getProperty("user.dir"));//proj folder name
		//get proj directory=D:\Selenium Softwares\ProjectsImp\JavaPrograms
		
		// D:\Selenium Softwares\ProjectsImp\JavaPrograms\src\ConfigFiles\allXpath.properties
		
        Properties props=new Properties();
		
		//FileInputStream fis=new FileInputStream("D:\Selenium Softwares\ProjectsImp\JavaPrograms\src\ConfigFiles\allXpath.properties");
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\ConfigFiles\\allXpath.properties");
		props.load(fis);
		
		System.out.println("custname="+props.getProperty("user"));
		System.out.println("city="+props.getProperty("pwd"));	
		/*custname=//input[name='username']
				city=//input[name='pwd']
*/	
		
		//************************
//		Properties allprops=System.getProperties();
//		int allpropscnt=allprops.size();
//		System.out.println("allpropscnt="+allprops);//54
//		
//		System.out.println("allpropscnt="+allprops(0).name);//
//		
//		//display all-.
//		for(i)
//		{
//			
//		}
				
		//********
		Set allprops=(Set) System.getProperties();//note:java.lang.ClassCastException: java.util.Properties cannot be cast to java.util.Set
				int allpropscnt=allprops.size();
				System.out.println("allpropscnt="+allprops);//54
				 Iterator  it=allprops.iterator();
		
		System.out.println("allpropscnt="+it.hasNext());//
		
		
		
		}
}

