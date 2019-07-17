package JavaFAQPart1;

public class JavaFAq1 {

	public static void main(String[] args) {
		//== used to compare values and to compare objects
		/*System.out.println(2==2);//true
		System.out.println("d"=="d"); //true
		System.out.println("brahma"=="brahma");//true
*/		
		///*************************************
		
	/*	String x="hello";
		String y="hello";
		String z="Hello" ;// case sensitive
		String p="Hello1";
		// == compare objects
		System.out.println(x==y);//true
		System.out.println(x==z);//false case sensitive
		//System.out.println(x=z);//Hello note:***********
	// equals -compare 2 objects only and inside object values	
	System.out.println(x.equals(y));//true
	System.out.println(x.equals(z));//false
*/	//******************************************************
	
	A a1=new A();
	A a2=new A();
	A a3=new A();
	a1.i=100;
	a2.i=100;
	a3.i=855;
	//a1=null;
	
	System.out.println(a1.i==a2.i);//true
	System.out.println(a1.i==a3.i);//false
	
	System.out.println(a1==a2);//objects //false Care:::a1 refers to ne wobj a2 refers the other new obj
	System.out.println(a1==a2);//false care
	a1=a2;// a1 refers where a2 points
	System.out.println(a1.equals(a2));//true
	

	}

}


class A
{
	int i;
}