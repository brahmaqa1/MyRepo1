package DatePrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException 
	{
		String s="31/12/2018";
		
	//	SimpleDateFormat sdf= new SimpleDateFormat(); // Exception in thread "main" java.text.ParseException: Unparseable date: "31/12/2018"
		//  always use date format in SimpleDateFormat() other iwse it throws ParseException
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY"); 
		// Note :import java.text.SimpleDateFormat;
		
		Date d= sdf.parse(s);// Convert string to date   ..Full format *Care:
		
		System.out.println("d="+d);	//d=Sun Dec 31 00:00:00 IST 2017	
		
		String s1= sdf.format(d);
		System.out.println(s1); // 31/12/2018

	}
}
