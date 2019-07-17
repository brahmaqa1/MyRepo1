package DatePrograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class roughdate {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calendar calendar = Calendar.getInstance();
		 
		    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		    System.out.println(calendar.getTime());
		    System.out.println(dateFormat.format(calendar.getTime()));


	}

}
