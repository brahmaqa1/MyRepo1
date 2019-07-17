package StringPrograms;

public class StringBasic1 {
	public static void main(String[] args) {

		// object of string class is made
		String x= "hello how are you. Is is a good day.";
		//String c = new String("ssss sss");

		//				System.out.println(x.charAt(0));//h -char at index
		//				System.out.println(x.charAt(1));//e				
		//				System.out.println(x.charAt(10));// a  - 0,1,2....
		//				
		//				System.out.println("1st ocuurance of  given char"+x.indexOf('h'));  // 0 -index no of given char 1st occurnace
		//				System.out.println("1st ocuurance of  given char from index 0"+ x.indexOf('h',0));// 0 from index 0- get 1st ocuurance of char
		//				System.out.println(x.indexOf('h',1));// 6 index of given char after inddex =1
		//				//if given char is not theere, reurns -1 *******
		//				System.out.println(x.indexOf('z',1));//  -1 if not there

		/*	// index of given string
		 	// check welcome to username brahma
				System.out.println(x.indexOf("how")); //  6 
				System.out.println(x.indexOf("XXXXXXX")); // -1 if not there*****imp

				System.out.println(x.equals("hello"));//false   to compare content in String class obj
				System.out.println("hello".equals("hello"));// true

				System.out.println("get sub str from index 1 to endindex"+x.substring(1));//ello how are you. Is is a good day. from inde=1 to all charctes
				System.out.println("get sub str from index 0 to 2"+ x.substring(0, 3));// hel  care: from 0th index to  2 nd index
				System.out.println(x.substring(1, 7));// ello h  from index 1 to 6 
		 */


		// split
		/*System.out.println("**********************");
				String[] arr = x.split("o");
				// String[] arr = x.split("how");//Care: how wont be there

				for(int i=0 ; i< arr.length ; i++){
					System.out.println(arr[i]);
					hell   //care : o will not display******
					 h
					w are y
					u. Is is a g

					d day.
				}*/
					

		//				System.out.println("*********CONVERSION************");
		//				// conversion
						String y="1234";//get val from app as string if we use getattribute()
						//String y="1234A";// if str has char- throws error-noformatexception
			            //int i=y;//Type mismatch: cannot convert from String to int
						//int i=(int)y;// care: Cannot cast from String to int
						//note: when we get text from appl, it returns as string
						
						//care:  convert strn to int
		//				int a=Integer.parseInt(y);  //care:  convert strn to int
						//parseInt(y) -- static ethod
		//				System.out.println(a);// 1234
		//				
						////care:  convert int to string********
		//				String c=String.valueOf(a); //?????????//learn basic alos not understoood
		//				System.out.println(c); // 1234
		//**************************************
		/*
				String s ="Strings are immutable"; 
				s = s.concat(" all the time"); 

				System.out.println(s); // Strings are immutable all the time
				s = s.concat(" all the time").concat("2concat"); //care:  
				System.out.println(s);//Strings are immutable all the time all the time2concat
		 */

		/*String str1 ="Not immutable";
				String str2 ="Strings are immutable";
				StringBuffer strbuf =new StringBuffer("Not immutable");

				boolean result = str1.contentEquals( strbuf ); //true
				System.out.println(result); 

				result = str2.contentEquals( strbuf );//fALSE
				System.out.println(result);
		 */
		/*
				String Str=new String("This is really not immutable!!"); 
				boolean retVal; 
				retVal =Str.endsWith("immutable!!"); //True
				System.out.println("Returned Value = "+ retVal );

				retVal =Str.endsWith("immu"); //false
				System.out.println("Returned Value = "+ retVal );
		 */
		//*********************
		/*	String Str1=new String("This is really not immutable!!"); 
				String Str2=Str1;
				String Str3=new String("This is really not immutable!!"); 
				String Str4=new String("This IS REALLY NOT IMMUTABLE!!"); 
				boolean retVal; 
				retVal =Str1.equals(Str2); 
				System.out.println("Returned Value = "+ retVal ); 
				retVal =Str1.equals(Str3); 
				System.out.println("Returned Value = "+ retVal ); 

				retVal =Str1.equalsIgnoreCase(Str4);  //true
				System.out.println("Returned Value = "+ retVal );
		 */

		//************************************
		/*String Str=new String("Welcome to Tutorialspoint.com"); 
				System.out.print("Return Value :"); 
				System.out.println(Str.matches("(.*)Tutorials(.*)")); 

				System.out.print("Return Value :"); 
				System.out.println(Str.matches("Tutorials")); 

				System.out.print("Return Value :"); 
				System.out.println(Str.matches("Welcome(.*)"));
		 */

		//
		String Str=new String("Welcome to Tutorialspoint.com");
		System.out.print("Return Value :"); 
		System.out.println(Str.replace('o','T')); 
		System.out.print("Return Value :"); 
		System.out.println(Str.replace('l','D'));

		//
		//String Str=new String("Welcome-to-Tutorialspoint.com"); System.out.println("Return Value :"); for(String retval:Str.split("-",2)){ System.out.println(retval); } System.out.println(""); System.out.println("Return Value :"); for(String retval:Str.split("-",3)){ System.out.println(retval); } System.out.println(""); System.out.println("Return Value :"); for(String retval:Str.split("-",0)){ System.out.println(retval);




		//Str.toUpperCase()); 
		//lowercase - Str.toLowerCase());
		//tr.toString());
		//endswith
		//(Str.toCharArray()

		//Str.trim());


	}
}
