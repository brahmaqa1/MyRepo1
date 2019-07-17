package JavaFAQPart1;

public class CharArrayStrngArrayDifference {	
	public static void main(String[] args) {
		//char array
	/*  char[] ch=new char[2];
	 // ch[0]="A";//care: char val must be enclosed in single quotes
	  ch[0]='A';
	  ch[1]='B';
	  // only 2 vlaues we can store  but not 3 values  0,1,2
	  ch[2]='c';//care error will come here //java.lang.ArrayIndexOutOfBoundsException: 2
	 // ch[3]='D';
	  System.out.println(ch[0]);//A
	 // System.out.println(ch[2]);//java.lang.ArrayIndexOutOfBoundsException: 2
*/	  
	  String[] s=new String [2];
	  s[0]="Ram";
	 // s[0]='ram';//error  Strng  val must be enclosed in dbl quotes
	  s[1]="Amar";
	  //s[2]="swathi";//error 
	  System.out.println("s[0]");
	  //care 
	  System.out.println(s[2]);//error Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	  
	  }
	}
