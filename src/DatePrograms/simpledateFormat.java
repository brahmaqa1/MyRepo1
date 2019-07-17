package DatePrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("Date = " +date); //Date = Tue Dec 18 22:06:16 IST 2018
		
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
	  //Convert date to String obj
	    String strDate = sdf.format(date);	    
	    System.out.println("formatted date in mm/dd/yy : " + strDate);//formatted date in mm/dd/yy : 12/06/15
	    
	    sdf = new SimpleDateFormat("dd/MM/yyyy");
	    strDate = sdf.format(date);
	    System.out.println("formatted date in dd/MM/yyyy : " + strDate);//formatted date in dd/MM/yyyy : 06/12/2015

	    sdf = new SimpleDateFormat("dd/mm/yyyy"); //   date // min //yyear
	    strDate = sdf.format(date);
	    System.out.println("formatted date in dd/mm/yyyy : " + strDate);
	 	    
	    sdf = new SimpleDateFormat("hh:mm:ss"); //   hours: mini: sec
	    strDate = sdf.format(date);
	    System.out.println("formatted date in hh:mm:ss : " + strDate); // 10:05:02
	    
	    
	    //******************
	}
}
