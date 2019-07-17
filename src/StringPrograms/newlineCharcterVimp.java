package StringPrograms;

public class newlineCharcterVimp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.print("line1");
		System.out.print("line2");
		System.out.print("\nline3");// goes to newline
		System.out.print("\n");// goes to newline
		System.out.print("line4");
		System.out.print("\t line 5");// tab
		System.out.print("\r line 6 \r line 7 \b");//did it pressed enter line
		System.out.print("line8\n");
		
		//System.out.println("this is "inheritance"");//System.out.println("this is \'inheritance\'");
		System.out.println("this is \"inheritance\"");// this is "inheritance"
		
		System.out.println("this is 'ram' "); //ok -- this is 'ram'
		System.out.println("this is \'inheritance\'");// this is 'inheritance'
		
		System.out.println("this is\\path\\");// this is\path\
		//System.out.println("drivepath= E:\Selenium Guru 99\JAVA books");//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		
		System.out.println("drivepath= E:\\Selenium Guru 99\\JAVA books");// drivepath= E:\Selenium Guru 99\JAVA books
	}

}
