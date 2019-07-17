package StringPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropsfile {

	public static void main(String[] args) throws IOException {
		
		//1.create props file: Select Project> file > new > other> general> file
		// props file
		/*url=www.gmail.com
				pwd=mercury
						// # comment prop
				#DOB=01/07/1985  comment #				
	 */
				
		// slect props file> rt clcik> Properties option> copy location
		//D:\Selenium Softwares\Projects\JavaPrograms\src\StringPrograms\emp.properties
	//2.load and read	 props file
		Properties props=new Properties();
			//add \\
			File fref=new File("D:\\Selenium Softwares\\Projects\\JavaPrograms\\src\\StringPrograms\\emp.properties");		
			FileInputStream fis=new FileInputStream(fref);// file args
		props.load(fis);// fis args
		
		System.out.println("url="+props.getProperty("url"));
		System.out.println("pwd="+props.getProperty("pwd"));
		//if var not there., it displays null value
		System.out.println("adminname="+props.getProperty("admin"));//null Care*******
		
		//chk case sensitive 
		System.out.println("dob="+props.getProperty("DOB"));//null ony care if not found var in props file
		
		//current user dir
		//System.out.println("directory="+props.getProperty("user.dir"));//null care: we should use System.get
		//vimp
		System.out.println("dir="+System.getProperty("user.dir"));//dir=D:\Selenium Softwares\Projects\JavaPrograms currrent projevt folder name
	

	}
}
